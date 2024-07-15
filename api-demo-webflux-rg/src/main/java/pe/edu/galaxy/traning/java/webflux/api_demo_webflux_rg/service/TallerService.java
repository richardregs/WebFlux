package pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.service;

import pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.model.Taller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface TallerService {
	
	public Mono<Taller> getTaller(Integer id);
	public Flux<Taller> getTalleres();

}
