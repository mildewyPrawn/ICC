import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
  *Demo básico sombre el uso de PrintStream.
  *@author blackzafiro
  */
public class DemoPrintStream  {
    /**
      * Escribe el texto indiado en un archivo.
      *@param args
      */
    public static void main (String [] args)  {
	String nombreArchivo = "Salida.txt";
	try (PrintStream fout = new PrintStream(nombreArchivo)) {
	    fout.println("Inicio");
	    fout.format("Línea %d \n", 1);
	    fout.println("Fin");
	} catch (FileNotFoundException fnfe) {
	    System.err.println ("No se encontró el archivo" +nombreArchivo + "Y no pudo ser creado");
	} catch (SecurityException se)  {
	    System.err.println ("No se tiene permiso de escribir en el archivo");
	}
    }

}
