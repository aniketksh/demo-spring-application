package com.demoapplication.handler;


import java.util.Collections;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.demoapplication.ApiGatewayResponse;
import com.demoapplication.LoadProperties;

public class GetPropertiesHandler implements RequestHandler<Map<String, Object>, ApiGatewayResponse> {
	
	private static final Logger logger = LogManager.getLogger(GetPropertiesHandler.class);
	
	@Override
	public ApiGatewayResponse handleRequest(Map<String, Object> input, Context context) {
		try {
			LoadProperties loadProperties =  new LoadProperties();
	        return ApiGatewayResponse.builder()
	    				.setStatusCode(200)
	    				.setObjectBody(loadProperties.listProperties())
	    				.setHeaders(Collections.singletonMap("X-Powered-By", "AWS Lambda & Serverless"))
	    				.build();
	    } catch (Exception ex) {
	    	logger.error("Error in listing products: " + ex);
	    }
		return null;
	}
}