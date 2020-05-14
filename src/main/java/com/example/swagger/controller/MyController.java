package com.example.swagger.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/start")
public class MyController {
	
	@GetMapping("/home")
	@ApiOperation(value = "Shows word: home",
				  notes = "Returns only one String object: word")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home2")
	public String home2() {
		return "home2";
	}
	
	@PostMapping("/home3")
	public String home3(@ApiParam(value = "Home id") @RequestBody Integer id) {
		return "home" + id;
	}

}
