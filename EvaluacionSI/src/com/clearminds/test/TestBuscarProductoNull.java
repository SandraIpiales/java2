package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;
/*El error se encuentra en la linea 15 de la clase TestBuscarProducto Null
 * La variable que lo produce es prod de tipo Producto ya que al buscar el producto de la celda A1
 * no existe por lo tanto es null y en la línea 15 se esta imprimiendo una variable null junto a un método.
 * Y esto produce el error*/
public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "B1", 4);
		
		Producto prod=maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:"+prod.getNombre());
		
		
		
		
	}
}
