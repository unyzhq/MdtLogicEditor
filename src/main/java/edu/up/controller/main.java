package edu.up.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class main {
	@RequestMapping("/search")
	public void search(@RequestParam("string")String str) {
		System.out.println(str);
		
	}
}
