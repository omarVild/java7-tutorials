package inyeccionDependencias;

public class Test {
	public static void main(String[] args) {
		
		/*Usaremos distintos vehiculos
		 * 
		 */
		Persona persona = new Persona();
		persona.setVehiculo(new Bicicleta());
		persona.emprenderViaje();
		persona.setVehiculo(new AutoMovil());
		persona.emprenderViaje();
		persona.setVehiculo(new Motocicleta());
		persona.emprenderViaje();
	}
}
