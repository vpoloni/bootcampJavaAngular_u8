package ej4;

/*Crearemos una clase llamada Serie con las siguientes características:
• Sus atributos son titulo, numero de temporadas, entregado, genero y creador.
• Por defecto, el numero de temporadas es de 3 temporadas y entregado false.
El resto de atributos serán valores por defecto según el tipo del atributo.
Los constructores que se implementaran serán:
✓ Un constructor por defecto.
✓ Un constructor con el titulo y creador. El resto por defecto.
✓ Un constructor con todos los atributos, excepto de entregado.*/


public class Serie {
	
	//atributos
	private String titulo;
	private int numeroTemporadas;
	private boolean entregado;
	private String genero;
	private String creador;
	
	//constructor por defecto
	public Serie() {
		
		this.titulo = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
		this.genero = "";
		this.creador = "";
		
	}
	
	//constructor con el título y el creador, el resto por defecto
	public Serie(String titulo, String creador) {
	
		this.titulo = titulo;
		this.creador = creador;
		this.genero = "";
		this.numeroTemporadas = 3;
		this.entregado = false;
	}

	//constructor con todos los atributos como parámetros, exepto del entregado
	public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
		
		this.titulo = titulo;
		this.numeroTemporadas = numeroTemporadas;
		this.genero = genero;
		this.creador = creador;
	}

	//getters y setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemporadas() {
		return numeroTemporadas;
	}

	public void setNumeroTemporadas(int numeroTemporadas) {
		this.numeroTemporadas = numeroTemporadas;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroTemporadas=" + numeroTemporadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}

}
