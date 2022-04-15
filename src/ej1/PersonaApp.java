package ej1;

public class PersonaApp {

	public static void main(String[] args) {
		
		//instancializamos la clase Persona 
		Persona miPersona = new Persona("Veronika", 29, "V123456789P", 'M', 52, 1.63);
		
		//cambiamos el valor del objeto miPersona
		miPersona.setNombre("Verónica");
		
		//mostramos el resultado por consola
		System.out.println(miPersona);

	}

}
