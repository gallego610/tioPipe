package co.arq.tiopipe.model.local.gateways;

import java.util.List;

import co.arq.tiopipe.model.producto.Producto;

public interface LocalRepository {

	/**
	 * Metodo para realizar la consulta y retornar la lista de los platos ofrecidos
	 * en alguno de los locales disponibles
	 */

	List<Producto> consultarListaPlatos(String idLocal);

	/**
	 * Metodo para realizar la consulta y retornar la lista de los insumos ofrecidos
	 * en alguno de los locales disponibles
	 */
	List<Producto> consultarListaInsumos(String idLocal);

}
