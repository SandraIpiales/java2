package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadrado1=new Cuadrado();
		Cuadrado cuadrado2=new Cuadrado();
		Cuadrado cuadrado3=new Cuadrado();
		double areaC1;
		double areaC2;
		double areaC3;
		
		cuadrado1.lado=8;
		cuadrado2.lado=2;
		cuadrado3.lado=9;
		
		areaC1=cuadrado1.calcularArea();
		areaC2=cuadrado2.calcularArea();
		areaC3=cuadrado3.calcularArea();
		
		System.out.println("Area c1: " + areaC1);
		System.out.println("Area c2: " + areaC2);
		System.out.println("Area c3: " + areaC3);
		
		

	}

}
