package co.arq.tiopipe.api;

import java.util.Iterator;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.arq.tiopipe.model.producto.Producto;
import co.arq.tiopipe.usecase.consultarplatos.ConsultarPlatosUseCase;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
@AllArgsConstructor
@Component
public class ApiRest {

	private final ConsultarPlatosUseCase consultarPlatosUseCase;

	@GetMapping(path = "/health")
	public String health() {
		return "Hello World...........";
	}

	/**
	 * Metodos expuesto para listar los platos ofrecidos por un Local
	 * 
	 * @param id identificador del local
	 * @return lista de platos ofrecidos por el local
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/listPlatos/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> listaPlatos(@PathVariable(name = "id") String id) {
		List<Producto> res = consultarPlatosUseCase.consultarListaPlatos(id);
		String respuesta = "";
		for (Iterator iterator = res.iterator(); iterator.hasNext();) {
			Producto producto = (Producto) iterator.next();
			respuesta += producto.toString();
		}
		respuesta = StringUtils.isEmpty(respuesta)?"Sin resultados":respuesta;		
		return ResponseEntity.ok(respuesta);
	}

	/**
	 * 
	 * Metodos expuesto para listar los insumos ofrecidos por un Local
	 * 
	 * @param id identificador del local
	 * @return lista de insumos ofrecidos por el local
	 */
	@SuppressWarnings("rawtypes")
	@GetMapping(path = "/listIngredientes/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> listaIngredientes(@PathVariable(name = "id") String id) {
		List<Producto> res = consultarPlatosUseCase.consultarListaInsumos(id);
		String respuesta = "";
		for (Iterator iterator = res.iterator(); iterator.hasNext();) {
			Producto producto = (Producto) iterator.next();
			respuesta += producto.toString();
		}
		respuesta = StringUtils.isEmpty(respuesta)?"Sin resultados":respuesta;
		return ResponseEntity.ok(respuesta);
	}

	@GetMapping(path = "/ventasMes")
	public String ventasMes() {
//      return useCase.doAction();
		return "Hello World...........";
	}

	@GetMapping(path = "/consultaFactura")
	public String consultaFactura() {
//      return useCase.doAction();
		return "consultaFactura";
	}

}
