package co.arq.tiopipe.model.producto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import co.arq.tiopipe.model.ingrediente.Ingrediente;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Producto extends Ingrediente {

	public Producto(String id, String nombre, BigDecimal costo) {
		super(id, nombre, costo);
	}

	/**
	 * @param id
	 * @param nombre
	 * @param costo
	 * @param especial
	 * @param insumo
	 * @param ingredientes
	 */
	public Producto(String id, String nombre, BigDecimal costo, boolean especial, boolean insumo,
			List<Ingrediente> ingredientes) {
		super(id, nombre, costo);
		this.especial = especial;
		this.insumo = insumo;
		this.ingredientes = ingredientes;
	}
	
	private boolean especial;
	
	private boolean insumo;

	private List<Ingrediente> ingredientes;

	public List<Ingrediente> getIngredientes() {
		if (ingredientes == null) {
			ingredientes = new ArrayList<Ingrediente>();
		}
		return ingredientes;
	}

	@Override
	public String toString() {
		return "\nProducto: \n \t" + (especial ? "Plato Típico" : "Plato común") + "\n\tNombre=" + this.getNombre()
				+ "\n\tCosto=" + this.getCosto() + "\n\t\t Ingredientes:" + ingredientes.toString();
	}



}
