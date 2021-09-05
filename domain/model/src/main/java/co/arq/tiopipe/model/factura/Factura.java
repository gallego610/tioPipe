package co.arq.tiopipe.model.factura;
import java.math.BigDecimal;
import java.util.List;

import co.arq.tiopipe.model.local.Local;
import co.arq.tiopipe.model.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
public class Factura {
	
	private String consecutivo;
	private String tipoVenta;
	private String identificacionCliente;
	private Local local;
	private List<Producto> productos;
	private BigDecimal costoTotalFactura;
	private BigDecimal cuponDescuento;
	
}
