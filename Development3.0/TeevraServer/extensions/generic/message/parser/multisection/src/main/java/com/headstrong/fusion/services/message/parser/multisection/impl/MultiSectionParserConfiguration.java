package com.headstrong.fusion.services.message.parser.multisection.impl;

import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.services.message.commons.config.parser.Binding;
import com.headstrong.fusion.services.message.commons.config.parser.SchemaDescriptor;

public class MultiSectionParserConfiguration {

	private String sectionHeaderIdentifier;
	private Integer sectionBodyLine;
	private boolean genericHeaderPresent;
	private Integer genericHeaderLine;
	private String genericHeaderIdentifier;
	private Map<String, String> delimiterMap = new HashMap<String, String>();
	private Map<String, SchemaDescriptor<? extends Binding>> bindingMap = new HashMap<String, SchemaDescriptor<? extends Binding>>();
	private boolean sectionHeaderPresent;
	private Integer sectionHeaderLine;
	private String genericHeaderOffset;
	private String sectionBodyIdentifier;
	private String configFileName;

	public String getSectionHeaderIdentifier() {
		return sectionHeaderIdentifier;
	}

	public void setSectionHeaderIdentifier(String sectionHeaderIdentifier) {
		this.sectionHeaderIdentifier = sectionHeaderIdentifier;
	}

	public Integer getSectionBodyLine() {
		return sectionBodyLine;
	}

	public void setSectionBodyLine(Integer sectionBodyLine) {
		this.sectionBodyLine = sectionBodyLine;
	}

	public boolean isGenericHeaderPresent() {
		return genericHeaderPresent;
	}

	public void setGenericHeaderPresent(boolean genericHeaderPresent) {
		this.genericHeaderPresent = genericHeaderPresent;
	}

	public Integer getGenericHeaderLine() {
		return genericHeaderLine;
	}

	public void setGenericHeaderLine(Integer genericHeaderLine) {
		this.genericHeaderLine = genericHeaderLine;
	}

	public String getGenericHeaderIdentifier() {
		return genericHeaderIdentifier;
	}

	public void setGenericHeaderIdentifier(String genericHeaderIdentifier) {
		this.genericHeaderIdentifier = genericHeaderIdentifier;
	}

	public Map<String, String> getDelimiterMap() {
		return delimiterMap;
	}

	public void setDelimiterMap(Map<String, String> delimiterMap) {
		this.delimiterMap = delimiterMap;
	}

	public Map<String, SchemaDescriptor<? extends Binding>> getBindingMap() {
		return bindingMap;
	}

	public void setBindingMap(
			Map<String, SchemaDescriptor<? extends Binding>> bindingMap) {
		this.bindingMap = bindingMap;
	}

	public boolean isSectionHeaderPresent() {
		return sectionHeaderPresent;
	}

	public void setSectionHeaderPresent(boolean sectionHeaderPresent) {
		this.sectionHeaderPresent = sectionHeaderPresent;
	}

	public Integer getSectionHeaderLine() {
		return sectionHeaderLine;
	}

	public void setSectionHeaderLine(Integer sectionHeaderLine) {
		this.sectionHeaderLine = sectionHeaderLine;
	}

	public String getGenericHeaderOffset() {
		return genericHeaderOffset;
	}

	public void setGenericHeaderOffset(String genericHeaderOffset) {
		this.genericHeaderOffset = genericHeaderOffset;
	}

	public String getSectionBodyIdentifier() {
		return sectionBodyIdentifier;
	}

	public void setSectionBodyIdentifier(String sectionBodyIdentifier) {
		this.sectionBodyIdentifier = sectionBodyIdentifier;
	}

	public String getConfigFileName() {
		return configFileName;
	}

	public void setConfigFileName(String configFileName) {
		this.configFileName = configFileName;
	}

	public String getDelimiter(String key) {
		return delimiterMap.get(key);
	}

	public SchemaDescriptor<? extends Binding> getBinding(String key) {
		return bindingMap.get(key);
	}


	public void addDelimiter(String key, String value) {
		delimiterMap.put(key, value);
	}

	public void addBinding(String key,
			SchemaDescriptor<? extends Binding> binding) {
		bindingMap.put(key, binding);
	}


}
