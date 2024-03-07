package escaperoom;

/**
 * La clase Cliente representa a la persona que puede realizar las reservas para el Escape Room
 */
public class Cliente {

	    // Campos
	
		/**
		 * Nombre de la persona
		 */
		private String nombre; 
		
		/**
		 * Nº máximo de reservas que puede hacer una persona
		 */
		private int maximoReservas; 
		
		//Constructor
		
		/**
		 * Constructor que inicializa el nombre como "nombre desconocido" con 3 reservas como máximo
		 */
		public Cliente() {
			nombre = "nombre desconocido";
			maximoReservas = 3;
		}
		
		
		//Métodos de acceso
		
		/**
		 * Obtiene el nombre de la persona
		 * 
		 * @return Devuelve el nombre de la persona
		 */
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * Indica el nombre de la persona
		 * @param cualquierNombre
		 */
		public void setNombre(String cualquierNombre) {
			nombre = cualquierNombre;
		}
		
		/**
		 * Obtiene el número máximo de reservas que puede realizar la persona.
		 * @return El número máximo de reservas.
		 */
		public int getMaximoReservas() {
			return maximoReservas;
		}
		
		/**
		 * Indica el número máximo de reservas que puede realizar la persona.
		 * @param maximoReservas Indica nuevo número máximo de reservas.
		 */
		public void setMaximoReservas(int maximoReservas) {
			this.maximoReservas = maximoReservas;
		}
		
		//Método toString
		
		/**
		 * Devuelve una representación en cadena del objeto Cliente, incluyendo nombre y nº máx. de reservas
		 * @return Representación en cadena del objeto Cliente.
		 */
		public String toString() {
			return this.getNombre() + " (" + this.getMaximoReservas() +
			" Reservas)";
		}
}
