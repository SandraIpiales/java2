package com.krakedev;

public class Calculadora {
	public int sumar(int valor1, int valor2) {
		int resultado; /// declarar la variable
		resultado = valor1 + valor2;
		return resultado;
	}
	public double restar(int valor1,int valor2){
		double resultado;
		resultado=valor1-valor2;
		return resultado;
	}
	public double multiplicar(double valor1,double valor2){
		double resultado;
		resultado=valor1*valor2;
		return resultado;
	}
	public double dividir(double dividendo,double divisor){
		double resultado;
		resultado=dividendo/divisor;
		return resultado;
	}

	
}
