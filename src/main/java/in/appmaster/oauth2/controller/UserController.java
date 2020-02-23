package in.appmaster.oauth2.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api/user")
public class UserController {
	
	@GetMapping("/me")
	public String echoTheUsersEmailAddress(Principal principal) {
	   return "Hey there! Your email address is: " + principal.getName();
	}



}
