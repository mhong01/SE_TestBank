package testbank.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;

@Controller
public class CourseController implements ErrorController{

	@Override
	public String getErrorPath() {
		return "/error";
	}

	
	
}
