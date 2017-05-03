package org.cytoscape.ci;

import javax.ws.rs.WebApplicationException;

import org.cytoscape.ci.model.CIError;

public interface CIExceptionFactory {
	public WebApplicationException getCIException(int httpStatus, CIError[] errors);
	public <K> WebApplicationException getCIException(int httpStatus, K data, CIError[] errors);
}
