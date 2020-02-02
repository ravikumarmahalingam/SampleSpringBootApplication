package com.paypal.appProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppProperties {

	@Autowired
	Environment env;
	
	@Value("${streetName}")
	private String streetName;
	
	@RequestMapping(method = RequestMethod.GET, value="/")
	public void getProperties() {
		System.out.println("Name value in app.properties:::" + env.getProperty("name"));
		System.out.println("Value of the streetName in the AppProperties:::" + streetName);
	}
}
