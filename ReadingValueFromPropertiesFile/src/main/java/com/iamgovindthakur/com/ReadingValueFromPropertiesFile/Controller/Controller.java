package com.iamgovindthakur.com.ReadingValueFromPropertiesFile.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iamgovindthakur.com.ReadingValueFromPropertiesFile.Config.Config;
import com.iamgovindthakur.com.ReadingValueFromPropertiesFile.Model.LimitService;

@RestController
public class Controller {

	@Autowired
	private Config config;

	@GetMapping()
	public LimitService listService() {
		LimitService lm = new LimitService(config.getMin(), config.getMax());
		return lm;
	}

}
