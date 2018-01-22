package icc1.practica4;

import icc1.interfaz.Consola;

public class UsoMatrizCuadrada {

/**Imprime los resultados de MatrizCuadrada*/

    public static void main (String [] args) {
	Consola c;
	c = new Consola ("Matrices");

	MatrizCuadrada m1, m2;
	m1 = new Matriz2x2 (1,2,3,4);
	m2 = new Matriz2x2 (5,6,7,8);

	c.imprimeln ("Matriz uno");
	c.imprimeln (m1);
	c.imprimeln ("Matriz dos");
	c.imprimeln (m2);	

	MatrizCuadrada multiplica;
	multiplica = m1.multiplica (m2);
	c.imprimeln ("Multiplicación de matrices");
	c.imprimeln (multiplica);

	MatrizCuadrada resta;
	resta = m1.resta (m2);
	c.imprimeln ("Resta de matrices");
	c.imprimeln (resta);

	MatrizCuadrada suma;
	suma = m1.suma (m2);
	c.imprimeln ("Suma de matrices");
	c.imprimeln (suma);

	MatrizCuadrada inversa;
	inversa = m1.inversa (m2);
	c.imprimeln ("Inversa de las matrices");
	c.imprimeln (inversa);

    }

}
