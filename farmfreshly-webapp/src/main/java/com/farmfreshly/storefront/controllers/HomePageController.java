package com.farmfreshly.storefront.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.farmfreshly.core.model.SampleResponse;
import com.farmfreshly.core.service.TestService;

@Controller
public class HomePageController {
	@Autowired
    private TestService testService;
 
    @RequestMapping(value = "/hello/{message}", method = RequestMethod.GET)
    public @ResponseBody SampleResponse sayHello(@PathVariable String message) {
        return testService.sayHello(message);
    }

}
