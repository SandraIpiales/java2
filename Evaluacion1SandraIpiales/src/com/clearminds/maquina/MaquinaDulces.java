package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas= new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda celdaA) {
		celdas.add(celdaA);
	}
	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda= celdas.get(i);
			System.out.println("Celda: " + elementoCelda.getCodigo());
		}
	} 
	
	public Celda buscarCelda(String codCelda) {
		Celda elementoCelda=null;
		Celda celdaEncontrada=null;
		for(int i=0;i<celdas.size();i++) {
			elementoCelda= celdas.get(i);
			if(codCelda.equals(elementoCelda.getCodigo())){
				celdaEncontrada=elementoCelda;
			}
		}
		return celdaEncontrada;
	}
	public ArrayList<Celda> getCeldas() {
		return celdas;
	}
	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
