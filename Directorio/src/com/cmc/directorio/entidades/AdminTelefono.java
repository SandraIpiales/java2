package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefonoA) {
		if (telefonoA.getOperadora() == "movi") {
			telefonoA.setTieneWhatsapp(true);
		}
	}
	
	public int contarMovi(Telefono t1,Telefono t2, Telefono t3) {
		int cont=0;
		if(t1.getOperadora()=="movi" && t2.getOperadora()=="movi" && t3.getOperadora()=="movi") {
			cont=3;
		}else if(t1.getOperadora()=="movi" && t2.getOperadora()=="movi" || t1.getOperadora()=="movi" && t3.getOperadora()=="movi" 
				|| t2.getOperadora()=="movi" && t3.getOperadora()=="movi" ){
			cont=2;
		}else if(t1.getOperadora()=="movi"||t2.getOperadora()=="movi"||t3.getOperadora()=="movi"){
			cont=1;
		}else {
			cont=0;
		}
		return cont;
	}

}
