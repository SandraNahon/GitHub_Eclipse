package pro.poo.Videoclub;

public class Main {

	public static void main(String[] args) {
		
		//Crea dos arrays, uno de Series y otro de Videojuegos, de 5 posiciones cada uno.
		
//		Serie s = new Serie(null, 0, false, null, null);
//		Videojuego v = new Videojuego(null, 0);
		
		Serie arraySeries[] = new Serie[5];
		Videojuego arrayJuegos[] = new Videojuego[5];
		
		//Crea un objeto en cada posición del array, con los valores que desees, puedes usar distintos constructores.
		
		arraySeries[0] = new Serie();
		arraySeries[1]=new Serie("Juego de tronos", "George R. R. Martin ");
		arraySeries[2]=new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
		arraySeries[3]=new Serie("Padre de familia", 12 ,"Humor", "Seth MacFarlane");
		arraySeries[4]=new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");
		
		arrayJuegos[0]=new Videojuego();
		arrayJuegos[1]=new Videojuego("Assasin creed 2", 30, "Aventura", "EA");
		arrayJuegos[2]=new Videojuego("God of war 3", "Santa Monica");
		arrayJuegos[3]=new Videojuego("Super Mario 3DS", 30, "Plataforma", "Nintendo");
		arrayJuegos[4]=new Videojuego("Final fantasy X", 200, "Rol", "Square Enix");
		
		
		//Entrega algunos Videojuegos y Series con el método entregar().
		
		arraySeries[2].entregar();
		arraySeries[4].entregar();
		arrayJuegos[3].entregar();
		arrayJuegos[1].entregar();
		
		
		//Cuenta cuantas Series y Videojuegos hay entregados. Al contarlos, devuélvelos.
		int entregados = 0;
		
		for(int i = 0; i < arraySeries.length; i++) {
			if(arraySeries[i].isEntregado()) {
				entregados += 1;
				arraySeries[i].devolver();
			}
			if(arrayJuegos[i].isEntregado()) {
				entregados += 1;
				arrayJuegos[i].devolver();
			}
		}
		System.out.println("Hay "+ entregados +" articulos entregados");
		
		
		//Por último, indica el Videojuego tiene más horas estimadas y la serie con mas temporadas.
		//Muestralos en pantalla con toda su información (usa el método toString()).
		
		

	}

}
