package pro.poo.Electrodomesticos;

public class Main {

	public static void main(String[] args) {
		/*
		1- Crea un array de Electrodomesticos de 10 posiciones.
		 
		 2-Asigna a cada posición un objeto de las clases anteriores con los valores que desees.
		 
		3- Ahora, recorre este array y ejecuta el método precioFinal().
		 
		4- Deberás mostrar el precio de cada clase, es decir, el precio de todas las televisiones por un lado,  
		 el de las lavadoras por otro y la suma de los Electrodomesticos (puedes crear objetos Electrodomestico,
		  pero recuerda que Television y Lavadora también son electrodomésticos). Recuerda el uso operador instanceof.
		  
		 */
		//Creamos las variables que usaremos para almacenar la suma de los precios
        double sumaElectrodomesticos=0;
        double sumaTelevisiones=0;
        double sumaLavadoras=0;
		//1
		Electrodomesticos ListaElectrodomesticos[] = new Electrodomesticos[10];
		//2
		ListaElectrodomesticos[0] = new Electrodomesticos(200,"verde",'C',60);
		ListaElectrodomesticos[1]= new Lavadora(150, 30);
		ListaElectrodomesticos[2] = new Television(30, false);
		ListaElectrodomesticos[3] = new Electrodomesticos(600,"azul",'F',20);
		ListaElectrodomesticos[4]= new Lavadora(250, 70);
		ListaElectrodomesticos[5] = new Television(100, false);
		ListaElectrodomesticos[6]=new Television(250, 70);
		ListaElectrodomesticos[7]=new Lavadora(400, "verde", 'A', 100, 15);
		ListaElectrodomesticos[8]=new Television(200, "naranja", 'C',60, 30, true);
		ListaElectrodomesticos[9]=new Electrodomesticos(50, 10);
		
		//3 y 4
		for(int i = 0; i < ListaElectrodomesticos.length ; i++) {
			//instanceof para verificar que pertenece a esa clase, es como una herencia
			if(ListaElectrodomesticos[i] instanceof Electrodomesticos) {
				sumaElectrodomesticos += ListaElectrodomesticos[i].precioFinal();
			}
			
			if(ListaElectrodomesticos[i] instanceof Lavadora) {
				sumaLavadoras += ListaElectrodomesticos[i].precioFinal();
			}
			
			if(ListaElectrodomesticos[i] instanceof Television) {
				sumaTelevisiones += ListaElectrodomesticos[i].precioFinal();
			}
			
		}
		////Mostramos los resultados
		System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
	}

}
