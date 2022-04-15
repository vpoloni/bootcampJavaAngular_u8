package ej3;

public class ElectrodomesticoApp {
	

	public static void main(String[] args) {
		
		//instancializamos la clase Electrodoméstico 
		Electrodomestico miElectrodomestico = new Electrodomestico(50.99, "azul", 'A', 5.20);
		
		//mostramos el resultado por consola
		System.out.println(miElectrodomestico);
		
		//cambiamos el valor del atributo color
		miElectrodomestico.setColor("rosa");
		
		//getColor invoca el método que comprueba el valor pasado por parámetro
		System.out.println(miElectrodomestico.getColor()); 
		
		//cambiamos el valor del atributo consumoEnergetico
		miElectrodomestico.setConsumoEnergetico('D');
		
		//getConsumoEnergetico invoca el método que comprueba la letra pasada por parámetro
		System.out.println(miElectrodomestico.getConsumoEnergetico());

	}

}
