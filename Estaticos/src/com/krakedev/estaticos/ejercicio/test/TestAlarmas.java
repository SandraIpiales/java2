package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakedev.estaticos.ejercicio.entidades.Alarma;
import com.krakedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma a1= new Alarma(DiasSemana.LUNES,5,10);
		Alarma a2= new Alarma(DiasSemana.MIERCOLES,6,24);
		Alarma a3= new Alarma(DiasSemana.DOMINGO,9,20);
		
		AdminAlarmas admin= new AdminAlarmas();
		admin.agregarAlarma(a1);
		admin.agregarAlarma(a2);
		admin.agregarAlarma(a3);
		ArrayList<Alarma> alarmasActuales= admin.getAlarmas();
		
		
		System.out.println(alarmasActuales);
		
		
	}
}
