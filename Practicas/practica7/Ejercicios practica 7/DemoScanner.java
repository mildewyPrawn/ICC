import java.util.Scanner;

/**
  *Demo básico sobre el uso de la clase Scanner.
  *@author blackzafiro 
  */
    
    public class DemoScanner {

    /**
      *Recive una línea de texto desde el teclado 
      *y reimprime eel mensaje que recibió, hasta que el usurario 
      *se despida. 
      *@param args
      */
    public static void main(String [] args)  {
	Scanner s = new Scanner(System.in);
	while(s.hasNext())  {
	    String linea = s.nextLine();
	    System.out.println("Eco: " + linea);
	    if (linea.equals("Adiós")) break;
	}
	s.close();
    }

}
