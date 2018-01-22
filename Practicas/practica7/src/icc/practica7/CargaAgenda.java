package icc.practica7;

import icc.util.Buscador;
import icc.practica7.RegistroAgenda;
import java.io.*;

public class CargaAgenda implements Buscador{
	private BufferedReader regs;

	public CargaAgenda(BufferedReader registros){
		regs = registros;
	}

	public boolean esEste(Object reg){
		RegistroAgenda r = (RegistroAgenda) reg;
		r.leer(regs);
		return false;
	}
}