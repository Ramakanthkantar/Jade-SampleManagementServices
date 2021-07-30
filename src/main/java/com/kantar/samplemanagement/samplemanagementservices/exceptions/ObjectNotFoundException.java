package com.kantar.samplemanagement.samplemanagementservices.exceptions;
public class ObjectNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = 4620952515662818311L;
	
	public Class<?> objectClass;
	
	public ObjectNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	
	public ObjectNotFoundException(String message) {
	    super(message);
	}
	
	/**
	 * The class of the object that was not found. Contains the
	 * interface-class of the activiti-object that was not found.
	 */
	public Class<?> getObjectClass() {
		return objectClass;
	}
}