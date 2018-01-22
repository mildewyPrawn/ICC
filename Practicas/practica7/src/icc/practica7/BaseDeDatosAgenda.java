/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc.practica7;

import icc.practica7.RegistroAgenda;
import icc.practica7.GuardaRegistro;
import icc.util.ManejadorDeLista;
import java.io.*;

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

	public BaseDeDatosAgenda(){

		tabla = new ManejadorDeLista();
		
	}
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
		RegistroAgenda r;
		String nombre, direccion;
		int telefono;
		String registro;
		int numReg = datos.length()/tam_registro;
		for (int i=0; i<numReg; i++){
		    registro = datos.substring(i*tam_registro,(i+1)*tam_registro);
		    nombre = registro.substring(0,tam_nombre);
		    direccion = registro.substring(tam_nombre,tam_nombre+tam_direccion);
				telefono = Integer.parseInt(registro.substring(tam_nombre+tam_direccion,tam_nombre+tam_direccion+tam_telefono));
		    r = new RegistroAgenda(nombre, direccion, telefono);
		    tabla.agrega(r);

			}
		}

	public Object dameRegistroPorNombre (String nombre) {
		// TODO: Usa BuscadorPorNombre y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.

	    BuscadorPorNombre busc = new BuscadorPorNombre(nombre);
	    return tabla.encuentra(busc);
	}

	public Object dameRegistroPorTelefono (int tel) {
		// TODO: Crea la clase BuscadorPorTelefono en forma similar a BuscadorPorNombre
		// Usa BuscadorPorTelefono y el método encuentra de ManejadorDeLista
		// para encontrar el registro correcto dentro de la lista.

	    BuscadorPorTelefono te = new BuscadorPorTelefono(tel);
	    return tabla.encuentra(te);
	}
	public void agregarRegistro(RegistroAgenda registro){
		try{
			tabla.agrega(registro);
		}catch(NumberFormatException e){
			System.err.println("No se que paso pero fallo :C");
		}
	}
	public void guardaAgenda(String archivo){
		try{
			PrintStream datos = new PrintStream(archivo);
			GuardaRegistro g = new GuardaRegistro(datos);
			tabla.encuentra(g);
			datos.close();
		}catch(FileNotFoundException e){
			System.err.println("No se encontro la wea de archivo");
		}
	}
	public void cargaAgenda(String archivo){
		try{
			FileReader leer = new FileReader(archivo);
			BufferedReader lectura = new BufferedReader(leer);
			CargaAgenda g = new CargaAgenda(lectura);
 			tabla.encuentra(g);
 			lectura.close();
		}catch(IOException o){
			System.err.println("Archino no encuentrado");
		}
	}
}
