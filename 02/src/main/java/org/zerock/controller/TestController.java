package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class TestController {

	@RequestMapping("/test1")
	public String test1() {
		log.info("asdf");
		return "test1";
	}
	@RequestMapping("/test2")
	public void test2() {
		log.info("asd123f");
	}
}
