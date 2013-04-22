/**
 * 
 */
package com.tfp.interfaces;

/**
 * This file is provided by MCH team for TFP integration.
 * 
 * UserAttribute <K,V> interface
 * @author clao
 * @author jreformado
 *
 * @param <K> name
 * @param <V> value
 */
public interface UserAttribute<K, V> {

	/**
	 * Get name method
	 * @return name
	 */
	public K getName();

	/**
	 * Get value method
	 * @param name
	 * @return value
	 */
	public V getValue(K name);

	/**
	 * Set name method 
	 * @param name
	 */
	public void setName(K name);

	/**
	 * Set value method
	 * @param value
	 */
	public void setValue(V value);

}
