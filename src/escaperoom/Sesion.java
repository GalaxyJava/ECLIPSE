package escaperoom;

/**
 * La clase Sesion representa una sesion en el Escape Room.
 */
public class Sesion {
	
	// Campos
	
	/**
	 * Nombre de la sesión
	 */
	String title;
	
	/**
	 * Origen o ubicación de la sesión
	 */
	String origen;
	
	/**
	 * Cliente asociado a la sesión
	 */
	Cliente cliente;
	
	// Constructor
	
	/**
	 * Constructor que inicia la sesión con un nombre e indica el origen como "desconocido"
	 * @param string Nombre de la sesión
	 */
	public Sesion(String string) {
		this.title = string;
		this.origen = "Origen desconocido";
	}
/*
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getTitle() {
		return title;
	}
*/
	//Métodos de acceso
	
	/**
	 * Indica el cliente que se asocia a la sesión.
	 * @param cl2 Cliente que participa en la sesión.
	 */
	public void setCliente(Cliente cl2) {
		this.cliente = cl2;
	}

	/**
	 * Obtiene el cliente que fue asociado a la sesión
	 * @return Cliente asociado a la sesión.
	 */
	public Cliente getCliente() {
		return this.cliente;
	}

}
