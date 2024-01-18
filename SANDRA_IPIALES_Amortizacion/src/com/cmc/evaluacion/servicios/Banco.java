package com.cmc.evaluacion.servicios;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.Cliente;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	
	public Banco() {
		prestamos = new ArrayList<Prestamo>();
		clientes = new ArrayList<Cliente>();
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente buscarCliente(String cedula) {
		Cliente elementoCliente;
		Cliente cedulaEncontrada = null;
		for (int i = 0; i < clientes.size(); i++) {
			elementoCliente = clientes.get(i);
			if (elementoCliente.getCedula().equals(cedula)) {
				cedulaEncontrada = elementoCliente;
			}
		}
		return cedulaEncontrada;
	}

	public void registrarCliente(Cliente clienteA) {
		Cliente elementoCliente;

		if (clientes.size() == 0) {
			clientes.add(clienteA);
		} else {
			for (int j = 0; j <clientes.size(); j++) {
				elementoCliente = clientes.get(j);
				if (buscarCliente(clienteA.getCedula())==null) {
					clientes.add(clienteA);
				} else {
					System.out.println("El Cliente Existe:" + buscarCliente(clienteA.getCedula()).getCedula());
				}
				j++;
			}
		}

	}
	
	public void asignarPrestamo(String cedula,Prestamo prestamo) {
		Cliente clienteEncontrado=buscarCliente(cedula);
		if(clienteEncontrado==null) {
			System.out.println("No es un Cliente del Banco");
		}else {
			prestamo.setCliente(clienteEncontrado);
			CalculadoraAmortizacion calculadoraA= new CalculadoraAmortizacion();
            calculadoraA.generarTabla(prestamo);
			prestamos.add(prestamo);
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Cliente encontrarCliente=buscarCliente(cedula);
		ArrayList<Prestamo> prestamosCliente=new ArrayList<>();
		Prestamo elementoPrestamo;
		if(encontrarCliente!=null) {
			for(int i=0;i<prestamos.size();i++) {
				elementoPrestamo=prestamos.get(i);
				if(elementoPrestamo.getCliente()==encontrarCliente) {
					prestamosCliente.add(elementoPrestamo);
				}
			}
		}
			
		return prestamosCliente;
	}
}
