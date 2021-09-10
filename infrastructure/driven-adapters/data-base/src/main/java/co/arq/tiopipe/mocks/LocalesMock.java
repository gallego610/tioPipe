package co.arq.tiopipe.mocks;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import co.arq.tiopipe.model.ingrediente.Ingrediente;
import co.arq.tiopipe.model.local.Local;
import co.arq.tiopipe.model.producto.Producto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LocalesMock {

	private List<Local> listaLocales;

	public LocalesMock() {
		initLocales();
	}

	private void initLocales() {
		listaLocales = new ArrayList<>();
		Local cali = new Local("4", "La curtida", "Valle de Cauda", "Cali", "Autopista San Juan con La esquina");
		Local santaMarta = new Local("5", "Su Jugo", "Magdalena", "Santa Marta", "Avenida cordilleras");
		Local neiva = new Local("6", "Gran Llanera", "Huila", "Neiva", "Calle 12 E # 54-12");

		listaLocales.add(local1());
		listaLocales.add(local2());
		listaLocales.add(local3());
		listaLocales.add(cali);
		listaLocales.add(santaMarta);
		listaLocales.add(neiva);
	}

	private Local local1() {
		Local medellin = new Local("1", "Super Perro Medellin", "Antioquia", "Medellin", "Guayabal la 10");
		Ingrediente ingrediente1 = new Ingrediente("1", "Papas", new BigDecimal(1300));
		Ingrediente ingrediente2 = new Ingrediente("2", "Salchicha", new BigDecimal(1500));
		Ingrediente ingrediente3 = new Ingrediente("3", "Queso", new BigDecimal(600));
		Ingrediente ingrediente4 = new Ingrediente("4", "Salsa de tomate", new BigDecimal(200));
		Ingrediente ingrediente5 = new Ingrediente("5", "Mayonesa", new BigDecimal(300));
		Ingrediente ingrediente6 = new Ingrediente("6", "Maicitos", new BigDecimal(900));
		Ingrediente ingrediente7 = new Ingrediente("7", "Carne Hamburguesa", new BigDecimal(3200));
		Ingrediente ingrediente8 = new Ingrediente("8", "Pan Hamburguesa", new BigDecimal(1200));
		Ingrediente ingrediente9 = new Ingrediente("9", "Lechuga", new BigDecimal(500));
		Ingrediente ingrediente0 = new Ingrediente("0", "Tomate", new BigDecimal(500));
		Ingrediente ingrediente10 = new Ingrediente("10", "Tortilla", new BigDecimal(1500));
		Ingrediente ingrediente11 = new Ingrediente("11", "Pollo", new BigDecimal(3500));
		Ingrediente ingrediente12 = new Ingrediente("12", "Agua", new BigDecimal(300));
		Ingrediente ingrediente13 = new Ingrediente("13", "Azucar", new BigDecimal(100));
		Ingrediente ingrediente14 = new Ingrediente("14", "Pulpa Fruta Mora", new BigDecimal(900));
		Ingrediente ingrediente15 = new Ingrediente("15", "Leche", new BigDecimal(900));
		Ingrediente ingrediente16 = new Ingrediente("16", "Hielo", new BigDecimal(100));
		Ingrediente ingrediente17 = new Ingrediente("17", "Arroz", new BigDecimal(1200));
		Ingrediente ingrediente18 = new Ingrediente("18", "Carne Molida", new BigDecimal(3500));
		Ingrediente ingrediente19 = new Ingrediente("19", "Chorizo", new BigDecimal(5000));
		Ingrediente ingrediente20 = new Ingrediente("20", "Frijol", new BigDecimal(2100));
		Ingrediente ingrediente21 = new Ingrediente("21", "Chicharron", new BigDecimal(2300));
		Ingrediente ingrediente22 = new Ingrediente("22", "Huevo", new BigDecimal(500));

		Producto producto1 = new Producto("1", "Salchipapas", new BigDecimal(9500));
		producto1.getIngredientes().add(ingrediente1);
		producto1.getIngredientes().add(ingrediente2);
		producto1.getIngredientes().add(ingrediente3);
		producto1.getIngredientes().add(ingrediente4);
		producto1.getIngredientes().add(ingrediente5);
		producto1.getIngredientes().add(ingrediente6);
		medellin.getProductos().add(producto1);

		Producto producto2 = new Producto("2", "Hamburguesas", new BigDecimal(14500));
		producto2.getIngredientes().add(ingrediente1);
		producto2.getIngredientes().add(ingrediente3);
		producto2.getIngredientes().add(ingrediente9);
		producto2.getIngredientes().add(ingrediente5);
		producto2.getIngredientes().add(ingrediente7);
		producto2.getIngredientes().add(ingrediente8);
		medellin.getProductos().add(producto2);

		Producto producto3 = new Producto("3", "Wraps ", new BigDecimal(11500));
		producto3.getIngredientes().add(ingrediente9);
		producto3.getIngredientes().add(ingrediente0);
		producto3.getIngredientes().add(ingrediente10);
		producto3.getIngredientes().add(ingrediente11);
		producto3.getIngredientes().add(ingrediente5);
		medellin.getProductos().add(producto3);

		Producto producto4 = new Producto("4", "Jugo Mora", new BigDecimal(4500));
		producto4.getIngredientes().add(ingrediente12);
		producto4.getIngredientes().add(ingrediente13);
		producto4.getIngredientes().add(ingrediente14);
		producto4.getIngredientes().add(ingrediente15);
		producto4.getIngredientes().add(ingrediente16);
		medellin.getProductos().add(producto4);

		Producto producto5 = new Producto("5", "Bandeja Paisa", new BigDecimal(15900));
		producto5.setEspecial(true);
		producto5.getIngredientes().add(ingrediente17);
		producto5.getIngredientes().add(ingrediente12);
		producto5.getIngredientes().add(ingrediente18);
		producto5.getIngredientes().add(ingrediente19);
		producto5.getIngredientes().add(ingrediente20);
		producto5.getIngredientes().add(ingrediente21);
		producto5.getIngredientes().add(ingrediente22);
		medellin.getProductos().add(producto5);

		return medellin;
	}

	private Local local2() {
		Local bogota = new Local("2", "La costilla", "Cundinamarca", "Bogota", "La 93");
		Ingrediente ingrediente1 = new Ingrediente("1", "Papas", new BigDecimal(1300));
		Ingrediente ingrediente2 = new Ingrediente("2", "Salchicha", new BigDecimal(1500));
		Ingrediente ingrediente3 = new Ingrediente("3", "Queso", new BigDecimal(600));
		Ingrediente ingrediente4 = new Ingrediente("4", "Salsa de tomate", new BigDecimal(200));
		Ingrediente ingrediente5 = new Ingrediente("5", "Mayonesa", new BigDecimal(300));
		Ingrediente ingrediente6 = new Ingrediente("6", "Maicitos", new BigDecimal(900));
		Ingrediente ingrediente7 = new Ingrediente("7", "Carne Hamburguesa", new BigDecimal(3200));
		Ingrediente ingrediente8 = new Ingrediente("8", "Pan Hamburguesa", new BigDecimal(1200));
		Ingrediente ingrediente9 = new Ingrediente("9", "Lechuga", new BigDecimal(500));
		Ingrediente ingrediente0 = new Ingrediente("0", "Tomate", new BigDecimal(500));
		Ingrediente ingrediente10 = new Ingrediente("10", "Tortilla", new BigDecimal(1500));
		Ingrediente ingrediente11 = new Ingrediente("11", "Pollo", new BigDecimal(3500));
		Ingrediente ingrediente12 = new Ingrediente("12", "Agua", new BigDecimal(300));
		Ingrediente ingrediente13 = new Ingrediente("13", "Azucar", new BigDecimal(100));
		Ingrediente ingrediente14 = new Ingrediente("14", "Pulpa Fruta Mora", new BigDecimal(900));
		Ingrediente ingrediente15 = new Ingrediente("15", "Leche", new BigDecimal(900));
		Ingrediente ingrediente16 = new Ingrediente("16", "Hielo", new BigDecimal(100));
		Ingrediente ingrediente17 = new Ingrediente("17", "Arroz", new BigDecimal(1200));
		Ingrediente ingrediente18 = new Ingrediente("18", "Papa Criolla", new BigDecimal(2400));
		Ingrediente ingrediente19 = new Ingrediente("19", "Papa Pastusa", new BigDecimal(12000));
		Ingrediente ingrediente20 = new Ingrediente("20", "Mazorcas", new BigDecimal(2100));
		Ingrediente ingrediente21 = new Ingrediente("21", "Crema de Leche", new BigDecimal(1300));
		Ingrediente ingrediente22 = new Ingrediente("22", "Aguacate", new BigDecimal(500));

		Producto producto1 = new Producto("1", "Salchipapas", new BigDecimal(9500));
		producto1.getIngredientes().add(ingrediente1);
		producto1.getIngredientes().add(ingrediente2);
		producto1.getIngredientes().add(ingrediente3);
		producto1.getIngredientes().add(ingrediente4);
		producto1.getIngredientes().add(ingrediente5);
		producto1.getIngredientes().add(ingrediente6);
		bogota.getProductos().add(producto1);

		Producto producto2 = new Producto("2", "Hamburguesas", new BigDecimal(14500));
		producto2.getIngredientes().add(ingrediente1);
		producto2.getIngredientes().add(ingrediente3);
		producto2.getIngredientes().add(ingrediente9);
		producto2.getIngredientes().add(ingrediente5);
		producto2.getIngredientes().add(ingrediente7);
		producto2.getIngredientes().add(ingrediente8);
		bogota.getProductos().add(producto2);

		Producto producto3 = new Producto("3", "Wraps ", new BigDecimal(11500));
		producto3.getIngredientes().add(ingrediente9);
		producto3.getIngredientes().add(ingrediente0);
		producto3.getIngredientes().add(ingrediente10);
		producto3.getIngredientes().add(ingrediente11);
		producto3.getIngredientes().add(ingrediente5);
		bogota.getProductos().add(producto3);

		Producto producto4 = new Producto("4", "Jugo Mora", new BigDecimal(4500));
		producto4.getIngredientes().add(ingrediente12);
		producto4.getIngredientes().add(ingrediente13);
		producto4.getIngredientes().add(ingrediente14);
		producto4.getIngredientes().add(ingrediente15);
		producto4.getIngredientes().add(ingrediente16);
		bogota.getProductos().add(producto4);

		Producto producto5 = new Producto("5", "Ajiaco", new BigDecimal(15900));
		producto5.setEspecial(true);
		producto5.getIngredientes().add(ingrediente12);
		producto5.getIngredientes().add(ingrediente17);
		producto5.getIngredientes().add(ingrediente18);
		producto5.getIngredientes().add(ingrediente19);
		producto5.getIngredientes().add(ingrediente20);
		producto5.getIngredientes().add(ingrediente21);
		producto5.getIngredientes().add(ingrediente22);
		bogota.getProductos().add(producto5);

		return bogota;
	}

	private Local local3() {
		Local cartagena = new Local("3", "Burger Mas", "Bolivar", "Cartagena", "Playa Tentacion");
		Ingrediente ingrediente1 = new Ingrediente("1", "Papas", new BigDecimal(1300));
		Ingrediente ingrediente2 = new Ingrediente("2", "Salchicha", new BigDecimal(1500));
		Ingrediente ingrediente3 = new Ingrediente("3", "Queso", new BigDecimal(600));
		Ingrediente ingrediente4 = new Ingrediente("4", "Salsa de tomate", new BigDecimal(200));
		Ingrediente ingrediente5 = new Ingrediente("5", "Mayonesa", new BigDecimal(300));
		Ingrediente ingrediente6 = new Ingrediente("6", "Maicitos", new BigDecimal(900));
		Ingrediente ingrediente7 = new Ingrediente("7", "Carne Hamburguesa", new BigDecimal(3200));
		Ingrediente ingrediente8 = new Ingrediente("8", "Pan Hamburguesa", new BigDecimal(1200));
		Ingrediente ingrediente9 = new Ingrediente("9", "Lechuga", new BigDecimal(500));
		Ingrediente ingrediente0 = new Ingrediente("0", "Tomate", new BigDecimal(500));
		Ingrediente ingrediente10 = new Ingrediente("10", "Tortilla", new BigDecimal(1500));
		Ingrediente ingrediente11 = new Ingrediente("11", "Pollo", new BigDecimal(3500));
		Ingrediente ingrediente12 = new Ingrediente("12", "Agua", new BigDecimal(300));
		Ingrediente ingrediente13 = new Ingrediente("13", "Azucar", new BigDecimal(100));
		Ingrediente ingrediente14 = new Ingrediente("14", "Pulpa Fruta Mora", new BigDecimal(900));
		Ingrediente ingrediente15 = new Ingrediente("15", "Leche", new BigDecimal(900));
		Ingrediente ingrediente16 = new Ingrediente("16", "Hielo", new BigDecimal(100));
		Ingrediente ingrediente17 = new Ingrediente("17", "Arroz", new BigDecimal(1200));
		Ingrediente ingrediente18 = new Ingrediente("18", "Papa Criolla", new BigDecimal(2400));
		Ingrediente ingrediente19 = new Ingrediente("19", "Papa Pastusa", new BigDecimal(12000));
		Ingrediente ingrediente20 = new Ingrediente("20", "Mazorcas", new BigDecimal(2100));
		Ingrediente ingrediente21 = new Ingrediente("21", "Crema de Leche", new BigDecimal(1300));
		Ingrediente ingrediente22 = new Ingrediente("22", "Aguacate", new BigDecimal(500));

		Producto producto1 = new Producto("1", "Salchipapas", new BigDecimal(9500));
		producto1.getIngredientes().add(ingrediente1);
		producto1.getIngredientes().add(ingrediente2);
		producto1.getIngredientes().add(ingrediente3);
		producto1.getIngredientes().add(ingrediente4);
		producto1.getIngredientes().add(ingrediente5);
		producto1.getIngredientes().add(ingrediente6);
		cartagena.getProductos().add(producto1);

		Producto producto2 = new Producto("2", "Hamburguesas", new BigDecimal(14500));
		producto2.getIngredientes().add(ingrediente1);
		producto2.getIngredientes().add(ingrediente3);
		producto2.getIngredientes().add(ingrediente9);
		producto2.getIngredientes().add(ingrediente5);
		producto2.getIngredientes().add(ingrediente7);
		producto2.getIngredientes().add(ingrediente8);
		cartagena.getProductos().add(producto2);

		Producto producto3 = new Producto("3", "Wraps ", new BigDecimal(11500));
		producto3.getIngredientes().add(ingrediente9);
		producto3.getIngredientes().add(ingrediente0);
		producto3.getIngredientes().add(ingrediente10);
		producto3.getIngredientes().add(ingrediente11);
		producto3.getIngredientes().add(ingrediente5);
		cartagena.getProductos().add(producto3);

		Producto producto4 = new Producto("4", "Jugo Mora", new BigDecimal(4500));
		producto4.getIngredientes().add(ingrediente12);
		producto4.getIngredientes().add(ingrediente13);
		producto4.getIngredientes().add(ingrediente14);
		producto4.getIngredientes().add(ingrediente15);
		producto4.getIngredientes().add(ingrediente16);
		cartagena.getProductos().add(producto4);
		
		Producto producto5 = new Producto("5", "Ajiaco", new BigDecimal(15900));
		producto5.setEspecial(true);
		producto5.getIngredientes().add(ingrediente12);
		producto5.getIngredientes().add(ingrediente17);
		producto5.getIngredientes().add(ingrediente18);
		producto5.getIngredientes().add(ingrediente19);
		producto5.getIngredientes().add(ingrediente20);
		producto5.getIngredientes().add(ingrediente21);
		producto5.getIngredientes().add(ingrediente22);
		cartagena.getProductos().add(producto5);
		
		
		Producto producto6 = new Producto("6", "Papas", new BigDecimal(1300));
		producto6.setInsumo(true);
		producto6.getIngredientes().add(ingrediente1);
		cartagena.getProductos().add(producto6);
		
		
		return cartagena;
	}

		
}
