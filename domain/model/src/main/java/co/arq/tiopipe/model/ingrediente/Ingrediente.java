package co.arq.tiopipe.model.ingrediente;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Ingrediente {

	private String id;
	private String nombre;
	private BigDecimal costo;

	@Override
	public String toString() {
		return "\n\n\t\t Nombre=" + nombre + "\n\t\t Costo=" + costo;
	}

}
