package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto();
		Producto productoB = new Producto();
		Producto productoC = new Producto();
		//Modificar Atributos
		productoA.nombre="Gel";
		productoA.descripcion="Embase Pequenio";
		productoA.precio=1.50;
		productoA.stockActual=100;
		
		productoB.nombre="Jarabe";
		productoB.descripcion="Embase 300ml";
		productoB.precio=5.50;
		productoB.stockActual=50;
		
		//Mostrar Valores de Atributos
		productoC.nombre="Mascarillas";
		productoC.descripcion="Color Azul Quirurgicas";
		productoC.precio=7.20;
		productoC.stockActual=75;
		System.out.println("----- Producto A ------");
		System.out.println("productoA.nombre: "+ productoA.nombre);
		System.out.println("productoA.descripcion: "+ productoA.descripcion);
		System.out.println("productoA.precio: "+ productoA.precio);		
		System.out.println("productoA.stockActual: "+ productoA.stockActual);	
		System.out.println("");
		System.out.println("----- Producto B ------");
		System.out.println("productoB.nombre: "+ productoB.nombre);
		System.out.println("productoB.descripcion: "+ productoB.descripcion);
		System.out.println("productoB.precio: "+ productoB.precio);		
		System.out.println("productoB.stockActual: "+ productoB.stockActual);
		System.out.println("");
		System.out.println("----- Producto C ------");
		System.out.println("productoC.nombre: "+ productoC.nombre);
		System.out.println("productoC.descripcion: "+ productoC.descripcion);
		System.out.println("productoC.precio: "+ productoC.precio);		
		System.out.println("productoC.stockActual: "+ productoC.stockActual);	
				
				
				
		

	}

}
