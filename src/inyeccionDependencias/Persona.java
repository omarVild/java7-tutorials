package inyeccionDependencias;

public class Persona {
	private Vehiculo vehiculo;
	public void emprenderViaje(){
		vehiculo.comenzarViaje();
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
}
