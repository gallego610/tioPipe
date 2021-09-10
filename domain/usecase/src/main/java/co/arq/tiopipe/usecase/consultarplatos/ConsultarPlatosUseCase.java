package co.arq.tiopipe.usecase.consultarplatos;

import java.util.List;

import co.arq.tiopipe.model.local.gateways.LocalRepository;
import co.arq.tiopipe.model.producto.Producto;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ConsultarPlatosUseCase {

	private final LocalRepository localRepository;

	/**
	 * Metodos expuesto para listar los platos ofrecidos por un Local
	 * 
	 * @param id identificador del local
	 * @return lista de platos ofrecidos por el local
	 */
	public List<Producto> consultarListaPlatos(String idLocal) {
		return localRepository.consultarListaPlatos(idLocal);
	}

	/**
	 * 
	 * Metodos expuesto para listar los insumos ofrecidos por un Local
	 * 
	 * @param id identificador del local
	 * @return lista de insumos ofrecidos por el local
	 */
	public List<Producto> consultarListaInsumos(String idLocal) {
		return localRepository.consultarListaInsumos(idLocal);
	}

}
