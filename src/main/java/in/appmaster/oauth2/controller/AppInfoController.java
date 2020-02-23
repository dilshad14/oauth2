package in.appmaster.oauth2.controller;

import java.net.http.HttpResponse;
import java.security.Principal;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/info")
public class AppInfoController {
	
	@GetMapping("/server")
	public HttpEntity<Object> echoTheUsersEmailAddress(Principal principal) {
	   return new ResponseEntity(System.getProperties(),HttpStatus.OK);
	}
}
