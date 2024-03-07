package escaperoom;

import junit.framework.TestCase;


/**
 * La clase ClienteTest contiene pruebas unitarias para la clase Cliente.
 */
public class ClienteTest extends TestCase {
	
	/**
	 * Prueba para el constructor de Cliente.
	 */
	public void testCliente() {
		Cliente cl1 = new Cliente();
		assertEquals("nombre desconocido", cl1.getNombre());
		assertEquals(3, cl1.getMaximoReservas());
	}
	
	/**
	 * Prueba para el método setNombre de Cliente.
	 */
	
	public void testSetNombre() {
		Cliente cl2 = new Cliente();
		cl2.setNombre("Laura");
		assertEquals("Laura", cl2.getNombre());	
	}
	
	/**
	 * Prueba para el método setMaximoReservas de Cliente.
	 */
	public void testSetMaximoReservas() {
		Cliente cl3 = new Cliente();
		cl3.setMaximoReservas(3);
		assertEquals(3, cl3.getMaximoReservas());	
	}
	
	/**
	 * Prueba para el método toString de Cliente.
	 */
	public void testToString() {
		Cliente cl4 = new Cliente ();
		cl4.setNombre("Laura Garcia");
		cl4.setMaximoReservas(3);
		String testString = "Laura Garcia (3 Reservas)";
		assertEquals(testString, cl4.toString());
	}
}
