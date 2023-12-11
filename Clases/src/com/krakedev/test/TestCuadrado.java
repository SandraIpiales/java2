package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadrado1=new Cuadrado(8);
		Cuadrado cuadrado2=new Cuadrado(2);
		Cuadrado cuadrado3=new Cuadrado(9);
		double areaC1;
		double areaC2;
		double areaC3;
		double perimetroC1;
		double perimetroC2;
		double perimetroC3;

		
		areaC1=cuadrado1.calcularArea();
		areaC2=cuadrado2.calcularArea();
		areaC3=cuadrado3.calcularArea();
		
		perimetroC1=cuadrado1.calcularPerimetro();
		perimetroC2=cuadrado2.calcularPerimetro();
		perimetroC3=cuadrado3.calcularPerimetro();

		System.out.println("Area c1: " + areaC1);
		System.out.println("Area c2: " + areaC2);
		System.out.println("Area c3: " + areaC3);
		
		System.out.println("Perímetro c1: " + perimetroC1);
		System.out.println("Perímetro c2: " + perimetroC2);
		System.out.println("Perímetro c3: " + perimetroC3);
		
		

	}

}
