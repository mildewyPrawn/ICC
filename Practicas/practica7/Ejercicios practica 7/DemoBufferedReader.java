import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
  *Demo básico sobre el uso de FileReader y BufferedReade.
  *@author blackzafiro
  */
public class DemoBufferedReader  {
    /**
      *Lee un archivo de texto a imprime su conteniedo línea por 
      *linea.
      *@param args
      */
    public static void main (String [] args)  {
	try {
	    BufferedReader in = new BufferedReader(new FileReader("texto.txt"));
	    String line;
	    while ((line = in.readLine()) != null) {
		System.out.println(line);
	    }
	    in.close();
	} catch (FileNotFoundException e)  {
	    System.err.println("No se encontró el archivo de texto.txt ¿Olvidaste crearlo?");
	} catch (IOException ioe)  {
	    System.out.println ("Error al leer el contenido de texto.txt");
	}
    }
}
