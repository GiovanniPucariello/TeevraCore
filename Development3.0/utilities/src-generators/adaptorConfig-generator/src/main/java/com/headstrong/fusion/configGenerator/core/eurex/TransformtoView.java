package com.headstrong.fusion.configGenerator.core.eurex;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import com.headstrong.fusion.configGenerator.commObjs.FixMLConfigurationElement;
import com.headstrong.fusion.configGenerator.core.Transformer;
import com.headstrong.fusion.configGenerator.core.eurex.view.CounterResponseMappingsGenerator;
import com.headstrong.fusion.configGenerator.core.eurex.view.RequestMappingsGenerator;
import com.headstrong.fusion.configGenerator.core.eurex.view.ResponseMappingsGenerator;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Binding;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Field;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.ObjectFactory;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.Predicate;
import com.headstrong.fusion.configGenerator.viewObjects.eurex.StructField;

/**
 * Creates xml objects from the List of hash maps.
 * 
 * @author SGottemukkala
 */
@SuppressWarnings("unchecked")
public class TransformtoView implements Transformer {

	ObjectFactory objFactory;

		
	private List<Predicate> predicates;

	private String message;
	private static final String CHECK_REQUEST = "REQUEST";
	private static final String CHECK_RESPONSE = "RESPONSE";
	public static final String STR_COUNTER_RESPONSE = "COUNTER RESPONSE";
	MessageTypeEnum messageType;
	String sheetName;
	List<FixMLConfigurationElement> selectors;
	MappingsGenerator mappingsGenerator;
	
	/**
	 * @param predicateDataList
	 *            - List of two maps - each one of which has 3 maps again with
	 *            key as header and value as header map and so on
	 * @param messageType
	 *            - Request or Response
	 * @param sheetName
	 *            - Name of the sheet in the excel
	 * @param selectors
	 *            - Column name of the FIXML Tags
	 * @param parentStructureName
	 *            - Name of the parent structure
	 * @param i
	 */
	public TransformtoView(List<Map> predicateDataList, String messageType, String sheetName,
			List<FixMLConfigurationElement> selectors, String parentStructureName, String message) {
		this.messageType = MessageTypeEnum.fromString(messageType);
		this.sheetName = sheetName;
		this.message = message;
		this.objFactory = new ObjectFactory();
		this.selectors = selectors;
		this.mappingsGenerator = this.messageType.getMappingGenerator(sheetName, predicateDataList, selectors);
		this.predicates = createPredicates(predicateDataList, parentStructureName);
	}

	

	/**
	 * Creates the predicate object for the predicate part of the FIXML - each
	 * FIXML could have up to 4 predicates Two(FIXML to BO and BO to C - Request
	 * , C to BO and BO to FIXML - Response) for each of Options and Futures
	 * 
	 * @param i
	 * @param parentStructName
	 * @return
	 */
	private List<Predicate> createPredicates(List<Map> mappingsPair, String parentStructName) {
		List predicateList = new ArrayList();
		Predicate firstPredicate=null;
		Predicate secondPredicate=null;
		
		switch(messageType){
		case REQUEST:
			// create a mapping with the first element
			firstPredicate = mappingPredicate(parentStructName, "FIXML-BO");
			secondPredicate = bindingPredicate(parentStructName, "BO-STRUCT", mappingsPair.get(1));
			break;
		case COUNTER_RESPONSE:
			firstPredicate = bindingPredicate(parentStructName, "STRUCT-BO", mappingsPair.get(1));
			secondPredicate = mappingPredicate(parentStructName, "BO-FIXML");
			break;
		case RESPONSE:
			firstPredicate = bindingPredicate(parentStructName, "STRUCT-BO", mappingsPair.get(0));
			secondPredicate = mappingPredicate(parentStructName, "BO-FIXML");
		}
		predicateList.add(firstPredicate);
		predicateList.add(secondPredicate);
		return predicateList;
	}
	
	/**
	 * @param parentStructName
	 * @param string
	 * @return
	 */
	private Predicate mappingPredicate(String parentStructName, String string) {
		Predicate predicate = generateEmptyPredicate(parentStructName, string);
		predicate.setMappings(mappingsGenerator.createMappings());
		return predicate;
	}


	/**
	 * Return a bindingPredicate.
	 * @param parentStructName
	 * @param string
	 * @param maps
	 * @return
	 */
	private Predicate bindingPredicate(String parentStructName, String string, Map maps) {
		Predicate predicate = generateEmptyPredicate(parentStructName, string);
		predicate.setBinding(createBindings(maps));
		return predicate;
	}

	/**
	 * Create an empty predicate.
	 * @param parentStructName
	 * @param mapType
	 * @return
	 */
	private Predicate generateEmptyPredicate(String parentStructName, String mapType) {
		Predicate predicate = objFactory.createPredicate();
		predicate.setMapType(mapType);
		predicate.setMessageType(message);
		predicate.setStructName(parentStructName);
		return predicate;
	}



	

	/**
	 * Creates bindings object for FIXML. Bindings is for BO to C - Request and
	 * C to BO - Response
	 * 
	 * @param boTOC
	 * 
	 * @return
	 */
	private Binding createBindings(Map<String, Map> boTOC) {
		Binding binding = objFactory.createBinding();
		List<Map> boToCList = new ArrayList<Map>();
		for (Map value : boTOC.values()) {
			boToCList.add(value);
		}
		switch(messageType) {
		case REQUEST:
			for (Map<String, String> fieldToStructMap : boToCList) {
				for (Entry<String, String> e : fieldToStructMap.entrySet()) {
					binding.getField().add(createField(e.getKey(), e.getValue()));
				}
			}
		break;
		default:
			for (Map<String, String> fieldToStructMap : boToCList) {
				Set<String> starredEntries = collectStarredEntries(binding, fieldToStructMap);
				for (String starredEntry : starredEntries) {
					binding.getField().add(createField(starredEntry, starredEntry));
				}
			}
			break;
		}
		return binding;
	}



	/**
	 * @param binding
	 * @param fieldToStructMap
	 * @return
	 */
	private Set<String> collectStarredEntries(Binding binding, Map<String, String> fieldToStructMap) {
		Set<String> starredEntries = new HashSet();
		for (Entry<String, String> e : fieldToStructMap.entrySet()) {
			if (!e.getValue().matches(".*['*'][1-9]")) {// matches gutSts*1 pattern
				binding.getField().add(createField(e.getValue(), e.getKey()));
			} else {
				String value = e.getValue().substring(0, e.getValue().indexOf("*"));
				starredEntries.add(value);
			}
		}
		return starredEntries;
	}

	/**
	 * Creates the field object under binding(similar to map object under
	 * mappings)
	 * 
	 * @param key
	 * @return
	 */
	private Field createField(String fieldName, String structureField) {
		Field field = objFactory.createField();
		fieldName = removeBracketInformation(fieldName);
		structureField = removeBracketInformation(structureField);
		field.setName(fieldName);
		StructField structField = createStructField(structureField);
		field.setStructField(structField);
		return field;
	}

	/**
	 * Creates the StructField object under Field
	 * 
	 * @param value
	 * @return
	 */
	private StructField createStructField(String value) {
		StructField structField = objFactory.createStructField();
		structField.setContent(value);
		return structField;
	}

	/**
	 * Remove brackets and stuff within it from a string.
	 * @param key
	 * @return
	 */
	private String removeBracketInformation(String key) {
		return MappingsGenerator.removeBracketEnclosure(key);
	}

	
	/**
	 * @return the predicates
	 */
	public List<Predicate> getPredicates() {
		return predicates;
	}

	enum MessageTypeEnum {
		REQUEST {
			public MappingsGenerator getMappingGenerator(String sheetName,List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
				return new RequestMappingsGenerator(sheetName, mappingsPair, selectors);
			}
		},
		RESPONSE {
			public MappingsGenerator getMappingGenerator(String sheetName,List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
				return new ResponseMappingsGenerator(sheetName, mappingsPair, selectors);
			}
		},
		COUNTER_RESPONSE {
			public MappingsGenerator getMappingGenerator(String sheetName,List<Map> mappingsPair, List<FixMLConfigurationElement> selectors) {
				return new CounterResponseMappingsGenerator(sheetName, mappingsPair, selectors);
			}
		};

		/**
		 * Returns an enum from possible messageTypes.
		 */
		public static MessageTypeEnum fromString(String str) {
			if (STR_COUNTER_RESPONSE.equals(str)) {
				return COUNTER_RESPONSE;
			} else if (str.contains(CHECK_REQUEST)) {
				return REQUEST;
			} else {
				return RESPONSE;
			}
		}

		public abstract MappingsGenerator getMappingGenerator(String sheetName, List<Map> mappingsPair,List<FixMLConfigurationElement> selectors);
	}
}
