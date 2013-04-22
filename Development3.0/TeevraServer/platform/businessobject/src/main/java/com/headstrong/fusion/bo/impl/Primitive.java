/*
 * The information in this document is subject to change without notice and 
 * does not represent a commitment by Headstrong Corporation. The software 
 * and/or databases described in this document are furnished under a license 
 * agreement and may be used or copied only in accordance with the terms of 
 * the agreement. 
 * 
 * Copyright © 2008 Headstrong Corporation
 * All rights reserved.
 * 
 * $Id: Primitive.java
 * $Revision: 
 * $Author: Ssoni
 * $DateTime: Nov 12, 2008 
 */

package com.headstrong.fusion.bo.impl;

import java.math.BigDecimal;

/**
 * 
 */
public enum Primitive {
	LONG {
		@Override
		public Object eval(Object data) throws Exception {
			Long value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Long(0);
					} else {
						value = Long.parseLong((String) data);
					}
				} else if (data instanceof Long) {
					value = (Long) data;
				} else if (data instanceof Integer) {
					value = ((Integer) data).longValue();
				}

				else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	DOUBLE {
		@Override
		public Object eval(Object data) throws Exception {
			Double value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Double(0);
					} else {
						value = Double.parseDouble((String) data);
					}
				} else if (data instanceof Double) {
					value = (Double) data;
				} else if (data instanceof BigDecimal) {
					value = ((BigDecimal) data).doubleValue();
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	INTEGER {
		@Override
		public Object eval(Object data) throws Exception {
			Integer value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Integer(0);
					} else {
						value = Integer.parseInt((String) data);
					}
				} else if (data instanceof Integer) {
					value = (Integer) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	BOOLEAN {
		@Override
		public Object eval(Object data) throws Exception {
			Boolean value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = false;
					} else {
						value = Boolean.valueOf((String) data);
					}
				} else if (data instanceof Boolean) {
					value = (Boolean) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	FLOAT {
		@Override
		public Object eval(Object data) throws Exception {
			Float value = null;
			if (data != null) {
				if (data instanceof String) {
					if (((String) data).isEmpty()) {
						value = new Float(0);
					} else {
						value = Float.valueOf((String) data);
					}
				} else if (data instanceof Float) {
					value = (Float) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	SHORT {
		@Override
		public Object eval(Object data) throws Exception {
			Short value = null;
			if (data != null) {
				if (data instanceof String) {                         //changed from short to string
					if (((String) data).isEmpty()) {
						value = new Short("0");
					} else {
						value = Short.valueOf((String) data);
					}
				} else if (data instanceof Short) {
					value = (Short) data;
				} else {
					throw new Exception("Unsupported data type "
							+ data.getClass());
				}
			}
			return value;
		}
	},
	STRING {
		@Override
		public Object eval(Object data) throws Exception {
			return data;
		}
	};
	public abstract Object eval(Object data) throws Exception;
}
