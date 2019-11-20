package controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestBankController {
	@RequestMapping("/")
    public String index() {
        return "index";
    }
	
	

}
