package pro.poo.Electrodomesticos;

public class Lavadora extends Electrodomesticos{
	
	private int carga;
	
	protected static int cargaDef = 5;

	//constructores 
	
	public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		this.carga = carga;
	}

	public Lavadora(double precioBase, double peso) {
		super(precioBase, peso);
	}

	//metodos
	
	public double getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public static int getCargaDef() {
		return cargaDef;
	}

	public static void setCargaDef(int cargaDef) {
		Lavadora.cargaDef = cargaDef;
	}
	
	/*
	  si tiene una carga mayor de 30 kg, aumentara el precio 50 €, sino es así no se incrementara el precio.
	   Llama al método padre y añade el código necesario. 
	  Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
	 */
	public double precioFinal() {
		double plus = super.precioFinal();
		
		if(carga > 30) {
			plus += 50;
		}
		
		return plus;
		
	}
	
	

}
