package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		Item item = new Item();
		Item item2=new Item();
		
		item.setNombre("Belleza");
		item.setProductosActuales(20);
		System.out.println("---Valores Iniciales---");
		item.imprimir();
		System.out.println("---Productos Vendidos---");
		item.vender(10);
		item.imprimir();
		System.out.println("---Productos Devueltos---");
		item.devolver(3);
		item.imprimir();
		
		item2.setNombre("Limpieza");
		item2.setProductosActuales(60);
		System.out.println("***Valores Iniciales***");
		item2.imprimir();
		System.out.println("***Productos Vendidos***");
		item2.vender(30);
		item2.imprimir();
		System.out.println("***Productos Devueltos***");
		item2.devolver(21);
		item2.imprimir();
		

	}

}
