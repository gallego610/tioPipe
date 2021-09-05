package co.arq.tiopipe.model.local;
import java.util.List;

import co.arq.tiopipe.model.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Local {
	
	private String id;
	private String nombre;
	private String region;
	private String cuidad;
	private String direccion;
	private List<Producto> productos;
	
}
