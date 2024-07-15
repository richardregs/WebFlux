package pe.edu.galaxy.traning.java.webflux.api_demo_webflux_rg.model;

import java.io.Serializable;
import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Taller implements Serializable {
	
	private static final long serialVersionUID=1L;
	private Long id;
	private String nombre;
	private String descripcion;
	private LocalDate fecha;
	private String hora;

}
