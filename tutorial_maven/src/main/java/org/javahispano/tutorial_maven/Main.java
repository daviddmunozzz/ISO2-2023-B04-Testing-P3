package org.javahispano.tutorial_maven;

import java.util.InputMismatchException;

import java.util.Scanner;

public class Main {

	final static Scanner TECLADO = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Introduzca la masa del primer cuerpo: ");
			double masa1 = TECLADO.nextDouble();
			masa1 = UIHandler.comprobarNumeroDoublePositivo(masa1);
			
			System.out.println("Introduzca la masa del primer cuerpo: ");
			double masa2 = TECLADO.nextDouble();
			masa2 = UIHandler.comprobarNumeroDoublePositivo(masa2);
			
			System.out.println("Introduzca la distancia entre los dos cuerpos: ");
			double distancia = TECLADO.nextDouble();
			distancia = UIHandler.comprobarNumeroDoublePositivo(distancia);
			
			double fuerzaGravitatoria = FuerzaGravitatoriaCalculator.calcularFuerzaGravitatoria(masa1, masa2,
					distancia);

			UIHandler.mostrarMensaje("La fuerza gravitatoria entre los cuerpos es: " + fuerzaGravitatoria + " N");
		} catch (Exception e) {
			UIHandler.mostrarMensaje("Error: " + e.getMessage());
		} finally {
			UIHandler.mostrarMensaje("Programa terminado.");
		}
	}
}
