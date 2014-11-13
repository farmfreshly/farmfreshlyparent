package com.farmfreshly.core.service.impl;

import com.farmfreshly.core.model.SampleResponse;
import com.farmfreshly.core.service.TestService;

public class TestServiceImpl implements TestService {

	@Override
	public SampleResponse sayHello(String message) {
		return new SampleResponse("Aloha from farmfreshly  " + message,
				"SUCCESS");

	}

}
