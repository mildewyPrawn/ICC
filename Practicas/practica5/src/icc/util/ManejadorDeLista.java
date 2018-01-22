/* -*- jde -*- */
/* <ManejadorDeLista.java> */

package icc.util;
import icc.practica5.RegistroAgenda;
/**
 * Clase para proveer los servicios de un contenedor tipo Lista.
 */
public class ManejadorDeLista {	

	/**
	 * Primer elemento de la lista.
	 */
	private ListaAgenda cabeza;

	/**
	 * Número de elementos en la lista.
	 */
	private int longitud;

	public ManejadorDeLista(){

	}

	/**
	 * Agrega un registro agenda al final de la lista.
	 */
	public void agrega(RegistroAgenda elemento) {
		// Crea el nuevo elemento y lo cuenta.
		ListaAgenda nuevo = new ListaAgenda(elemento);
		longitud++;

		// Si la lista está vacía añade al primer elemento y termina.
		if (cabeza == null) {
			cabeza = nuevo;
			return;
		}

		// Si no, hay que recorrer la lista para formar al nuevo
		// elemento detrás del último.
		ListaAgenda anterior = cabeza;
		while(anterior.getSiguiente() != null) {
			anterior = anterior.getSiguiente();
		}
		anterior.setSiguiente(nuevo); 
	}

	/**
	 * Devuelve el número de elementos en esta lista.
	 */
	public int longitud() {
		return longitud;
	}

	/**
	 * Por ahora utilizaremos este método para poder
	 * programar la búsqueda en la base de datos.
	 */
	public RegistroAgenda encuentra(Buscador buscador) {
	// TODO: Utiliza al objeto buscador para encontrar
	// al registro agenda con el dato solicitado.
		ListaAgenda anterior = cabeza;
		while(anterior.getSiguiente() != null){
			anterior = anterior.getSiguiente();
			if(buscador.esEste(anterior.getRegistro())){
				return anterior.getRegistro();
			}
		anterior.setSiguiente(anterior.getSiguiente());
		}				
	return anterior.getRegistro();
	}
	
}
