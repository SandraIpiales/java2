package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "09915454", 59);
		Telefono t2 = new Telefono("claro", "09726987", 70);
		Contacto c1 = new Contacto("Zayde", "Martinez", t1, 55);
		Contacto c2 = new Contacto("Erick", "Lopez", t2, 50);
		AdminContactos adm = new AdminContactos();

		Contacto c3 = adm.buscarMasPesado(c1, c2);
		if (c3 == null) {
			System.out.println("Pesan Igual");
		} else {
			System.out.println("--Contacto Más Pesado--");
			c3.imprimir();
		}

		boolean comOperadoras = adm.compararOperadoras(c1, c2);
		System.out.println("--Comparación de Operadoras--");
		if (comOperadoras == true) {
			System.out.println("Operadoras Iguales");
		} else {
			System.out.println("Operadoras Diferentes");
		}

	}

}
