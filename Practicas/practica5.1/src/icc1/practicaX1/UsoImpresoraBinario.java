	package icc1.practicaX1;

	public class UsoImpresoraBinario {
	
     		public static void main (String [] args) {
		
		ImpresoraBinario imp;
		imp = new ImpresoraBinario ();

		double nan = Double.NaN;
		double minf = Double.NEGATIVE_INFINITY;
		double pinf = Double.POSITIVE_INFINITY;
		double cero = 0.0;		
		double mcero = -0.0;

		System.out.println("Actividad 1.1");
		System.out.println(" ");
		
		imp.imprime(nan);
		imp.imprime(minf);
		imp.imprime(pinf);
		imp.imprime(cero);
		imp.imprime(mcero);	

		System.out.println(" ");
		System.out.println("Actividad 1.2");
		System.out.println(" ");

		short permisos = 0754;	
		imp.imprime(permisos);

		System.out.println(" ");
		System.out.println("Actividad 1.3");
		System.out.println(" ");
		
		System.out.println("Número:");
		int permisos2 = 0754;
		imp.imprime(permisos2);
		System.out.println("Número con corrimiento en 3 bits:");
		int resultado = permisos2 << 3;
		int resultado2 = permisos2 << 1;
		
		imp.imprime(resultado);
		System.out.println("Número con corrimiento en 1 bit:");
		imp.imprime(resultado2);		
		System.out.println("Número con corrimiento en 3 bits (izquierda):");
		int resultado3 = permisos2 >> 3;
		imp.imprime(resultado3);
		System.out.println("Número con corrimiento en 1 bits (izquierda):");
		int resultado4 = permisos2 >> 1;
		imp.imprime(resultado4);

		System.out.println(" ");
		System.out.println("Actividad 1.4");
		System.out.println(" ");
	
		int permisos3 = 0754;
		int resultado5 = permisos3 >> 1;
		imp.imprime(resultado5);

		System.out.println(" ");
		System.out.println("EJERICIOS");
		System.out.println(" ");

		System.out.println("EJERICIO.1");
		System.out.println(" ");

		int num1 = 456;
		long num2 = 456;
		float num3 = 456;
		double num4 = 456;
		System.out.println("int: 456:");
		imp.imprime(num1);
		System.out.println("long: 456:");
		imp.imprime(num2);
		System.out.println("float: 456:");
		imp.imprime(num3);
		System.out.println("double: 456:");
		imp.imprime(num4);

		System.out.println(" ");
		System.out.println("EJERICIO.2");
		System.out.println(" ");

		int num5 = -456;
		long num6 = -456;	
		float num7 = -456;
		double num8 = -456;
		System.out.println("int: -456:");
		imp.imprime(num5);
		System.out.println("long: -456:");
		imp.imprime(num6);
		System.out.println("float: -456:");
		imp.imprime(num7);
		System.out.println("double: -456:");
		imp.imprime(num8);

		System.out.println(" ");
		System.out.println("EJERICIO.3");
		System.out.println(" ");

		int num9 = (int)-456.601;
		long num10 = (long)-456.601;	
		float num11 = (float)-456.601;
		double num12 = -456.601;
		System.out.println("int: -456.601:");
		imp.imprime(num9);
		System.out.println("long: -456.601:");
		imp.imprime(num10);
		System.out.println("float: -456.601:");
		imp.imprime(num11);
		System.out.println("double: -456.601:");
		imp.imprime(num12);

		/*Double acepta decimales, por lo tanto no hay que 			 * ponerle en casting, todos los demás si.
		 */

		System.out.println(" ");
		System.out.println("EJERICIO.4");
		System.out.println(" ");
			
		int máscara = 15;	
		int emiliano = máscara << 3;
		imp.imprime(emiliano);
		
		System.out.println(" ");
		System.out.println("EJERICIO.5");
		System.out.println(" ");
		
		int emi = 1408;
		int emi1 = emi&máscara;
		int emi2 = emi|máscara;
		int emi3 = ~emi;
		imp.imprime(emi);
		imp.imprime(emi1);
		imp.imprime(emi2);
		imp.imprime(emi3);


	}



}
