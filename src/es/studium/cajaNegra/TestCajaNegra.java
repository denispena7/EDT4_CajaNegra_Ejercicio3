package es.studium.cajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCajaNegra {

	@Test
	void pedirProducto1() 
	{
		int resultadoReal = CajaNegra.pedirProducto(1);
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}

	@Test
	void pedirProducto2() 
	{
		int resultadoReal = CajaNegra.pedirProducto(0);
		int resultadoEsperado = 0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void pedirProducto3() 
	{
		int resultadoReal = CajaNegra.pedirProducto(51);
		int resultadoEsperado = 0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void seleccionarTipoPago1() 
	{
		int resultadoReal = CajaNegra.seleccionarTipoPago(10);
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void seleccionarTipoPago2() 
	{
		int resultadoReal = CajaNegra.seleccionarTipoPago(20);
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void seleccionarTipoPago3() 
	{
		int resultadoReal = CajaNegra.seleccionarTipoPago(30);
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void seleccionarTipoPago4() 
	{
		int resultadoReal = CajaNegra.seleccionarTipoPago(40);
		int resultadoEsperado = 1;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
	
	@Test
	void seleccionarTipoPago5() 
	{
		int resultadoReal = CajaNegra.seleccionarTipoPago(15);
		int resultadoEsperado = 0;
		
		assertEquals(resultadoReal, resultadoEsperado);
	}
}
