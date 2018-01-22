
/* -*- jde -*- */
/* <UsoBaseDeDatosAgenda.java> */

package icc.practica7;
import icc.util.ManejadorDeLista;
import java.util.Scanner;
import java.io.FileWriter;
/**
 * Clase de uso donde se pueden crear un par de bases de datos y
 * realizar consultas.
 */
public class UsoBaseDeDatosAgenda {
	public static ManejadorDeLista man;
	private static Scanner s = new Scanner(System.in);

	/*  Número de caracteres que debe tener el registro nombre. */
	private static final int TAM_NOMBRE    = 20;
	/*  Número de caracteres que debe tener el registro dirección. */
	private static final int TAM_DIRECCION = 30;
	/*  Número de caracteres que debe tener el registro teléfono. */
	private static final int TAM_TELEFONO  = 10;

	private static final String tabla1 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
	"Juan Pérez García   "+"Avenida Siempre Viva # 40     "+"55554466"+
	"Arturo López Estrada"+"Calle de la abundancia # 12   "+"55557733"+
	"Edgar Hernández Levi"+"Oriente 110 # 14              "+"55512112"+
	"María García Sánchez"+"Avenida Insurgentes Sur # 512 "+"56742391"+
	"Pedro Páramo Rulfo  "+"Avenida Méxio Lindo # 23      "+"54471499"+
	"José Arcadio Buendía"+"Macondo # 30                  "+"56230190"+
	"Florentino Ariza    "+"Calle de la Cólera # 11       "+"55551221";

	private static final String tabla2 =
	/* Nombre (20) */      /* Dirección (30) */             /* Teléfono (8) */
//	"Emiliano Galeana Araujo"
	"Galio Bermúdez      "+"Sótanos de México # 45        "+"55552112"+
	"Carlos García Vigil "+"La República # 1              "+"55554332"+
	"Eligio García Agusto"+"Ciudades Desiertas # 90       "+"56344325";

	public static RegistroAgenda regAgenda(){
		String nombre, direccion;
		int telefono;
		System.out.println("Escribe el nombre:");
		nombre = s.nextLine();
		System.out.println("Escribe la direccion:");
		direccion = s.nextLine();
		System.out.println("Escribe el telefono:");
		telefono = Integer.parseInt(s.nextLine());	
		System.out.println("El contacto se ha agregado satisfacatoriamente");
		RegistroAgenda reg1 = new RegistroAgenda(nombre, direccion, telefono);	
		System.out.println("El contacto agregado es " +reg1);
		return reg1;	

	}
		public static void menu()	{
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");								
		System.out.println ("Escribe \"1\" para agregar un registro");
		System.out.println ("Escribe \"2\" para buscar un registro");
		System.out.println ("Escribe \"3\" para guardar a la agenda");
		System.out.println ("Escribe \"4\" para Cargar de disco");
		System.out.println ("Escribe \"5\" para salir");
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");
				System.out.println ("");								
	}
 	public static void main(String[] args) {
		// TODO: Crear un par de BaseDeDatosAgenda y realizar algunas consultas.
 		menu();
 		String nombre, direccion;
 		int telefono;
 		man = new ManejadorDeLista();
		UsoBaseDeDatosAgenda usoBase = new UsoBaseDeDatosAgenda();
		BaseDeDatosAgenda bdda = new BaseDeDatosAgenda();
		while (s.hasNext()){
			 	
			String linea = s.nextLine();
			
			if(linea.equals("1")){
				try{
					RegistroAgenda nuevo= regAgenda();
					bdda.agregarRegistro(nuevo);	
				}catch(Exception e){
					System.err.println("Oh, esto es vergonzoso, algo ha salido mal :c :");
				}
				menu();
			}else if(linea.equals("2")){
				try{
			//UsoBaseDeDatosAgenda uso = new UsoBaseDeDatosAgenda ();
			//BaseDeDatosAgenda bddos = new BaseDeDatosAgenda(uso.tabla1,uso.TAM_NOMBRE,uso.TAM_DIRECCION,uso.TAM_TELEFONO);
					System.out.println ("¿Cómo lo desea buscar?");
					System.out.println ("Escribe \"1\" para buscar por nombre");
					System.out.println ("Escribe \"2\" para buscar por teléfono");
					linea=s.nextLine(); 

					if (linea.equals("1")){
						System.out.println ("Escribe el nombre a buscar");
						nombre = s.nextLine(); 
						System.out.println("EL contacto que buscaste es: " + bdda.dameRegistroPorNombre(nombre));
					}
//error en el teléfono

					else if (linea.equals ("2")){	
						System.out.println ("Escribe el telefono a buscar");
					//telefono = s.nextLine();
					telefono = Integer.parseInt (s.nextLine()); 
					System.out.println("EL contacto es: " + bdda.dameRegistroPorTelefono(telefono));
					
						
					}
				}catch(Exception e){
					System.err.println("Oh, esto es vergonzoso, algo ha salido mal :c :");
				}
				menu();
			}else if(linea.equals("3")){
				System.out.println("Nombre archivo");
				nombre = s.nextLine();
				bdda.guardaAgenda(nombre);
				menu();
			}else if(linea.equals("4")){
				System.out.println("Nobre del archivo a cargar");
				nombre = s.nextLine();
				bdda.cargaAgenda(nombre);
				menu();
			}else{
				System.out.println("Esta es una opción no válida");
			}if(linea.equals("5")){
				break;
			}
		}
		s.close();
		
  	}
}

/* </UsoBaseDeDatosAgenda.java> */
