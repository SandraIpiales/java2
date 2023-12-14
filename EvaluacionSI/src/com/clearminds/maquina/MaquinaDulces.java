package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		celda1 = new Celda(cod1);
		celda2 = new Celda(cod2);
		celda3 = new Celda(cod3);
		celda4 = new Celda(cod4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Celda1: " + celda1.getCodigo() + " Saldo: "+ saldo);
		System.out.println("Celda2: " + celda2.getCodigo() + " Saldo: "+ saldo);
		System.out.println("Celda3: " + celda3.getCodigo() + " Saldo: "+ saldo);
		System.out.println("Celda4: " + celda4.getCodigo() + " Saldo: "+ saldo);
	}

	public Celda buscarCelda(String cod1) {
		if (celda1.getCodigo() == cod1) {
			return celda1;
		} else if (celda2.getCodigo() == cod1) {
			return celda2;
		} else if (celda3.getCodigo() == cod1) {
			return celda3;
		} else if (celda4.getCodigo() == cod1) {
			return celda4;
		} else {
			return null;
		}

	}

	public void cargarProducto(Producto productoA, String cod1, int item) {
		Celda celdaRecuperada = buscarCelda(cod1);
		celdaRecuperada.ingresarProducto(productoA, item);
	}

	public void mostrarProductos() {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();

		System.out.println("----Celda " + celda1.getCodigo());
		if (p1 != null) {
			System.out.println("Stock Actual: " + celda1.getStock() + " \nNombre Producto: " + p1.getNombre()
					+ "\nPrecio Producto: " + p1.getPrecio() + "\nCodigo Producto: " + p1.getCodigo());
		} else {
			System.out.println("Stock Actual: " + celda1.getStock() + " \nLa celda no tiene producto");
		}
		System.out.println("----Celda " + celda2.getCodigo());
		if (p2 != null) {
			System.out.println("Stock Actual: " + celda2.getStock() + " \nNombre Producto: " + p2.getNombre()
					+ "\nPrecio Producto: " + p2.getPrecio() + "\nCodigo Producto: " + p2.getCodigo());
		} else {
			System.out.println("Stock Actual: " + celda2.getStock() + " \nLa celda no tiene producto");
		}

		System.out.println("----Celda " + celda3.getCodigo());
		if (p3 != null) {
			System.out.println("Stock Actual: " + celda3.getStock() + " \nNombre Producto: " + p3.getNombre()
					+ "\nPrecio Producto: " + p3.getPrecio() + "\nCodigo Producto: " + p3.getCodigo());
		} else {
			System.out.println("Stock Actual: " + celda3.getStock() + " \nLa celda no tiene producto");
		}
		System.out.println("----Celda " + celda4.getCodigo());
		if (p2 != null) {
			System.out.println("Stock Actual: " + celda4.getStock() + " \nNombre Producto: " + p4.getNombre()
					+ "\nPrecio Producto: " + p4.getPrecio() + "\nCodigo Producto: " + p4.getCodigo());
		} else {
			System.out.println("Stock Actual: " + celda4.getStock() + " \nLa celda no tiene producto");
		}
		System.out.println("***Saldo Actual***: " + saldo);

	}

	public Producto buscarProductoEnCelda(String codCelda) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();

		if (celda1.getCodigo() == codCelda) {
			return p1;
		} else if (celda2.getCodigo() == codCelda) {
			return p2;
		} else if (celda3.getCodigo() == codCelda) {
			return p3;
		} else if (celda4.getCodigo() == codCelda) {
			return p4;
		} else {
			return null;
		}

	}

	public double consultarPrecio(String codCelda) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		if (celda1.getCodigo() == codCelda) {
			return p1.getPrecio();
		} else if (celda2.getCodigo() == codCelda) {
			return p2.getPrecio();
		} else if (celda3.getCodigo() == codCelda) {
			return p3.getPrecio();
		} else if (celda4.getCodigo() == codCelda) {
			return p4.getPrecio();
		} else {
			return 0.00;
		}
	}

	public Celda buscarCeldaProducto(String codProducto) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();

		if (p1 != null) {
			if (p1.getCodigo() == codProducto) {
				return celda1;
			}
		} else if (p2 != null) {
			if (p2.getCodigo() == codProducto) {
				return celda2;
			}
		} else if (p3 != null) {
			if (p3.getCodigo() == codProducto) {
				return celda3;
			}
		} else if (p4 != null) {
			if (p4.getCodigo() == codProducto) {
				return celda4;
			}
		} else {
			return null;
		}
		return null;

	}

	public void incrementarProductos(String codProducto, int itemIcremento) {
		Celda celdaEncontrada = buscarCeldaProducto(codProducto);
		int numStock = celdaEncontrada.getStock();
		numStock = numStock + itemIcremento;
		celdaEncontrada.setStock(numStock);
	}

	public void vender(String codCelda) {
		int numStock;
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();
		if (celda1.getCodigo() == codCelda) {
			celda1.setStock(celda1.getStock() - 1);
			saldo = p1.getPrecio() + saldo;
		} else if (celda2.getCodigo() == codCelda) {
			celda2.setStock(celda2.getStock() - 1);
			saldo = p2.getPrecio() + saldo;
		} else if (celda3.getCodigo() == codCelda) {
			celda3.setStock(celda3.getStock() - 1);
			saldo = p3.getPrecio() + saldo;
		} else if (celda4.getCodigo() == codCelda) {
			celda4.setStock(celda4.getStock() - 1);
			saldo = p4.getPrecio() + saldo;
		}
		mostrarProductos();
		
	}

	public double venderConCambio(String codCelda, double valorIngresado) {
		Producto p1 = celda1.getProducto();
		Producto p2 = celda2.getProducto();
		Producto p3 = celda3.getProducto();
		Producto p4 = celda4.getProducto();

		if (celda1.getCodigo() == codCelda) {
			celda1.setStock(celda1.getStock() - 1);
			double vuelto = valorIngresado - saldo;
			saldo=saldo+p1.getPrecio();
			return vuelto;
		} else if (celda2.getCodigo() == codCelda) {
			celda2.setStock(celda2.getStock() - 1);
			double vuelto = valorIngresado - saldo;
			saldo=saldo+p2.getPrecio();
			return vuelto;
		} else if (celda3.getCodigo() == codCelda) {
			celda3.setStock(celda3.getStock() - 1);
			double vuelto = valorIngresado - saldo;
			saldo=saldo+p3.getPrecio();
			return vuelto;
		} else if (celda4.getCodigo() == codCelda) {
			celda4.setStock(celda4.getStock() - 1);
			double vuelto = valorIngresado - saldo;
			saldo=saldo+p4.getPrecio();
			return vuelto;
		} else {
			return 0;
		}

	}

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
