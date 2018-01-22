package icc.practica7;

import icc.practica7.RegistroAgenda;
import icc.util.ManejadorDeLista;
import icc.util.Buscador;
import java.io.*;

public class GuardaRegistro implements Buscador{
	private PrintStream reg;

	public GuardaRegistro(PrintStream re){
		reg = re;

	}
	
	public boolean esEste(Object o){
		RegistroAgenda r = (RegistroAgenda) o;
		r.muestra(reg);
		return false;
	}
}
//Herencia expeciones lambdas interfaces, etc...
//Temas de examen