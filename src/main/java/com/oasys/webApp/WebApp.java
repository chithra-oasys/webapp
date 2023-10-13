package com.oasys.webApp;

import org.springframework.web.bind.annotation.GetMapping;

public class WebApp {
	@GetMapping(value = "/dev")
	public String getMsg() {
		return "successful";
	}
}
