package com.my.test.webdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @RequestMapping("/webdemo")
    String webdemo() {
    	return "hello,webdemo!";
    }
	
	
}
