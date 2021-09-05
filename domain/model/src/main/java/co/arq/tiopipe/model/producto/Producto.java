package co.arq.tiopipe.model.producto;
import java.util.List;

import co.arq.tiopipe.model.ingrediente.Ingrediente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder(toBuilder = true)
public class Producto extends Ingrediente {
	

	private List<Ingrediente> ingrediente;
}
