package com.toa.webservices.restfulwebservices.controller;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordController {

	@Autowired
	private MessageSource messageResource;

	@GetMapping("/hello-word")
	public String sayHello() {
		return "Hello Word!";
	}

	@GetMapping("/hello-word-internationalizing")
	public String helloWordInternationalizing(
			@RequestHeader(name = "Accept-Language", required = false) Locale locale) {
		return messageResource.getMessage("good.moring.message", null, locale);
	}
}
