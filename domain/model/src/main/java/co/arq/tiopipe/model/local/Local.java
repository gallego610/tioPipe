package co.arq.tiopipe.model.local;

import java.util.ArrayList;
import java.util.List;

import co.arq.tiopipe.model.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class Local {

	@NonNull
	private String id;
	@NonNull
	private String nombre;
	@NonNull
	private String region;
	@NonNull
	private String cuidad;
	@NonNull
	private String direccion;

	private List<Producto> productos;

	public List<Producto> getProductos() {
		if(productos == null) {
			productos = new ArrayList<Producto>();
		}
		return productos;
	}

	@Override
	public String toString() {
		String respuesta =  "Local [id=" + id + ", nombre=" + nombre + ", region=" + region + ", cuidad=" + cuidad + ", direccion="
				+ direccion + ", productos=" + productos.toString() + "]";
		return respuesta;
	}
	
	
	

}
