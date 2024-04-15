package pro.poo.Videoclub;

public class Videojuego  implements Entregable{
	
	//atributos
	
	private String titulo;
	private static int horasEstimadas = 10;
	private boolean entregado = false;
	private String genero;
	private String compania;
	
	
	//constructores
	
	public Videojuego(){
        this("",horasEstimadas, "", "");
    }
	
	public Videojuego(String titulo, int horasEstimadas, boolean entregado, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = entregado;
		this.genero = genero;
		this.compania = compania;
	}


	public Videojuego(String titulo, String compania) {
		super();
		this.titulo = titulo;
		this.compania = compania;
	}


	public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
		super();
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compania = compania;
	}

	//metodos

	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getHorasEstimadas() {
		return horasEstimadas;
	}


	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getCompania() {
		return compania;
	}


	public void setCompania(String compania) {
		this.compania = compania;
	}


	@Override
	public String toString() {
		return "Videojuego [titulo=" + titulo + ", horasEstimadas=" + horasEstimadas + ", entregado=" + entregado
				+ ", genero=" + genero + ", compania=" + compania + "]";
	}


	@Override
	public void entregar() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void devolver() {
		// TODO Auto-generated method stub
		
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
