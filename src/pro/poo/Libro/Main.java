package pro.poo.Libro;

public class Main {

	public static void main(String[] args) {
		
		Libro libro1 = new Libro(125, "El visitante", "Stephen king", 583);
		Libro libro2 = new Libro(138, "El asesinato de Roger Ackroyd", "Agatha Christie", 312);
		
		System.out.println(libro1.toString());
		System.out.println(libro2.toString());
		
		
		if(libro1.getNumPag() > libro2.getNumPag()) {
			System.out.println("El libro '" + libro1.getTitulo() + "' tiene mas paginas");
		}else {
			System.out.println("El libro '" + libro2.getTitulo() + "' tiene mas paginas");
		}
		
			
		

	}

}
