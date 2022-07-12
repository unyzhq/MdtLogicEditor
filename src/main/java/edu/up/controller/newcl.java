package edu.up.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class newcl {
	@RequestMapping("/help")
	public void help() {
		System.out.println("help!");
		
	}
}
