package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;
	
	
	public Telefono(String numero, String tipo) {
		if(numero!=null && tipo!=null) {
			if(tipo.equalsIgnoreCase("movil")|| tipo.equalsIgnoreCase("Convencional")) {
				if(tipo.equalsIgnoreCase("movil")&&numero.length()==10) {
					estado="C";
				}else if(tipo.equalsIgnoreCase("convencional")&&numero.length()==7) {
					estado="C";					
				}else  {
					estado="E";
				}
			}else {
				estado="E";
			}
		}else {
			estado="E";
		}
		this.tipo = tipo;
		this.numero = numero;
		this.estado=estado;
		
		//System.out.println("Estado"+estado);
		
	}
	
	

	public String getNúmero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

	
	
}
