package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefonoA) {
		if (telefonoA.getOperadora() == "movi") {
			telefonoA.setTieneWhatsapp(true);
		}
	}

}
