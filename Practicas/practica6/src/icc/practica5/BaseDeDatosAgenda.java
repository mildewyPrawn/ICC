/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.practica5;

import icc.practica5.RegistroAgenda;

import icc.util.ManejadorDeLista;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {	

	
	/**
	 * Este objeto llevará el control de los registros guardados en la lista.
	 */
	private ManejadorDeLista tabla;

	/**
	 * Constructor.
	 * @param datos Una cadena con el formato requerido por esta base
	 *        con los registros de nombres, direcciones y teléfonos.
	 * @param tam_nombre 
	 */
	public BaseDeDatosAgenda(String datos,
							 int tam_nombre,
							 int tam_direccion,
							 int tam_telefono) {

	int tam_registro = tam_nombre + tam_direccion + tam_telefono;

		// TODO: Crear el ManejadorDeLista para almacenar ahí los registros.
	tabla = new ManejadorDeLista();
	RegistroAgenda reg;
	String nombre;
	String direccion;

	String cadena; //anterior: String telefono;
	int telefono = 0;	

	String Registro;
	int numR =datos.length()/tam_registro;
	
		for (int i = 0; i< numR; i++) {
	   	 Registro = datos.substring (i*tam_registro, (i+1)*tam_registro);
	   	 nombre = Registro.substring(0,tam_nombre);
	   	 direccion = Registro.substring(tam_nombre, tam_direccion+tam_nombre);
	   	 telefono =Integer.parseInt(Registro.substring(tam_direccion+tam_nombre, tam_direccion+tam_nombre+tam_telefono));
			reg = new RegistroAgenda(nombre, direccion, telefono);
			tabla.agrega(reg);

		
		}
	}

	public Object dameRegistroPorNombre (String nombre) {
		
	
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
	BuscadorPorNombre b = new BuscadorPorNombre(nombre);		
	 RegistroAgenda rg = (RegistroAgenda)(tabla.encuentra(b));
	return rg;
	}

	public Object dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.
		BuscadorPorTelefono t = new BuscadorPorTelefono(tel);
			return tabla.encuentra (t);
	}
}
