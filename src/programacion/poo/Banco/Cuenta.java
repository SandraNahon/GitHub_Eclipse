package programacion.poo.Banco;

public class Cuenta {
	
	private String titular;
	private double cantidad;
	
	//constructor
	public Cuenta(String titular) {
		this(titular, 0);
	}
	
	public Cuenta(String titular, int cantidad) {
		this.titular = titular;
		if (cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad = cantidad;
		}
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	// metodo ingresar
	/*
	 * se ingresa dinero solo si es positiva la cantidad
	 */
	
	public void metodoIngresar(double cantidad) {
		if( cantidad > 0) {
			this.cantidad += cantidad;
		}
	}
	
	//metodo retirar (double cantidad)
	
	public void metodoRetirar(double cantidad) {
		if(this.cantidad - cantidad < 0) {
			this.cantidad = 0;
		}else {
			this.cantidad += cantidad;
		}
		
	}
	
	//devolvemos el valor del objeto
	@Override
	public String toString() {
		return " El titular " + titular + " tiene " + cantidad + " euros en la cuenta. ";
	}

}
