package pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.model.Taller;
import pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.service.TallerService;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
@RestController
@RequestMapping("/v1/talleres")
public class TallerRest {
	
	private final TallerService tallerService;
	
	@GetMapping("/{id}")
	public Mono<Taller> getTalleres(@PathVariable("id") Integer id){
		return tallerService.getTaller(id);
	}
	
	@GetMapping
	public Flux<Taller> getTalleres(){
		return tallerService.getTalleres();
	}
	
}
