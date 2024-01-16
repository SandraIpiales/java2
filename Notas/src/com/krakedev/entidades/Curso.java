package com.krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;

	public Curso() {
		estudiantes = new ArrayList<Estudiante>();
	}

	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}

	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante elementoEstudiante;

		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			if (elementoEstudiante.getCedula() == estudiante.getCedula()) {
				System.out.println("Estudiante Dentro del Curso");
			} else {
				return null;
			}
		}
		return null;
	}

	public void matricularEstudiante(Estudiante estudiante) {
		Estudiante elementoEstudiante;
		int elementoCedula;

		if (estudiantes.contains(estudiante.getCedula())) {
			System.out.println("Estudiante Dentro del Curso");
		} else {
			estudiantes.add(estudiante);
		}

	}

	public double calcularPromedioCurso() {
		Estudiante elementoEstudiante;
		double sumaPromedios = 0;
		double promedioIndividual = 0;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			sumaPromedios = sumaPromedios + elementoEstudiante.calcularPromedioNotasEstudiante();
		}
		promedioIndividual = sumaPromedios / estudiantes.size();
		return promedioIndividual;
	}

	public void mostrar() {
		Estudiante elementoEstudiante;
		ArrayList<Nota> elementoNotas;
		Nota notasEstudiante;
		Materia elementoMateria;
		for (int i = 0; i < estudiantes.size(); i++) {
			elementoEstudiante = estudiantes.get(i);
			elementoNotas = elementoEstudiante.getNotas();
			if (elementoEstudiante != null) {
				System.out.println("Curso [Nombre=" + elementoEstudiante.getNombre() + ", Apellido="
						+ elementoEstudiante.getApellido() + ", Cédula=" + elementoEstudiante.getCedula() + "]");
				for (int j = 0; j < elementoNotas.size(); j++) {
					notasEstudiante = elementoNotas.get(j);
					elementoMateria = notasEstudiante.getMateria();
					if (notasEstudiante != null) {
						System.out.println("Curso-Notas [Materia=" + elementoMateria.getNombre() + ", Código= "
								+ elementoMateria.getCodigo() + ", Calificacion=" + notasEstudiante.getCalificacion()
								+ "]");
					}

				}
			}

		}
	}

}
