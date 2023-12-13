package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		int numMovi;
		Telefono telfA=new Telefono("claro","1212",12);
		Telefono telfB=new Telefono("movi","1212",12);
		Telefono telfC=new Telefono("movi","1212",12);
		
		AdminTelefono adm= new AdminTelefono();
		numMovi=adm.contarMovi(telfA, telfB, telfC);
		System.out.println("Num Operadoras Movi: "+numMovi);

	}

}
