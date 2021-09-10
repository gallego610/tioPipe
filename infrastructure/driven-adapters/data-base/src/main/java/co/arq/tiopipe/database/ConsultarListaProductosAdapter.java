/**
 * 
 */
package co.arq.tiopipe.database;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import co.arq.tiopipe.mocks.LocalesMock;
import co.arq.tiopipe.model.local.Local;
import co.arq.tiopipe.model.local.gateways.LocalRepository;
import co.arq.tiopipe.model.producto.Producto;

@Component
public class ConsultarListaProductosAdapter implements LocalRepository {

	/**
	 * Metodo para realizar la consulta y retornar la lista de los platos ofrecidos
	 * en alguno de los locales disponibles
	 */
	@Override
	public List<Producto> consultarListaPlatos(String idLocal) {

		LocalesMock locales = new LocalesMock();

		Local local = locales.getListaLocales().stream().filter(r -> r.getId().equalsIgnoreCase(idLocal)).findAny()
				.orElse(new Local());

		return local.getProductos().stream().filter(r -> !r.isInsumo()).collect(Collectors.toList());
	}

	
	/**
	 * Metodo para realizar la consulta y retornar la lista de los insumos ofrecidos
	 * en alguno de los locales disponibles
	 */
	@Override
	public List<Producto> consultarListaInsumos(String idLocal) {

		LocalesMock locales = new LocalesMock();

		Local local = locales.getListaLocales().stream().filter(r -> r.getId().equalsIgnoreCase(idLocal)).findAny()
				.orElse(null);

		return local.getProductos().stream().filter(r -> r.isInsumo()).collect(Collectors.toList());
	}
	
}
