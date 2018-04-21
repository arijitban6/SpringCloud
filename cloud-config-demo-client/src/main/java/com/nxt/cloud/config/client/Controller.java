package com.nxt.cloud.config.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	 
	@Value("${active-profile}") String activeProfile;
	  
	  @GetMapping("/lucky-word")
	  public String activeProvileWord() {
	    return "The activated profile is: " + activeProfile;
	  }
}
