/**
 * 
 */
package com.myjavablog.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author anup
 *
 */

@Controller
public class HomeController {

	@RequestMapping(value="/", method =RequestMethod.GET)
	public String getHomePage() {
		System.out.println("asdasdasdada");
		return "index";
	}
	
}
