package com.krakedev.servicios;

import java.util.ArrayList;

import com.entidades.Carta;
import com.entidades.Naipe;
import com.entidades.Numero;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;
	private ArrayList<Carta> naipeBarajado;
	private ArrayList<Carta> listaCartasJugador;
	private ArrayList<String> listaJugadores;

	public Juego(ArrayList<String> idJugadores) {
		this.naipe = new Naipe();
		listaJugadores=new ArrayList<String>();
		listaJugadores.addAll(idJugadores);
		listaCartasJugador = new ArrayList<Carta>();
		cartasJugadores = new ArrayList<ArrayList<Carta>>();
		this.naipeBarajado = naipe.barajar();

	}

	public Naipe getNaipe() {
		return naipe;
	}

	public void setNaipe(Naipe naipe) {
		this.naipe = naipe;
	}

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	public void setCartasJugadores(ArrayList<ArrayList<Carta>> cartasJugadores) {
		this.cartasJugadores = cartasJugadores;
	}

	public void entregarCartas(int cartasPorJugador) {
		Carta cartaBarajada;
		int posicion=0;
		
		for (int j = 0; j < listaJugadores.size() ; j++) {
			listaCartasJugador.clear();
			posicion=j*cartasPorJugador;
			System.out.println(posicion);
			for (int i = 0; i < cartasPorJugador; i++) {
				
				cartaBarajada = naipeBarajado.get(posicion+i);
				listaCartasJugador.add(cartaBarajada);
			}
			cartasJugadores.add(j, new ArrayList<>(listaCartasJugador));
			System.out.println(cartasJugadores);
			
			
			
		}
	
	}

	public int devolverTotal(int idJugador) {
		int sumaTotal=0;
			ArrayList<Carta> recorrido=cartasJugadores.get(idJugador);
			Carta elementoCarta;
			Numero elementoNumero;
			for(int j=0;j<recorrido.size();j++) {
				elementoCarta= recorrido.get(j);
				elementoNumero=elementoCarta.getNumero();
				sumaTotal= elementoNumero.getValor();
			}			
		
		return sumaTotal;
	}
	
	public String determinarGanador() {
		String idGanador=listaJugadores.get(0);
		int sumaGanador= devolverTotal(0);
		String elementoJugador;
		
		for(int i =0; i<listaJugadores.size();i++) {
			elementoJugador=listaJugadores.get(i);
			if(sumaGanador<devolverTotal(i)) {
				idGanador=elementoJugador;
				sumaGanador=devolverTotal(i);
			}else if(sumaGanador==devolverTotal(i)){
				idGanador="Empate";
			}
		}
		return idGanador;
	}

}
