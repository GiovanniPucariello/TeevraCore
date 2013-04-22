package com.headstrong.fusion.configGenerator.core;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import com.headstrong.fusion.configGenerator.core.eurex.GeneratorProcessorForEurex;
import com.headstrong.fusion.configGenerator.core.euronext.GeneratorProcessorForEuroNext;
import com.headstrong.fusion.configGenerator.core.liffe.GeneratorProcessorForLiffe;

/**
 * Creates a generator processor based on the system.
 * 
 */
public class GeneratorProcessorFactory {

	@SuppressWarnings("unchecked")
	private static Map<Module, Class> processorClass = new HashMap<Module, Class>();

	static {
		addProcessor(Module.Liffe, GeneratorProcessorForLiffe.class);
		addProcessor(Module.Euronext, GeneratorProcessorForEuroNext.class);
		addProcessor(Module.Eurex, GeneratorProcessorForEurex.class);
	}

	/**
	 * Returns the processor based on {@link Module}.
	 * 
	 * @param module
	 *            {@link Module} Liffe/Euronext/Eurex
	 * @param properties
	 * @return
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@SuppressWarnings("unchecked")
	public static GeneratorProcessor getProcessor(Module module)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, InstantiationException,
			IllegalAccessException, InvocationTargetException {
		Class clazz = processorClass.get(module);
		return (GeneratorProcessor) clazz.newInstance();
	}

	@SuppressWarnings("unchecked")
	protected static void addProcessor(Module system, Class clazz) {
		processorClass.put(system, clazz);
	}

	/**
	 * Liffe/Euronext/Eurex
	 * 
	 */
	public enum Module {
		Liffe, Eurex, Euronext
	}
}
