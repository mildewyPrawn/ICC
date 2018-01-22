/* -*- jde -*- */
/* <Buscador.java> */

package icc.util;
import icc.practica7.RegistroAgenda;

/**
 * Interfaz para definir objetos que buscan otros que
 * satisfagan cierta condición.
 */
public interface Buscador {

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 */
	public boolean esEste(Object reg);
}
