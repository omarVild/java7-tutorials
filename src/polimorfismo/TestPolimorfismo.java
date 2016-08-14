package polimorfismo;

public class TestPolimorfismo {
	public static void main(String[] args) {
		Animal animal = new Gato();
		animal.hablar();
		animal = new Perro();
		animal.hablar();
		animal = new Pato();
		animal.hablar();
	}
}
