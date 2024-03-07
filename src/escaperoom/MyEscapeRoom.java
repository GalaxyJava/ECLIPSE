package escaperoom;

import java.util.ArrayList;

/**
 * La clase MyEscapeRoom representa mi Escape Room.
 */
public class MyEscapeRoom {
	
	//Campos
	
	/**
	 * Nombre del Escape Room
	 */
	String nombre;
	
	/**
	 * Lista de sesiones disponibles en mi Escape Room.
	 */
	ArrayList<Sesion> sesion;
	
	/**
	 * Lista de clientes que han participado en el Escape Room.
	 */
	ArrayList<Cliente> cliente;

	//Constructor
	
	/**
	 * Constructor que inicializa el Escape Room con un nombre y crea listas vacías para sesiones y clientes.
	 * @param nombre El nombre del Escape Room.
	 */
	public MyEscapeRoom(String nombre) {
		this.nombre = nombre;	
		sesion = new ArrayList<Sesion>();
		cliente = new ArrayList<Cliente>();
	}
}
