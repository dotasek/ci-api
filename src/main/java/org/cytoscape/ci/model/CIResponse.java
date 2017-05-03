package org.cytoscape.ci.model;

import java.util.List;

/**
 * 
 * @author davidotasek
 *
 * @param <T>
 */
public class CIResponse<T> {
	public T data;
	public List<CIError> errors;
}
