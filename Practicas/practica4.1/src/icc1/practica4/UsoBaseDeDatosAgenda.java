/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc1.practica4;

import icc1.interfaz.Consola;

public class UsoBaseDeDatosAgenda {

    public static void main(String[] args) {
	Consola c; 
	c = new Consola ("Base de datos, agenda");

	BaseDeDatosAgenda bdda;
	String busqueda;

	bdda = new BaseDeDatosAgenda ();
	busqueda = bdda.dameRegistroPorNombre ("Juan Pérez García");
	c.imprimeln (busqueda);
	busqueda = bdda.dameRegistroPorTelefono (54471499);
	c.imprimeln (busqueda);
    }
}

/* </UsoBaseDeDatosAgenda.java> */
