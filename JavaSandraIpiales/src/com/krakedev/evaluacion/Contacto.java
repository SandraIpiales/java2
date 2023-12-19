package com.krakedev.evaluacion;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;

	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public void imprimir() {
		/*System.out.println("Cédula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		if(direccion!=null) {
			System.out.println("Dirección: \nCallePrincipal: " + direccion.getCallePrincipal() + "\nCalleSecundaria: "
				+ direccion.getCalleSecundaria());
		}else {
			System.out.println("Direccion no Ingresada");
		}*/
		System.out.println("***"+nombre+" "+apellido+"***");
		if(direccion!=null) {
			System.out.println("Dirección: "+ direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		}else {
			System.out.println("No tiene asociada una dirección");
		}
				
		
	}

}
