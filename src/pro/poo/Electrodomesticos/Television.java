package pro.poo.Electrodomesticos;

public class Television extends Electrodomesticos{
	
	// atributos
	
	private int resolucion;
	private boolean sintetizador;
	protected static int resolucionDef = 20;
	
	// constructores
	public Television(double precioBase, String color, char consumoEnergetico, double peso, int resolucion,
			boolean sintetizador) {
		super(precioBase, color, consumoEnergetico, peso);
		this.resolucion = resolucion;
		this.sintetizador = sintetizador;
	}


	public Television(double precioBase, double peso) {
		super(precioBase, peso);
	}
	
	public Television(int resolucion,boolean sintetizador) {
		super();
		this.resolucion = resolucion;
		this.sintetizador = sintetizador;
	}

	//metodos

	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintetizador() {
		return sintetizador;
	}


	public void setSintetizador(boolean sintetizador) {
		this.sintetizador = sintetizador;
	}
	
	/*
	 si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y 
	 si tiene un sintonizador TDT incorporado, aumentara 50 €. Recuerda que las condiciones que hemos 
	 visto en la clase Electrodomestico también deben afectar al precio.
	 */
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if(resolucion > 40) {
			plus *= precioBase*0.3;
		}
		
		if(sintetizador) {
			plus += 50;
		}
		return plus;
		
	}
	

}
