package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class calculatorController {

	@RequestMapping("/minus")
	public double minus (double Tal1, double Tal2){
		return Tal1 - Tal2;
	}
	@RequestMapping("/multi")
	public double multi (double Tal1, double Tal2){
		return Tal1 * Tal2;
	}
	@RequestMapping("/div")
	public double div (double Tal1, double Tal2){
		return Tal1 / Tal2;
	}
	@RequestMapping("/add")
	public double add (double Tal1, double Tal2){
		return Tal1 + Tal2;
	}
}
