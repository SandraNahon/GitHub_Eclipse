package pro.poo.Videoclub;

public interface Entregable {
	
	/*
	 * cambia el atributo prestado a true.
	 */
	public void entregar();
	/*
	 *  cambia el atributo prestado a false.
	 */
	public void devolver();
	/*
	 * devuelve el estado del atributo prestado.
	 */
	public boolean isEntregado();
	/*
	 * compara las horas estimadas en los videojuegos y en las series el numero de temporadas.
	 *  Como parámetro que tenga un objeto, no es necesario que implementes la interfaz Comparable.
	 *   Recuerda el uso de los casting de objetos.
	 */
	public void comparar(Object a);

}
