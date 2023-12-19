package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		telefonos= new ArrayList<Telefono>();

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

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
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
	
	public void agregarTelefono(Telefono telefonoA) {
		telefonos.add(telefonoA);
	}
	
	public void mostrarTelefonos() {
		Telefono elementoTelefono;
		String estadoListaTelefono;
		for(int i=0; i<telefonos.size();i++) {
			elementoTelefono= telefonos.get(i);
			estadoListaTelefono=elementoTelefono.getEstado();
			if(estadoListaTelefono.equals("C")) {
				System.out.println("Teléfonos con estado 'C':\nNúmero:" + elementoTelefono.getNúmero()+", Tipo: "+elementoTelefono.getTipo());
			}
		}
		
	}
	
	public ArrayList<Telefono> recuperarIncorrectos() {
		Telefono elementoTelefono;
		String estadoListaTelefono;
		ArrayList<Telefono> listaTelefonoError=new ArrayList<Telefono>();
		for(int i=0; i<telefonos.size();i++) {
			elementoTelefono= telefonos.get(i);
			estadoListaTelefono=elementoTelefono.getEstado();
			if(estadoListaTelefono.equals("E")) {
				listaTelefonoError.add(elementoTelefono);			}
		}
		
		return listaTelefonoError;
	}

}
