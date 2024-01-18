package com.cmc.evaluacion;

import java.text.DecimalFormat;

public class Utilitario {
	public double redondear(double valor) {
		DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormateado = df.format(valor);
        resultadoFormateado = resultadoFormateado.replace(",", ".");
        double resultadoRedondeado = Double.parseDouble(resultadoFormateado);

       
		return resultadoRedondeado;

	}
}
