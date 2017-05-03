package org.cytoscape.ci;

import java.net.URI;

import org.cytoscape.ci.model.CIError;

public interface CIErrorFactory {
	public CIError getCIError(Integer status, String type, String message, URI link);
}
