package IFRN.PI.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexControler {

	   @RequestMapping("/")
	   public String index() {
		   System.out.println("chamou o método index");
		   return "home";
	   }
}
