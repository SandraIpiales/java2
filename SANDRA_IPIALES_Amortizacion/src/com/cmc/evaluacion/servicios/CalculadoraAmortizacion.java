package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Cuota;
import com.cmc.evaluacion.entidades.Prestamo;

public class CalculadoraAmortizacion {
	
	public double calcularCuota(Prestamo prestamoIngresado) {
		double valorCuota;
		double interesMensual= (prestamoIngresado.getInteres()/12)/100;
		double den= Math.pow((1+interesMensual),-(prestamoIngresado.getPlazo()));
		valorCuota=(prestamoIngresado.getMonto()*interesMensual)/(1-den);
		return valorCuota;
	}
	
	public void generarTabla(Prestamo prestamo) {
		double cuota= calcularCuota(prestamo);
		Cuota c1= new Cuota(1);
		c1.setCuota(cuota);
		c1.setCapital(prestamo.getMonto());
		
	}
	public void calcularValorCuota(double interes, Cuota cuota, Cuota cuotaSiguiente) {
		double valorInteres= (cuota.getCapital()*interes)/100;
		double abonoCapital  = cuota.getAbonoCapital()-valorInteres;
		double saldo= cuota.getCapital()-abonoCapital;
		cuotaSiguiente.setCapital(saldo);
	}
}
