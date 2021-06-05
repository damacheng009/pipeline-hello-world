package com.zz.itsm;

import org.springframework.web.bind.annotation.*;


@RestController
public class ServiceAController {

	@GetMapping("check")
	public String sayHello() {
		return "{'msg': 'hello-new-commit'}";
	}


}