package com.mycom.mycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycom.service.MediService;

import lombok.AllArgsConstructor;

@Controller
@RequestMapping("/medi/*")
@AllArgsConstructor
public class MediController {
	
	private MediService service;
	
	@GetMapping("/reg")
	public void reg() {
		service.register();
	}
	
}
