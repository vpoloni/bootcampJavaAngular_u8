package ej3;

/*Crearemos una clase llamada Electrodomestico con las siguientes características:
• Sus atributos son precio base, color, consumo energético (letras entre A y F) ypeso.
Indica que se podrán heredar.
• Por defecto, el color sera blanco, el consumo energético sera F, el precioBase es de
100 € y el peso de 5 kg. Usa constantes para ello.
• Los colores disponibles son blanco, negro, rojo, azul y gris. No importa si el nombre
esta en mayúsculas o en minúsculas.
• Los constructores que se implementaran serán
o Un constructor por defecto.
o Un constructor con el precio y peso. El resto por defecto.
o Un constructor con todos los atributos.*/

public class Electrodomestico {
	
	//constantes
	private final String COLOR_POR_DEFECTO = "blanco";
	private final char CONSUMO_ENERGETICO_POR_DEFECTO = 'F';
	private final double PRECIO_BASE_POR_DEFECTO = 100;
	private final double PESO_POR_DEFECTO = 5;
	
	//atributos
	double precioBase;
	String color;
	char consumoEnergetico;
	double peso;
	
	//constructor por defecto
	public Electrodomestico() {
		
		this.precioBase = PRECIO_BASE_POR_DEFECTO;
		this.color = COLOR_POR_DEFECTO;
		this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		this.peso = PESO_POR_DEFECTO;
		
	}

	//constructor con el precio base y el peso, el resto por defecto
	public Electrodomestico(double precioBase, double peso) {
		
		this.precioBase = precioBase;
		this.color = COLOR_POR_DEFECTO;
		this.consumoEnergetico = CONSUMO_ENERGETICO_POR_DEFECTO;
		this.peso = peso;
	}

	//constructor con todos los atributos como parámetros
	public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
		
		this.precioBase = precioBase;
		this.color = comprobarColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
		
	}

	//getters y setters
	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = comprobarColor(color);
	}


	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}


	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = comprobarConsumoEnergetico(consumoEnergetico);
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	//comprobamos si el color pasado por parámetro pertenece al arr de colores posibles creados
	public String comprobarColor(String color) {
		
		String colores [] = {"blanco", "negro", "rojo", "azul", "gris"};
		
		String colorEncontrado = "";
		boolean seHaEncontrado = false;
		
		for (int i = 0; i <colores.length; i++) {
			if (color.equals(colores[i])) {
				seHaEncontrado = true;
			} 
		}
		
		if (seHaEncontrado) {
			colorEncontrado = color;
		} else {
			colorEncontrado = COLOR_POR_DEFECTO;
		}
		
		return colorEncontrado;	
	}
	
	//comprobamos la letra de consumo energético pásada como parámetro
	public char comprobarConsumoEnergetico(char letra) {
		
		char letras [] = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		char letraEncontrada = 0;
		
		for (int i = 0; i < letras.length; i++ ) {
			if(letra == CONSUMO_ENERGETICO_POR_DEFECTO) {
				letraEncontrada = letra;
			} else {
				letraEncontrada = CONSUMO_ENERGETICO_POR_DEFECTO;
			}
		
		}
		return letraEncontrada;
		
	}
		
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
