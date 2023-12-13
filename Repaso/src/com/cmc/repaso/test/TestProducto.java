package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto producto=new Producto("abrigo",56);
		double precioConDescuento;
		producto.setPrecio(-56);
		precioConDescuento=producto.calcularPrecioPromo(50);
		System.out.println("Precio: "+producto.getPrecio());
		System.out.println("Precio con Descuento: "+precioConDescuento);

		

	}

}
