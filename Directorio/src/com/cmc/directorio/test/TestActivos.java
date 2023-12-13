package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono t1 = new Telefono("movi", "09915454", 59);
		Contacto c1 = new Contacto("Marco", "Fuentes", t1, 55);
		AdminContactos adm = new AdminContactos();
		
		System.out.println("--Valor Iniciales--");
		t1.setTieneWhatsapp(false);
		c1.imprimir();
		System.out.println("------------------");
		adm.activarUsuario(c1);
		c1.imprimir();

	}

}
