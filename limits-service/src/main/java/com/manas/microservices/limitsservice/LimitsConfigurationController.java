/**
 * 
 */
package com.manas.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manas.microservices.limitsservice.bean.LimitConfiguration;

/**
 * @author Manas
 *
 */
@RestController
public class LimitsConfigurationController {
	
	@Autowired
	Configuration configuration;
	
	@GetMapping("/limits")
	public LimitConfiguration retrieveLimitsFromConfigrations(){
		return new LimitConfiguration(configuration.getMinimum(), configuration.getMaximum());
	}
}
