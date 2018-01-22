package icc1.practica3;

import icc1.interfaz.Consola;

     public class prueba {

     public static void main (String [] args) {
	 Consola c;
	 c = new Consola ("Valores de variables");
	 // c.imprime ("Hola mundo.");
	 //c.imprime ("Adiós mundo.");
	 //c.imprimeln ("Hola mundo.");
	 //c.imprimeln ("Adios mundo.");
	 //c.imprime ("Hola mundo. \n");
	 //c.imprime ("Adiós mundo \n");
	 c.imprime ("Hola mundo. \nAdiós mundo. \n");

	 int a = 5; 
	 //float x = 12;
	 //byte b = 5;
	 //int a = b;
	 //int a = 1.2;
	 //int b = 5;
	 //byte c = b;
	 c.imprimeln (a);
	 int b = 23;
	 float d = b % a;
	     c.imprimeln (d);
	     float x = 1F;
	     float y = 0.00000001F;
	     float z = y - x;
	     c.imprimeln (z);
	     // int e = 
	     c.imprimeln ( 1 >> 1);
	     c.imprimeln ( -1 >> 1);
	     c.imprimeln ("¬(p^q)");
	     boolean p = true;
	     boolean q = true;
	     c.imprime ("Cuando p es verdadero y q es verdadero: "); c.imprimeln (!(p&&q));
	     //	     boolean e = (¬(p^q));
	     // c.imprime (!(p&&q));
	     boolean pa = false;
	     boolean qa = false;
	     c.imprime ("cuando p es verdadero y q es falso:     "); c.imprimeln (!(p&&qa));
	     // boolean pb = false;
	     // boolean qb = true;
	     c.imprime ("Cuando p es falso y q es verdadero:     "); c.imprimeln (!(pa&&q));
	     c.imprime ("Cuando p es falso y q es falso:         "); c.imprimeln (!(pa&&qa));

	     c.imprimeln ("¬pv¬q");
	     c.imprime ("Cuando p es verdadero y q es verdadero: "); c.imprimeln (!p||!q);
	     c.imprime ("Cuando p es verdadero y q es falso:      "); c.imprimeln (!p||!qa);
	     c.imprime ("Cuando p es falso y q es verdadero:      "); c.imprimeln (!pa||!q);
	     c.imprime ("Cuando p es falso y q es verdadero:      "); c.imprimeln (!pa||!qa);

	     c.imprimeln (" ");
	     c.imprimeln (" ");
	     c.imprimeln (" ");
	     c.imprimeln ("Ejercicio del libro. ");
	     
	     int l = 1;
	     int k = 2;
	     int j = 3;
	     c.imprimeln ((l > 3 && ++l <= 2) ? k++ : j--);
	 
     }
	

 }
