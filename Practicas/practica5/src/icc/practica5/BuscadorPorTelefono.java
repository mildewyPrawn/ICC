/* -*- jde -*- */
/* <BuscadorPorTelefono.java> */

package icc.practica5;

import icc.util.Buscador;

/**
 * Clase que busca registros agenda con un telefono dado.
 */
public class BuscadorPorTelefono implements Buscador {

	/* Nombre que se busca */
	private String telefonoBuscado;

	/**
	 * Construye al buscador con el telefono que
	 * va a buscar.
	 */
	public BuscadorPorTelefono(String telefono) {
		telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al telefono buscado.
	 * @returns si <code>reg</code> tiene ese telefono.
	 */
	public boolean esEste(RegistroAgenda reg) {
		 return reg.getTelefono().equals(telefonoBuscado);
	}

}
