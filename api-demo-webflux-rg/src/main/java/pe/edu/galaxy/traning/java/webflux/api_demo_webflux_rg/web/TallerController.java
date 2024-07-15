package pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.thymeleaf.spring6.context.webflux.IReactiveSSEDataDriverContextVariable;
import org.thymeleaf.spring6.context.webflux.ReactiveDataDriverContextVariable;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.service.TallerService;

@RequiredArgsConstructor
@Controller
public class TallerController {
	
	private final TallerService tallerService;

	@RequestMapping("/")
	public String index(final Model model) {

		// Reactivo
		// carga 1 y muestra 1, stream data y data driven mode.
		
		IReactiveSSEDataDriverContextVariable irddcv = new ReactiveDataDriverContextVariable(tallerService.getTalleres(),1);

		model.addAttribute("talleres", irddcv);

		// clasico
		//model.addAttribute("talleres", tallerService.getAll());

		return "index";

	}
	
}
