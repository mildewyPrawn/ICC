package icc1.practica4;

import icc1.interfaz.Consola;

public class UsoMatrizCuadrada {

    public static void main (String [] args) {
	Consola c;
	c = new Consola ("Matrices");

	MatrizCuadrada m1, m2;
	m1 = new Matriz2x2 (1,2,3,4);
	m2 = new Matriz2x2 (5,6,7,8);

	c.imprimeln (m1);
	c.imprimeln (m2);	

	MatrizCuadrada mult;
	mult = m1.multiplica (m2);
	c.imprimeln (mult);

	MatrizCuadrada rest;
	rest = m1.multiplica (m2);
	c.imprimeln (rest);

	MatrizCuadrada sum;
	sum = m1.multiplica (m2);
	c.imprimeln (sum);

	MatrizCuadrada inver;
	inver = m1.multiplica (m2);
	c.imprimeln (inver);

    }

}
