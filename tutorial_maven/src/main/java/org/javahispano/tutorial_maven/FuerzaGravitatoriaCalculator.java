package org.javahispano.tutorial_maven;

//Clase que representa la lógica de dominio (cálculo de la fuerza gravitatoria)
public class FuerzaGravitatoriaCalculator {

	// Método para calcular la fuerza gravitatoria
	public static double calcularFuerzaGravitatoria(double masa1, double masa2, double distancia) {
		final double constanteGravitatoria = 6.67430e-11;
		return (constanteGravitatoria * masa1 * masa2) / (distancia * distancia);
	}
}
