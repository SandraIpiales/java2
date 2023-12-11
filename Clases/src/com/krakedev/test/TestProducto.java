package com.krakedev.test;

import com.krakedev.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto productoA = new Producto("Gel","Embase Pequenio",1.50,100);
		Producto productoB = new Producto("Jarabe","Embase 300ml",5.50,50);
		Producto productoC = new Producto("Mascarillas","Color Azul Quirurgicas",7.20,75);
		
		System.out.println("----- Producto A ------");
		System.out.println("productoA.nombre: "+ productoA.getNombre());
		System.out.println("productoA.descripcion: "+ productoA.getDescripcion());
		System.out.println("productoA.precio: "+ productoA.getPrecio());		
		System.out.println("productoA.stockActual: "+ productoA.getStockActual());	
		System.out.println("");
		System.out.println("----- Producto B ------");
		System.out.println("productoB.nombre: "+ productoB.getNombre());
		System.out.println("productoB.descripcion: "+ productoB.getDescripcion());
		System.out.println("productoB.precio: "+ productoB.getPrecio());		
		System.out.println("productoB.stockActual: "+ productoB.getStockActual());
		System.out.println("");
		System.out.println("----- Producto C ------");
		System.out.println("productoC.nombre: "+ productoC.getNombre());
		System.out.println("productoC.descripcion: "+ productoC.getDescripcion());
		System.out.println("productoC.precio: "+ productoC.getPrecio());		
		System.out.println("productoC.stockActual: "+ productoC.getStockActual());	
				
				
				
		

	}

}
