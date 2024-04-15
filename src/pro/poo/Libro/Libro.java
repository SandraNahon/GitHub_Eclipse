package pro.poo.Libro;

public class Libro {
	//atributos
	
	private int ISBN;
	private String titulo;
	private String autor;
	private int numPag;
	
	public Libro(int iSBN, String titulo, String autor, int numPag) {
		super();
		ISBN = iSBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numPag = numPag;
	}

	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}

	@Override
	public String toString() {
		return "El libro con ISBN " + ISBN + ", creado por el autor " + autor + " tiene " + numPag + " paginas";
	}
	
	
	

}
