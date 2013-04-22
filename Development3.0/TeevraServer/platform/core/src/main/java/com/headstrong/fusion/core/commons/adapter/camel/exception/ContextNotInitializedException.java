package com.headstrong.fusion.core.commons.adapter.camel.exception;

/**
 * Thrown if the {@link BundleContextManager} is not initialized
 */
public class ContextNotInitializedException extends RuntimeException {

	private static final long serialVersionUID = 4423941217681556812L;

	public ContextNotInitializedException() {
		super();
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            The error message.
	 * @param cause
	 *            The exception instance to get more details about the instance.
	 */
	public ContextNotInitializedException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Constructor
	 * 
	 * @param message
	 *            The error message.
	 */
	public ContextNotInitializedException(String message) {
		super(message);
	}

	/**
	 * Constructor
	 * 
	 * @param cause
	 *            The exception instance to get more details about the instance.
	 */
	public ContextNotInitializedException(Throwable cause) {
		super(cause);
	}
}
