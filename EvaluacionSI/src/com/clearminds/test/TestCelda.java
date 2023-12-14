package com.clearminds.test;

import com.clearminds.componentes.Celda;

/*El error se encuentra en la linea 8 de la clase TestCelda
 * La razón del error radica en que se esta invocando un metodo desde la variable null. 
 * La variable celda junto al metodo getProducto() da como resultado null. 
 * Luego null  invoca a un metodo y  provoca el error de NullPointer*/
public class TestCelda {
	public static void main(String[] args) {
		Celda celda = new Celda("A1");
		System.out.println(celda.getProducto().getNombre());

		System.out.println("CELDA:" + celda.getProducto());
		System.out.println("Nombre Producto:" + celda.getProducto().getNombre());
		System.out.println("Precio Producto:" + celda.getProducto().getPrecio());
		System.out.println("C�digo Producto:" + celda.getProducto().getCodigo());
		System.out.println("STOCK:" + celda.getStock());
		System.out.println("*************************************");
	}
}
