package controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ToDoItemController {
	
	private final Logger logger= LoggerFactory.getLogger(ToDoItemController.class);
	
	@GetMapping("/")
    public ModelAndView index() {
        logger.debug("request to GET index");
        ModelAndView modelandView = new ModelAndView("index");
        return modelandView;
    }

}
