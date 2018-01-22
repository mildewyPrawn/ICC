package icc.practica7;

import icc.util.Buscador;

public class BuscadorPorTelefono implements Buscador {

	/* Telefno que se busca */
	private int telefonoBuscado;

	/**
	 * Construye al buscador con el nombre que
	 * va a buscar.
	 */
	public BuscadorPorTelefono(int telefono) {
		telefonoBuscado = telefono;
	}

	/**
	 * Método que indica si el objeto pasado como parámetro
	 * es el que se está buscando.
	 * @param reg Registro que se desea saber si corresponde
	 *        al nombre buscado.
	 * @returns si <code>reg</code> tiene ese nombre.
	 */
	public boolean esEste(Object reg) {
		RegistroAgenda rg = (RegistroAgenda) reg;
		 return rg.getTelefono() == (telefonoBuscado);
	}

}
