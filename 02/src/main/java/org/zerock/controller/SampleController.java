package org.zerock.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.zerock.domain.SampleDTO;
import org.zerock.domain.SampleDTOList;
import org.zerock.domain.TodoDTO;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/sample/*")
@Log4j
public class SampleController {

	@RequestMapping("")
	public void basic() {
		log.info("----------");
	}

	// @RequestMapping(value="/basic",method= {RequestMethod.GET,
	// RequestMethod.POST})
	@GetMapping("/basic")
	public void test1(SampleDTO dto) {
		log.info("get " + dto);
	}

	// http://localhost:8080/sample/basic1?ids=1&ids=2&ids=3
	@GetMapping("/basic1")
	public String test1(@ModelAttribute("ids") ArrayList<String> ids) {
		log.info("ids " + ids);
		return "sample/basic1";
	}

	// http://localhost:8080/sample/ex2?list%5B0%5D.name=x&list%5B2%5D.name=z
	@GetMapping("/ex2")
	public String ex2(SampleDTOList list) {
		log.info(list);
		return "sample/ex02";
	}

	// http://localhost:8080/sample/e3?title=x&duedate=2000/01/01
	@GetMapping("/e3")
	public String e3(TodoDTO todo) {
		log.info(todo);
		return "sample/ex03";
	}

	@GetMapping("/e4")
	public @ResponseBody SampleDTO e4() {
		SampleDTO dd = new SampleDTO();
		dd.setName("x");
		dd.setAge(5);

		return dd;
	}

	@GetMapping("/up")
	public void upl() {
		log.info("up");
	}

	@PostMapping("/uppost")
	public void uppo(ArrayList<MultipartFile> files) {
		files.forEach(file ->{
			log.info("name:"+file.getOriginalFilename());
			log.info("size: "+file.getSize());
		});
	}
}
