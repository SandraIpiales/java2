package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.Utilitario;
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
		Cuota[] c1= prestamo.getCuotas();
		double cuotaFinal;
		for(int i =0;i<c1.length;i++) {
			c1[i]= new Cuota(i+1);
			c1[i].setCuota(cuota);
			
			if(i==0) {
				c1[i].setInicio(prestamo.getMonto());
			}else {
				c1[i].setInicio(c1[i-1].getSaldo());
			}
			calcularValorCuota(prestamo.getInteres(),c1[i]);
			if(i==c1.length-1) {
				cuotaFinal=cuota+c1[i].getSaldo();
				c1[i].setCuota(cuotaFinal);
				c1[i].setSaldo(0);
				
			}
		}

		
	}
	public void calcularValorCuota(double interes, Cuota cuota) {
		double valorInteres= (interes/12)/100;
		cuota.setInteres(cuota.getInicio()*valorInteres);
		cuota.setAbonoCapital(cuota.getCuota()-cuota.getInteres());
		cuota.setSaldo(cuota.getInicio()-cuota.getAbonoCapital());
	}
	public void mostrarTabla(Prestamo prestamo) {
		Cuota[] elementoCuota=prestamo.getCuotas();
		Cuota cuota;
		System.out.println("Numero"+ " | "+"Cuota"+ " | "+"Inicio"+ " | "+"Interes"+ " | "+"Abono"+ " | "+"Saldo");

		for(int i=0; i<prestamo.getPlazo();i++) {
			cuota=elementoCuota[i];
			Utilitario utl=new Utilitario();
			System.out.println(utl.redondear(i+1)+ " | "+utl.redondear(cuota.getCuota())+ " | "+utl.redondear(cuota.getInicio())+ " | "+utl.redondear(cuota.getInteres())
					+ " | "+utl.redondear(cuota.getAbonoCapital())+ " | "+utl.redondear(cuota.getSaldo()));

		}
	}
}
