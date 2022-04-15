package ej4;

public class SerieApp {

	public static void main(String[] args) {
	
		//instancializamos la clase Serie
		Serie miSerie = new Serie("Vikings", 6, "Drama histórico", "Michael Hirst");
		
		//cambiamos el valor del atributo título
		miSerie.setTitulo("Los Vikingos");
		
		//accedemos al atributo concreto del objeto creado previamente
		System.out.println("Mi serie preferida es '" + miSerie.getTitulo() + "'");
		
		//mostramos el resultado por consola
		System.out.println(miSerie);

	}

}
