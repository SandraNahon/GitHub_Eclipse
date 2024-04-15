package programacion.poo.Banco;

public class CuentaApp {

	public static void main(String[] args) {
		
		Cuenta cuenta1 =  new Cuenta("Luis");
		Cuenta cuenta2 =  new Cuenta("Mar",300);
		
		//ingresar dinero en las cuentas 
		
		cuenta1.metodoIngresar(300);
		cuenta2.metodoIngresar(400);
		
		
		//Retirar dinero de la cuenta
		
		cuenta1.metodoRetirar(500);
    	cuenta2.metodoRetirar(120);
		
		//
		
		System.out.print(cuenta1);
		System.out.print(cuenta2);

	}

}
