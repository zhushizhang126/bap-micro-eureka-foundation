package com.supcon.springcloud.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/foundation")
public class FoundationController {

	@RequestMapping("/helloFoundation")
	public String helloFoundation(){
		return "helloFoundation";
	}
}
