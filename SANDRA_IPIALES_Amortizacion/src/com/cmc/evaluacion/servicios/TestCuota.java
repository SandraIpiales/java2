package com.cmc.evaluacion.servicios;

import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicios.*;

public class TestCuota {
    public static void main(String[] args) {
        Prestamo préstamo = new Prestamo(5000, 12, 12);
        CalculadoraAmortizacion amortizacion= new CalculadoraAmortizacion();
        double cuota = amortizacion.calcularCuota(préstamo);
        System.out.println("Cuota: " + cuota);
    }
}
