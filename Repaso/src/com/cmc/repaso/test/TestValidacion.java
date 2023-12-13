package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Validacion;

public class TestValidacion {

	public static void main(String[] args) {
		Validacion validacion1=new Validacion();
		
		System.out.println("Monto Mayor a 0: "+validacion1.validarMonto(25));
		System.out.println("Monto Menor a 0: "+validacion1.validarMonto(-2));


		

	}

}
