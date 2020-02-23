package in.appmaster.oauth2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

	
	@GetMapping("/")
	public String greet() {
		return "Hey there! Weclome to Home";
	}
	
	@GetMapping("/login")
	public String login() {
		return "at login API!!!";
	}
	
	
	
	@GetMapping("/error")
	public String error() {
		return "Some Error occured....!!!";
	}

}
