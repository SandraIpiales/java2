package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telef= new Telefono("movi","0231",45);
		Contacto c= new Contacto("Julieta","Moreno",telef,60);
		
		Telefono t=c.getTelefono();
		
		System.out.println("Nombre: " + c.getNombre());
		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Operadora: " + t.getOperadora());
		System.out.println("Numero: " + t.getNumero());
		

	}

}
