package org.javahispano.tutorial_maven;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.InputMismatchException;

import org.javahispano.tutorial_maven.FuerzaGravitatoriaCalculator;
import org.javahispano.tutorial_maven.UIHandler;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

	@Test
	public void testCalcularFuerzaGravitatoria() {
		// Prueba con los valores del trabajo teórico para el cálculo de la fuerza
		// gravitatoria

		double masa1 = 100000.0;
		double masa2 = 50000.0;
		double distancia = 60000.0;

		double resultado = FuerzaGravitatoriaCalculator.calcularFuerzaGravitatoria(masa1, masa2, distancia);

		double valorEsperado = 9.26e-11;

		assertEquals(valorEsperado, resultado, 1e-9);
	}

	@Test
	public void testComprobarDoublePositivo_masaPositiva() throws Exception {
		double masa = 100000.0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
		double valorEsperado = 100000.0;

		assertEquals(valorEsperado, resultado, 0.001);
	}

	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_masaNegativa() throws Exception {
		// En este test se le pasará un número double negativo. Tras la ejecución del
		// método "comprobarNumeroDoublePositivo", esperamos obtener euna excepción.
		double masa = -100000.0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
	}

	@Test
	public void testComprobarDoublePositivo_masa_grande() throws Exception {
		double masa = 2e13;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
		double valorEsperado = 2e13;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_masa_VLigera() throws Exception {
		double masa = 0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
	}
	
	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_masa_VPesada1() throws Exception {
		double masa = -1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
	}
	
	@Test
	public void testComprobarDoublePositivo_masa_VPesada2() throws Exception {
		double masa = 1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
		double valorEsperado = 1;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testComprobarDoublePositivo_masa_VPesada3() throws Exception {
		double masa = (1.898e9)-1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
		double valorEsperado = (1.898e9)-1;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testComprobarDoublePositivo_masa_VPesada4() throws Exception {
		double masa = (1.898e9)+1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(masa);
		double valorEsperado = (1.898e9)+1;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testComprobarDoublePositivo_distanciaPositiva() throws Exception {
		double distancia = 60000.0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
		double valorEsperado = 60000.0;

		assertEquals(valorEsperado, resultado, 0.001);
	}

	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_distanciaNegativa() throws Exception {
		double distancia = -300000.0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
	}

	@Test
	public void testComprobarDoublePositivo_distancia_grande() throws Exception {
		double distancia = 300000;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
		double valorEsperado = 300000;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_distancia_VLigera() throws Exception {
		double distancia = 0;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
	}	
	
	@Test(expected = Exception.class)
	public void testComprobarDoublePositivo_distancia_VPesada1() throws Exception {
		double distancia = -1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
	}
	
	@Test
	public void testComprobarDoublePositivo_distancia_VPesada2() throws Exception {
		double distancia = 1;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
		double valorEsperado = 1;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testComprobarDoublePositivo_distancia_VPesada3() throws Exception {
		double distancia = 119.999;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
		double valorEsperado = 119.999;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testComprobarDoublePositivo_distancia_VPesada4() throws Exception {
		double distancia = 120.001;

		double resultado = UIHandler.comprobarNumeroDoublePositivo(distancia);
		double valorEsperado = 120.001;

		assertEquals(valorEsperado, resultado, 0.001);
	}
	
	@Test
	public void testMostrarMensaje() throws Exception {
		String mensaje = "Prueba";

		String resultado = UIHandler.mostrarMensaje(mensaje);
		String valorEsperado = "Prueba";

		assertEquals(valorEsperado, resultado);
	}
}
