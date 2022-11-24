package com.vigilantex.log4jtut.controllers;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class MainController {

	
	 Logger logger=LogManager.getLogger(MainController.class);
	
	@GetMapping("/test")
	public void test() {
		logger.info("info");
		logger.error("error->er");
		logger.fatal("fatal-er");
		
	}
	
	
}
