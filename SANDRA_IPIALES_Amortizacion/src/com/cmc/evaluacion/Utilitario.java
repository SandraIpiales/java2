package com.cmc.evaluacion;



public class Utilitario {
	public double redondear(double valor) {
        String numeroFormateado = String.format("%.2f", valor);
        numeroFormateado = numeroFormateado.replace(",", ".");
        double numeroRedondeado = Double.parseDouble(numeroFormateado);
		return numeroRedondeado;
	}
}
