package com.example.model;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ActorImpl {
	
	@Autowired
	private ActorService as;
	
	ArrayList<Actor> act=null;
	
	@GetMapping({"/", "/tutti"})
	public String getAll(Model mew) {
		System.out.println("SONO QUI!");
		act=(ArrayList<Actor>)as.findAll();
		mew.addAttribute("tutti", act);
		return "tutto";
	}
}
