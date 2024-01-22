package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int numero) {
		String valor;
		if(numero>0&& numero<10) {
			valor= "0"+numero;
		}else {
			valor= numero +"";
		}
		return valor;
	}
	
	public static String formatearDia(int numeroDia) {
		String nombreDia;

        switch (numeroDia) {
            case 0:
                nombreDia = "Lunes";
                break;
            case 1:
                nombreDia = "Martes";
                break;
            case 2:
                nombreDia = "Miércoles";
                break;
            case 3:
                nombreDia = "Jueves";
                break;
            case 4:
                nombreDia = "Viernes";
                break;
            case 5:
                nombreDia = "Sábado";
                break;
            case 6:
                nombreDia = "Domingo";
                break;
            default:
                nombreDia = "Número de día inválido";
                break;
        }
		return nombreDia;
	}
}
