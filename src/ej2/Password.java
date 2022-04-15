package ej2;

/*Haz una clase llamada Password que siga las siguientes condiciones:
• Que tenga los atributos longitud y contraseña . Por defecto, la longitud será de 8.
• Los constructores serán los siguiente:
- Un constructor por defecto.
- Un constructor con la longitud que nosotros le pasemos. Generara una
contraseña aleatoria con esa longitud.*/

public class Password {
	
	//atributos
	private int longitud;
	private String password;
	
	//constructor por defecto
	public Password() {
		
		this.longitud = 8;
		this.password = "";
		
	}

	//constructor con todos los atributos como parámetros
	public Password(int longitud, String password) {
	
		this.longitud = longitud;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", password=" + password + "]";
	}

}
