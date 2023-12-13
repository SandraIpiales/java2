package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Estudiante;

public class TestEstudiante {

	public static void main(String[] args) {
		Estudiante estudiante1= new Estudiante("Pablo");
		Estudiante estudiante2= new Estudiante("Andres");
		estudiante1.calificar(9);
		estudiante2.calificar(5);
		System.out.println("----------------");
		System.out.println("Nombre :"+ estudiante1.getNombre());
		System.out.println("Nota :"+ estudiante1.getNota());
		System.out.println("Resultados :"+ estudiante1.getResultado());
		System.out.println("----------------");
		System.out.println("Nombre :"+ estudiante2.getNombre());
		System.out.println("Nota :"+ estudiante2.getNota());
		System.out.println("Resultados :"+ estudiante2.getResultado());
		


		
		
		

	}

}
