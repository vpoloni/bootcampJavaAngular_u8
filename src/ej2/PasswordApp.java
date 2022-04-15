package ej2;

import java.util.Random;

import javax.swing.JOptionPane;

public class PasswordApp {

	public static void main(String[] args) {
		
		//pedimos al usuario que introduzca la longitud del password deseada
		String longitud= JOptionPane.showInputDialog("Itroduce la longitud de la contraseña: ");
		
		//la parseamos de str a int
		int longitudParseada = Integer.parseInt(longitud);
		
		//es de tipo cadena para poder concatenar los num aleatorios de cada iteración
		String passwordAleatorio = "";
		for (int i = 0; i < longitudParseada; i++) {
			Random rnd = new Random();
			passwordAleatorio+= (int) (rnd.nextDouble() * 10);
		}
		
		//instancializamos la clase Password pasándole por parámetros valores de entrada
		Password miPassword = new Password(longitudParseada, passwordAleatorio );
		
		//mostramos el resultado por consola
		System.out.println("La contraseña generada aleatoriamente: " + miPassword);

	}

}
