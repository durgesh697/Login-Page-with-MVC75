package com.dt.mvc;

import java.util.Map;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes
public class LoginController {
	@Autowired
	private UserValidator userValidator;

//	@RequestMapping(value = "/verifyUser", method = RequestMethod.POST)
	@RequestMapping(value = "/verifyUser")

	public String verifyUser(@ModelAttribute("user") User user, BindingResult result) {
		System.out.println("verifyUser");
		userValidator.validate(user, result);
		if (result.hasErrors()) {
			System.out.println(result.getErrorCount());
			return "login";
		}
		// User user = (User)command;
		String un = user.getUsername();
		String pw = user.getPassword();
		System.out.println(un);
		System.out.println(pw);
	System.out.println("DONE");
	if (!un.equals(pw)) {
			return "login";

		}

		return "home";

	}

	@RequestMapping("/login")
	public String showLoginForm(Map model) throws ServletException {
		System.out.println("showLoginForm");
		User user = new User();
		user.setUsername("DT");
		model.put("user", user);

		return "login";
	}
}
