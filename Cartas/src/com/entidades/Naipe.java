package com.entidades;

import java.util.ArrayList;
import java.util.Collections;
import com.entidades.*;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta>cartas;
	
	
	public Naipe() {
		numerosPosibles = new ArrayList<Numero> ();
		cartas = new ArrayList<Carta>();
		Numero n1= new Numero("A",11);
		Numero n2= new Numero("2",2);
		Numero n3= new Numero("3",3);
		Numero n4= new Numero("4",4);
		Numero n5= new Numero("5",5);
		Numero n6= new Numero("6",6);
		Numero n7= new Numero("7",7);
		Numero n8= new Numero("8",8);
		Numero n9= new Numero("9",9);
		Numero n10= new Numero("10",10);
		Numero nJ= new Numero("J",10);
		Numero nQ= new Numero("Q",10);
		Numero nK= new Numero("K",10);
		numerosPosibles.add(n1);
		numerosPosibles.add(n2);
		numerosPosibles.add(n3);
		numerosPosibles.add(n4);
		numerosPosibles.add(n5);
		numerosPosibles.add(n6);
		numerosPosibles.add(n7);
		numerosPosibles.add(n8);
		numerosPosibles.add(n9);
		numerosPosibles.add(n10);
		numerosPosibles.add(nJ);
		numerosPosibles.add(nQ);
		numerosPosibles.add(nK);
		Palos p= new Palos();
		for(int i=0;i<numerosPosibles.size();i++) {
			Numero elementoNumero= numerosPosibles.get(i);
			Carta carta1 = new Carta(elementoNumero,p.getCorazon_negro());
			Carta carta2 = new Carta(elementoNumero,p.getCorazon_rojo());
			Carta carta3 = new Carta(elementoNumero,p.getDiamante());
			Carta carta4 = new Carta(elementoNumero,p.getTrebol());
			cartas.add(carta1);
			cartas.add(carta2);
			cartas.add(carta3);
			cartas.add(carta4);
		}
	}


	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	
	public ArrayList<Carta> barajar(){
		ArrayList<Carta> auxiliar= new ArrayList<Carta>();
		Carta elementoCarta;
		String cartaPosicion;
		int obtenerPosicion;
		for(int i=0;i<=100;i++) {
			obtenerPosicion=Random.obtenerPosicion();
			elementoCarta= cartas.get(obtenerPosicion);
			cartaPosicion=elementoCarta.getEstado();
			if(cartaPosicion.equals("N")) {
				elementoCarta.setEstado("C");
				auxiliar.add(elementoCarta);
			}
		}
		for(int i=0;i<cartas.size();i++) {
			elementoCarta= cartas.get(i);
			cartaPosicion=elementoCarta.getEstado();
			if(cartaPosicion.equals("N")) {
				auxiliar.add(elementoCarta);
			}
		}
		return auxiliar;
	}
	
	public void imprimir() {
		Carta c1;
		Numero n;
		for(int i=0;i<cartas.size();i++) {
			c1=cartas.get(i);
			n=c1.getNumero();
			System.out.println(n.getNumeroCarta()+"-Palo: "+c1.getPalo());
		}
		
		
		System.out.println(cartas.size());
		
		System.out.println("Barjar"+barajar());
	}
	
}
