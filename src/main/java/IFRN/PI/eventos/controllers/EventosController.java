package IFRN.PI.eventos.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import IFRN.PI.eventos.models.Evento;

@Controller
public class EventosController {

	
	@RequestMapping("/eventos/form")
	public String form() {
		return "formEvento";
	}
	
		@RequestMapping("/eventos/form/guardar")
		public String guardar(Evento evento) {
		
			System.out.println("Os dados guardados");
			System.out.println("Nome" + evento.getNome());
			System.out.println("Local" + evento.getLocal());
			System.out.println("Data" + evento.getData());
			System.out.println("Horario" + evento.getHorario());
			return "guardar";
			
		
		
	}
	
}
