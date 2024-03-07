package escaperoom;

import java.util.ArrayList;

import junit.framework.TestCase;

/**
 * La clase MyEscapeRoomTest contiene pruebas unitarias para la clase MyescapeRoom
 */
public class MyEscapeRoomTest extends TestCase {
	
	/**
	 * Prueba para el constructo de MyEscapeRoom
	 */
	//test constructor
	public void testMyEscapeRoom() {
		//Se crea una instancia de MyEscapeRoom con el nombre "Test".
		MyEscapeRoom mer = new MyEscapeRoom("Test");
		
		//Se verifica que el nombre del Escape Room sea "Test".
		assertEquals("Test", mer.nombre);
		
		//Se verifica que el campo `sesion´ sea una instancia de ArrayList.
		assertTrue(mer.sesion instanceof ArrayList);
		
		//Se verifica que el campo `cliente´ sea una instancia de ArrayList.
		assertTrue(mer.cliente instanceof ArrayList);
	}
}
