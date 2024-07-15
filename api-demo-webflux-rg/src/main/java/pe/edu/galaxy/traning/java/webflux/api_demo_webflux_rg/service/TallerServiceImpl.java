package pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.service;

import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.model.Taller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class TallerServiceImpl implements TallerService {
	
	private static List<Taller> talleres =  new ArrayList<>();
	
	static {
		
		talleres.add(Taller.builder()
				.id(1L)
				.nombre("Desplegando nuestra primera aplicación Serverless")
				.descripcion("Aprenderemos conceptos sobre serverless y como usarlo en nuestras aplicaciones")
				.fecha(LocalDate.now())
				.hora("19:30 (Perú)")
				.build());
		talleres.add(Taller.builder()
				.id(2L)
				.nombre("Aplicación Net 8 con Entity Framework")
				.descripcion("Desarrollo de un API Web con Net8 y Entityframework, aplicando"
						+ "un Code First en un CRUD básico, al finalizar este taller, tendrán"
						+ "una comprensión sólida de cómo desarrollar una API básica con Entity Framework Core"
						+ "y .NET 8 y estará equipados con la habilidades necesarias para empezar el programa")
				.fecha(LocalDate.now())
				.hora("20:00 (Perú)")
				.build());
		talleres.add(Taller.builder()
				.id(3L)
				.nombre("Desplegando nuestra primera API Reactiva")
				.descripcion("Aprenderemos conceptos sobre APIs Reactiva y como usarlo en nuestras aplicaciones")
				.fecha(LocalDate.now())
				.hora("19:30 (Perú)")
				.build());
		talleres.add(Taller.builder()
				.id(4L)
				.nombre("Aplicación Net 9 con Entity Framework")
				.descripcion("Desarrollo de un API Web con Net8 y Entityframework, aplicando"
						+ "un Code First en un CRUD básico, al finalizar este taller, tendrán"
						+ "una comprensión sólida de cómo desarrollar una API básica con Entity Framework Core"
						+ "y .NET 9 y estará equipados con la habilidades necesarias para empezar el programa")
				.fecha(LocalDate.now())
				.hora("20:00 (Perú)")
				.build());
		
	}

	@Override
	public Mono<Taller> getTaller(Integer id) {
		return Mono.just(talleres.get(id));
	}

	@Override
	public Flux<Taller> getTalleres() {
		return Flux.fromIterable(talleres).delayElements(Duration.ofSeconds(0));
	}
	

}
