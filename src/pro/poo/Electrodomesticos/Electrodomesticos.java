package pro.poo.Electrodomesticos;

public class Electrodomesticos {
	
	//Atributos
	
	protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;
	    
	    //constantes
	
    protected static int precioBaseDef = 100;
    protected static String colorDef = "blanco";
    protected static char consumoEnergeticoDef = 'F';
    protected static double pesoDef = 5;

	
	//constructores
 
	
	public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
		super();
		this.precioBase = precioBase;
		this.color = color;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}



	public Electrodomesticos(double precioBase, double peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
	}


	public Electrodomesticos() {
		super();
		this.precioBaseDef = precioBaseDef;
		this.colorDef = colorDef;
		this.consumoEnergeticoDef = consumoEnergeticoDef;
		this.pesoDef = pesoDef;
	}

//
//
//	public Electrodomesticos() {
//		super();
//	}


	//metodos

	



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
		this.color = color;
	}



	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}



	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public static int getPrecioBaseDef() {
		return precioBaseDef;
	}



	public static void setPrecioBaseDef(int precioBaseDef) {
		Electrodomesticos.precioBaseDef = precioBaseDef;
	}



	public static String getColorDef() {
		return colorDef;
	}



	public static void setColorDef(String colorDef) {
		Electrodomesticos.colorDef = colorDef;
	}



	public static char getConsumoEnergeticoDef() {
		return consumoEnergeticoDef;
	}


//
//	public char setConsumoEnergeticoDef(char consumoEnergeticoDef) {
//		Electrodomesticos.consumoEnergeticoDef = consumoEnergeticoDef;
//	}



	public static double getPesoDef() {
		return pesoDef;
	}



	public static void setPesoDef(int pesoDef) {
		Electrodomesticos.pesoDef = pesoDef;
	}
	
	
	/*
	 comprueba que el color es correcto, sino lo es usa el color por defecto.
	  Se invocara al crear el objeto y no sera visible.
	 */
	public void comprobarColor(String color) {
		//hacemos un array de los colores
		
		String Colores[] = {"blanco","negro","rojo", "azul","gris"};
		boolean encontrado = false;
		
		for(int i = 0; i < Colores.length && !encontrado ; i++) {
			if(Colores[i].equals(color)){
				encontrado = true;
			}
		}
		
		if(encontrado) {
			this.color = color;
		}else {
			this.color = colorDef;
		}
		
	}
	
	/*
	 según el consumo energético, aumentara su precio, y según su tamaño, también. Esta es la lista de precios:
	 */
	public double precioFinal() {
		double p = 0;
		
		switch(consumoEnergetico) {
		case 'A':
			p += 100;
			break;
		case 'B':
			p += 80;
			break;
		case 'C':
			p += 60;
			break;
		case 'D':
			p += 50;
			break;
		case 'E':
			p += 30;
			break;
		case 'F':
			p += 10;
			break;
		}
		
		if(peso>=0 && peso<19){
            p+=10;
        }else if(peso>=20 && peso<49){
            p+=50;
        }else if(peso>=50 && peso<=79){
            p+=80;
        }else if(peso>=80){
            p+=100;
        }
		
		return precioBase + p;
		
	}
	
	
	/*
	 comprueba que la letra es correcta, sino es correcta usara la letra por defecto.
	  Se invocara al crear el objeto y no sera visible.
	 */
	public void comprobarConsumoEnergetico(char consumoEnergetico) {
		
		if(consumoEnergetico >= 65 && consumoEnergetico <= 70) {
			this.consumoEnergetico = consumoEnergetico;
		}else {
			this.consumoEnergetico = consumoEnergeticoDef;
		}
		
	}
	
	

}
