package escaperoom;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 *La clase AllTests representa una suite para pruebas que agrupa las pruebas unitarias relacionadas con el Escape Room.
 */
public class AllTests {

	/**Método que construye y devuelve una suite para pruebas que incluye las pruebas unitarias.
	 *  
	 * @return Instancia de TestSuite que icluye las pruebas unitarias
	 */
	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		
		//Agrega las pruebas unitarias específicas a la suite
		//$JUnit-BEGIN$
		suite.addTestSuite(ClienteTest.class);
		suite.addTestSuite(SesionTest.class);
		//$JUnit-END$
		return suite;
	}

}
