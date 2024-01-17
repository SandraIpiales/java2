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
		Cuota c2 = new Cuota(2);
		Cuota
		c1.setCuota(cuota);
		c1.setCapital(prestamo.getMonto());
		for(int i=0;i<prestamo.getPlazo();i++) {
			prestamo.getCuotas()
			calcularValorCuota(prestamo.getInteres(),c1,c2);
		}
		
	}
	public void calcularValorCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double valorInteres= (cuotaActual.getCapital()*interes)/100;
		double abonoCapital  = cuotaActual.getAbonoCapital()-valorInteres;
		double saldo= cuotaActual.getCapital()-abonoCapital;
		cuotaSiguiente.setCapital(saldo);
	}
}
