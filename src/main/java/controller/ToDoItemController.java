package controller;

import java.time.Instant;
import java.time.ZoneId;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import repository.ToDoRepo;

@RestController

public class ToDoItemController {
	
	private final Logger logger= LoggerFactory.getLogger(ToDoItemController.class);
	
	@Autowired
	ToDoRepo toDoRepo;
	
	@GetMapping("/api")
	public String home() {
		return "welcome home";
	}
	
	@GetMapping("/todo")
    public ModelAndView index() {
        logger.debug("request to GET index");
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("todoItems", toDoRepo.findAll());
        modelAndView.addObject("today", Instant.now().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek());
        return modelAndView;
    }

}
