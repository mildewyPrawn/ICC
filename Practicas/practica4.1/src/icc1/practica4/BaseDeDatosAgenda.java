/* -*- jde -*- */
/* <BaseDeDatosAgenda.java> */

package icc1.practica4;

/**
 * Clase para representar una Base de Datos de agenda.
 *
 * Una base de datos debe ser capaz de obtener registros, y campos
 * de sus registros, y debe ser capaz de reconocer si un campo o registro
 * solicitado no existe, y dar una respuesta coherente.
 */
public class BaseDeDatosAgenda {

    private static final String tabla =
    /* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
    "Juan Pérez García   "+"Avenida Siempre Viva # 40     "+"55554466"+
    "Arturo López Estrada"+"Calle de la abundancia # 12   "+"55557733"+
    "Edgar Hernández Levi"+"Oriente 110 # 14              "+"55512112"+
    "María García Sánchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
    "Pedro Páramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
    "José Arcadio Buendía"+"Macondo # 30                  "+"56230190"+
    "Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221"+
    "Galio Bermúdez      "+"Sótanos de México # 45        "+"55552112"+
    "Carlos García Vigil "+"La República # 1              "+"55554332"+
    "Eligio García Agusto"+"Ciudades Desiertas # 90       "+"56344325";

    private static final int TAM_NOMBRE    = 20;
    private static final int TAM_DIRECCION = 30;
    private static final int TAM_TELEFONO  = 8;
    private static final int TAM_REGISTRO  = 58;

    public String dameRegistroPorNombre (String nombre) {
	String Reg = null;
	int numR;
	numR = tabla.length ()/ TAM_REGISTRO;
	for (int i = 0; i< numR; i++) {
	    Reg = tabla.substring (i*TAM_REGISTRO, (i+1)*TAM_REGISTRO);
	    if (Reg.contains (nombre))
	return Reg;
	}	
	return null;
    }
    
    public String dameRegistroPorTelefono (int tel) {
	String Reg = null;
	String telefono = Integer.toString (tel);
	int numR;
	numR = tabla.length ()/ TAM_REGISTRO;
	for (int i = 0; i< numR; i++) {
	Reg = tabla.substring (i*TAM_REGISTRO, (i+1)*TAM_REGISTRO);
	if (Reg.contains (telefono))
	return Reg;
	}
	return null;
    }
}
