package pro.poo.Videoclub;

public class Serie  implements Entregable{
	
	//atributos
	
	private String titulo;
	private static int numTemporadas = 3;
	private boolean entregado = false;
	private String genero;
	private String creador;
	
	
	//Constructores
	
	public Serie(){
        this("",numTemporadas, "", "");
    }
	
	public Serie(String titulo, int numTemporadas, boolean entregado, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}


	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}


	public Serie(String titulo, int numTemporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.numTemporadas = numTemporadas;
		this.genero = genero;
		this.creador = creador;
	}


	// metodos
	
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getNumTemporadas() {
		return numTemporadas;
	}


	public void setNumTemporadas(int numTemporadas) {
		this.numTemporadas = numTemporadas;
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
		return "Serie [titulo=" + titulo + ", numTemporadas=" + numTemporadas + ", entregado=" + entregado + ", genero="
				+ genero + ", creador=" + creador + "]";
	}


	@Override
	public void entregar() {
		entregado = true;
		
	}


	@Override
	public void devolver() {
		entregado = false;
		
	}


	@Override
	public boolean isEntregado() {
		 if(entregado){
	            return true;
	            
	        }
	        return false;
		
	}


	@Override
	public void comparar(Object a) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
