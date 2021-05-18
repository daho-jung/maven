package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/board/*")
@Log4j
public class BoardController {

	@RequestMapping("/")
	public String p() {
		log.info("main");
		return "board";
	}
	@RequestMapping("/list")
	public void list() {
		log.info("l");
	}
	@RequestMapping("/insert")
	public void insert() {
		log.info("i");
	}
}
