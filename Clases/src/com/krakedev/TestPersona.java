package com.krakedev;

/*
 * Comentario de varias lineas
 * */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;// 1: Declaro una variable tipo Persona
		Persona p2 = new Persona();
		p = new Persona();// 2.Instanciar un objeto Persona, referenciarlo con p
		// 3. Acceder a los atributos
		System.out.println("nombre: " + p.getNombre()); // sysout+Ctrl+Espace
		System.out.println("nombre: " + p.getEdad());
		System.out.println("nombre: " + p.getEstatura());
		// 4. Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		System.out.println("-----------");
		// 5. Acceder a los atributos
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p.edad: " + p.getEdad());
		System.out.println("p.estatura: " + p.getEstatura());

		p2.setNombre("Angelina");
		System.out.println("********");
		System.out.println("p.nombre: " + p.getNombre());
		System.out.println("p2.nombre: " + p2.getNombre());

	}

}
