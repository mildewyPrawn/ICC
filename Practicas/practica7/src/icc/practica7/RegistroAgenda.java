/* -*- jde -*- */
/* <RegistroAgenda.java> */

package icc.practica7;
import java.io.*;

/**
 * Registro para una Agenda
 */
public class RegistroAgenda {

	// TODO: Declara aquí los atributos para almacenar
	// nombre, dirección y teléfono.

    static String nombre;
    static String direccion, nombrecito, direccioncita;
    static int telefono, telefonito;
	/**
	 * Constructor.
	 */
    public RegistroAgenda(String nombre, String direccion, int telefono) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
	 }

	/**
	 * Agrega los getters necesarios para leer la información en el registro.
	 */
    public String getNombre(){
    return nombre;
    }
    
    public String getDireccion(){
	  return direccion;
    }

	public int getTelefono(){
		return telefono;
    }
    
	/**
	 * Agrega los setters que permitan actualizar los datos de tu contacto.
	 */
    public void setNombre(String nombre){
      this.nombre = nombre;
    }

    public void setDireccion(String direccion){
      this.direccion = direccion;
    }
    
    public void setTelefono(int telefono){
      this.telefono = telefono;
    }
    public void muestra(PrintStream p){
    	//try{
    		//FileOutputStream file = new FileOutputStream("archivo.txt", true);
    		//PrintStream imp = new PrintStream(file);
    		p.println("Nombre: " + this.nombre);
    		p.println("Direccion: " + this.direccion);
    		p.println("Telefono: " + this.telefono);
    		p.close();
    		//file.close();

    	//}catch(FileNotFoundException e){
    	//	System.err.println("No se encontro la wea");
    	/*}catch(IOException e){
    		System.err.println("Error al leer tu wea de archivo :C");
    	}*/
    	
    }

    public static RegistroAgenda leer(BufferedReader lectura){
        RegistroAgenda r;
        nombrecito = nombre;
        direccioncita = direccion;
        telefonito = telefono;
        r = new RegistroAgenda(nombrecito, direccioncita, telefonito);
        return r;
    }




	/**
	 * Devuelve una cadena con los datos en el registro en un formato agradable.
	 */
	public String toString() {
		return this.nombre+" "+this.direccion+" "+this.telefono;
	}
}
