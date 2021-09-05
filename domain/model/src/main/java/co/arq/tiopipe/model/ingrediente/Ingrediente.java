package co.arq.tiopipe.model.ingrediente;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Ingrediente {

	private String id;
	private String nombre;
	private String costo;

}
