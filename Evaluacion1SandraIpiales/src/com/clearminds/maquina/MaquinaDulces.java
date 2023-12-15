package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celdaA) {
		celdas.add(celdaA);
	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda: " + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codCelda) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codCelda.equals(elementoCelda.getCodigo())) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto productoA, String codCelda, int iemInicial) {
		Celda celdaRecuperada = buscarCelda(codCelda);
		celdaRecuperada.ingresarProducto(productoA, iemInicial);
	}

	public void mostrarProductos() {
		Celda elementoCelda = null;
		Producto p1 = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			p1 = elementoCelda.getProducto();
			System.out
					.println("----Celda " + elementoCelda.getCodigo() + "-- Stock Actual: " + elementoCelda.getStock());
			if (p1 != null) {
				System.out.println(
						"Nombre: " + p1.getNombre() + " Codigo: " + p1.getCodigo() + " Precio: " + p1.getPrecio());
			} else {
				System.out.println("Sin producto Asignado");
			}
		}
		System.out.println("***Saldo Actual***: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codCelda) {
		Celda elementoCelda = null;
		Producto productoEncontrado = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codCelda.equals(elementoCelda.getCodigo())) {
				productoEncontrado = elementoCelda.getProducto();
			}
		}
		return productoEncontrado;
	}

	public double consultarPrecio(String codCelda) {
		Celda elementoCelda = null;
		Producto productoEncontrado = null;
		double precioProducto = 0;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (codCelda.equals(elementoCelda.getCodigo())) {
				productoEncontrado = elementoCelda.getProducto();
				precioProducto = productoEncontrado.getPrecio();
			}
		}
		return precioProducto;
	}

	public Celda buscarCeldaProducto(String codProducto) {
		Celda elementoCelda = null;
		Producto p1 = null;
		Celda celdaEncontrada = null;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			p1 = elementoCelda.getProducto();
			if (p1 != null) {
				if (codProducto.equals(p1.getCodigo())) {
					celdaEncontrada = elementoCelda;
				}
			}

		}
		return celdaEncontrada;
	}
	
	public void incrementarProductos(String codProducto, int incremento) {
		Celda celdaEncontrada= buscarCeldaProducto(codProducto);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+incremento);
	}
	public void vender(String codCelda){
		Celda elementoCelda=null;
		Producto productoEnCelda=null;
		for (int i=0; i<celdas.size();i++) {
			elementoCelda=celdas.get(i);
			productoEnCelda=elementoCelda.getProducto();
			if(codCelda.equals(elementoCelda.getCodigo())) {
				elementoCelda.setStock(elementoCelda.getStock()-1);
				saldo=saldo+productoEnCelda.getPrecio();
			}
		}
		mostrarProductos();
	}
	

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
