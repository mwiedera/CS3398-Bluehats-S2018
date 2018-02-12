package com.backend;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

    @RequestMapping("/")
    String home() {
        return "Hello World!";
    }
}



	/*
	@RequestScope
	@Component
	public class LoginAction {
	    // ...
	}

	@SessionScope
	@Component
	public class UserPreferences {
	    // ...
	}

	@ApplicationScope
	@Component
	public class AppPreferences {
	    // ...
	}
	*/

