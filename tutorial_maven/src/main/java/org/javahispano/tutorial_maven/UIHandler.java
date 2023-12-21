package org.javahispano.tutorial_maven;

import java.util.InputMismatchException;
import java.util.*;

public class UIHandler {

	private static Scanner scanner = new Scanner(System.in);

	// Método para leer un número double positivo desde el teclado
	public static double comprobarNumeroDoublePositivo(double numero) throws Exception {
		if(numero > 0) {
			return numero;
		}
		else {
			throw new Exception("El numero introducido no es positivo.");
		}
	}

	// Método para mostrar un mensaje en la pantalla
	public static String mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
		return mensaje;
	}
}
