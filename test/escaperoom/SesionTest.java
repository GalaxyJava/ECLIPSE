package escaperoom;

import junit.framework.TestCase;

/**
 * La clase SesionTest contiene pruebas unitarias para la clase `Sesion´.
 */
public class SesionTest extends TestCase {

		/**
		 * Prueba para el constructor de Sesión.
		 */
		public void testSesion() {
			//Se crea una instancia de Sesión con el título "Escapa como puedas"
			Sesion s1  = new Sesion("Escapa como puedas");
			//Se verifica que el título de la sesión sea "Escapa como puedas".
			assertEquals("Escapa como puedas", s1.title);
			//Se verifica que el origen de la sesión sea "Origen desconocido".
			assertEquals("Origen desconocido", s1.origen);
		}
		
		/**
		 * Prueba para el método getCliente de Sesión.
		 */
		public void testGetCliente() {
			//Se crea una instancia de Sesión con el título "Sin salida"
			Sesion s2  = new Sesion("Sin salida");
			//Se crea un cliente y se establece como el cliente asociado a la sesión.
			Cliente cl2 = new Cliente();
			cl2.setNombre("Jose");
			
			//method to say sesion is loaned to this cliente
			//Se obtiene el nombre del cliente asociado a la sesión y se verifica que sea "Jose".
			s2.setCliente(cl2);
			
			//get the name of the cliente who has the sesion
//			Cliente testCliente = s2.getCliente();
//			String testName = testCliente.getNombre();
			
			
			String testNombre = s2.getCliente().getNombre();
			assertEquals("Jose", testNombre);
			
			
			}
		}
