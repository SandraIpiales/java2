package com.krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;

	public Estudiante(String cedula, String nombre, String apellido) {
		notas = new ArrayList<Nota>();
		this.apellido = apellido;
		this.cedula = cedula;
		this.nombre = nombre;
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

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}

	public ArrayList<Nota> getNotas() {
		return notas;
	}

	public void agregarNota(Nota nuevaNota) {
		Nota elementoNota;
		String codigoMateria;
		Materia elementoMateria, codigoNuevaNota;
		boolean temp = false;
		if (nuevaNota.getCalificacion() >= 0 && nuevaNota.getCalificacion() <= 10) {
			if (notas.size() == 0) {
				notas.add(nuevaNota);
			} else {
				for (int i = 0; i < notas.size(); i++) {
					elementoNota = notas.get(i);
					elementoMateria = elementoNota.getMateria();
					codigoMateria = elementoMateria.getCodigo();
					codigoNuevaNota = nuevaNota.getMateria();
					if (codigoMateria.equals(codigoNuevaNota.getCodigo())) {
						System.out.println("Nota ya Ingresada: Materia " + codigoNuevaNota.getCodigo() + " "
								+ codigoNuevaNota.getNombre());
					} else {
						temp = true;
					}
				}
			}
			if (temp) {
				notas.add(nuevaNota);
			}
		} else {
			System.out.println("Nota Fuera de Rango " + nuevaNota.getCalificacion());
		}
		/*
		 * System.out.println("Dimension" + notas.size()); for (int k = 0; k <
		 * notas.size(); k++) { elementoNota = notas.get(k); elementoMateria =
		 * elementoNota.getMateria(); System.out.println(elementoMateria.getCodigo() +
		 * " " + elementoMateria.getNombre()); }
		 */
	}

	public void modificarNota(String codigo, double nuevaNota) {
		Nota elementoNota;
		String codigoMateria;
		double notaAgregada;
		Materia elementoMateria, codigoNuevaNota;
		if (nuevaNota >= 0 && nuevaNota <= 10) {
			for (int i = 0; i < notas.size(); i++) {
				elementoNota = notas.get(i);
				elementoMateria = elementoNota.getMateria();
				codigoMateria = elementoMateria.getCodigo();
				notaAgregada = elementoNota.getCalificacion();
				if (codigo.equals(codigoMateria)) {
					System.out.println("Materia Encontrada para Modificar-Nota");
					elementoNota.setCalificacion(nuevaNota);
					break;
				} else {
					System.out.println("Codigo de Materia No existente");
				}
			}
		} else {
			System.out.println("Nota Fuera de Rango "+ nuevaNota);
		}

	}

	public double calcularPromedioNotasEstudiante() {
		Nota elementoNota;
		double sumaCalificaciones = 0;
		double promedio;
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			sumaCalificaciones = sumaCalificaciones + elementoNota.getCalificacion();
		}
		promedio = sumaCalificaciones / notas.size();
		return promedio;
	}

	public void mostrar() {
		Nota elementoNota;
		Materia elementoMateria;
		System.out.println("Estudiante [Nombre=" + nombre + ", Apellido=" + apellido + ", Cédula=" + cedula + "]");
		for (int i = 0; i < notas.size(); i++) {
			elementoNota = notas.get(i);
			if (elementoNota != null) {
				elementoMateria= elementoNota.getMateria();
				System.out.println("[Estudiante = Materia= " + elementoMateria.getNombre() +", Código= "+elementoMateria.getCodigo()+ ", Calificación= "
						+ elementoNota.getCalificacion() + "]");
			}
		}
	}

}
