package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		double limite=4;
		
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "A", 4);
		Producto producto2 = new Producto("PRTO", "Gatorade", 6.54);
		maquina.cargarProducto(producto2, "F", 5);
		Producto producto3=new Producto("PL45","Jet",0.25);
		maquina.cargarProducto(producto3, "C", 4);
		Producto producto4 = new Producto("HGT5", "Gaseosa", 7.04);
		maquina.cargarProducto(producto4, "D", 5);
		Producto producto5=new Producto("PIY8","DeTodito",0.60);
		maquina.cargarProducto(producto5, "E", 4);
		Producto producto6 = new Producto("YTE2", "Doritos", 0.5);
		maquina.cargarProducto(producto6, "B", 5);

		ArrayList<Producto> productosMenores=maquina.buscarMenores(limite);
		System.out.println("Productos Menores a "+ limite);
		for(int i=0;i<productosMenores.size();i++) {
			Producto p=productosMenores.get(i);
			System.out.println("Nombre: "+p.getNombre()+" Precio: "+ p.getPrecio());
		}

	}

}
