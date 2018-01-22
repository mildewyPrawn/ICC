/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package SistemaSolar;
import javafx.scene.paint.Color;

/**
 * Clase que describe astros que giran alrededor de otro.
 * @author blackzafiro
 */
public class Satelite extends Astro {
	
	// Escala para dibujar a los planetas
	private static final double ESCALA_RADIO = 10.0;
	private static final double ESCALA_ORBITA = 400.0;
	private static final double ESCALA_ORBITA_SATELITE = ESCALA_RADIO * 2;
	private static final double ESCALA_TIEMPO = 15.0;
	
	/**
	 * Datos de cada planeta y satélite.
	 * Deben ser ficticios, pues de otro modo la simulación no cabe en pantalla.
	 */
	public enum DatosSatelite {
		//"Tamaño"	"Velocidad"
		MERCURIO(0.7, 0.1111, 0.1111, .289,"file:./Planetas/mercurio.jpg"),
		VENUS(1.5	, 0.22, .22, .5,"file:./Planetas/venus.jpeg"),
		TIERRA(1.3, 0.33, 0.33, .678,"file:./Planetas/tierra.jpg"),
		LUNA(0.373, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739,"file:./Planetas/luna.jpeg"),
		MARTE(1.0, .54, 0.54, .7,"file:./Planetas/marte.jpeg"),
		FOBOS(0.38, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.79,"file:./Planetas/fobos.jpeg"),
		DEIMOS(0.4, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.39,"file:./Planetas/deimos.jpg"),
		JUPITER(2.5, .78, .78, .790,"file:./Planetas/jupiter.jpeg"),
		EUROPA(0.473, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 1.9,"file:./Planetas/europa.jpeg"),
		GANIMIDE(0.33, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.5,"file:./Planetas/ganimide.jpeg"),
		CALISTO(0.278, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 1.0739,"file:./Planetas/jupiter.jpeg"),
		IO(0.373, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 3.457,"file:./Planetas/jupiter.jpeg"),
		SATURNO(2.0, .905, .905, .834,"file:./Planetas/saturno.jpg"),
		TITAN(0.399, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.1739,"file:./Planetas/titan.jpeg"),
		MIMAS(0.373, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.739,"file:./Planetas/mimas.jpeg"),
		ENCELADOS(0.234, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 1.739,"file:./Planetas/encelados.jpeg"),
		URANO(1.87, 1.34, 1.34, .92,"file:./Planetas/urano.jpeg"),
		PUCK(0.356, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.3739,"file:./Planetas/puch.jpeg"),
		MIRANDA(0.379, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.7739,"file:./Planetas/miranda.jpeg"),
		ARIEL(0.234, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.3739,"file:./Planetas/ariel.jpeg"),
		UMBRIEL(0.43, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.6739,"file:./Planetas/umbriel.jpeg"),
		OBERON(0.373, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.1739,"file:./Planetas/oberon.jpeg"),
		NEPTUNO(1.5, 1.5, 1.5, 1.0,"file:./Planetas/neptuno.jpeg"),
		TRITON(0.43, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.1739,"file:./Planetas/triton.jpeg"),
		NEREIDA(0.35, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.0739,"file:./Planetas/nereida.jpeg"),
		PROTEUS(0.33, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.735,"file:./Planetas/proteus.jpeg"),
		LARISSA(0.289, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.163,"file:./Planetas/larissa.jpeg"),
		DESPINA(0.26, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.394,"file:./Planetas/despina.jpeg"),
		GALATEA(0.23, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.871,"file:./Planetas/galatea.jpeg"),
		THALASSA(0.37, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.235,"file:./Planetas/thalassa.jpeg"),
		NALAD(0.34, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.455,"file:./Planetas/nalad.jpeg"),
		PLUTON(.6, 1.68, 1.67, 1.3,"file:./Planetas/pluton.jpeg"),
		CARONTE(0.5, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.3739,"file:./Planetas/caronte.jpeg"),
		NIX(0.43, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.739,"file:./Planetas/nix.jpeg"),
		HIDRA(0.325, ESCALA_ORBITA_SATELITE * 0.00257, ESCALA_ORBITA_SATELITE * 0.002566, 0.139,"file:./Planetas/hidra.jpeg");
		
		private final double diametroEcuatorial;
		private final double semiejeMayor;
		private final double semiejeMenor;
		private final double periodoOrbital;
		private final String color;
		
		
		DatosSatelite(double diametroEcuatorial,
				     double semiejeMayor, double semiejeMenor,
					 double periodoOrbital, String color) {
			this.diametroEcuatorial = diametroEcuatorial;
			this.semiejeMayor = semiejeMayor;
			this.semiejeMenor = semiejeMenor;
			this.periodoOrbital = periodoOrbital;
			this.color = color;
		}
	}
	
	/// Inician atributos
	
	private final DatosSatelite datos;
	private OrbitaTransition orbita;
	private Astro foco;
	
	
	/// Inician métodos
        
	/**
	 * Astro alrededor del cual gira este satélite.
	 * @return astro alrededor del cual girar este satélite.
	 */
	public Astro getFoco() {
		return foco;
	}
	
	/**
	 * Crea la órbita de este planea y lo pone a girar alrededor del foco.
	 */
	private void creaOrbita(Astro foco) {
		foco.getNodo().getChildren().add(this.nodo);
		this.foco = foco;
		
		orbita = new OrbitaTransition(this,
									  datos.semiejeMayor * ESCALA_ORBITA,
									  datos.semiejeMenor * ESCALA_ORBITA,
									  datos.periodoOrbital * ESCALA_TIEMPO
		);
		orbita.play();
	}
	
	/**
	 * Constructor.
	 * @param datos información del astro y su órbita.
	 * @param foco astro alrededor del cual gira este satélite.
	 */
	public Satelite(DatosSatelite datos, Astro foco) {
		super(datos.diametroEcuatorial * ESCALA_RADIO,datos.color);
		this.datos = datos;
		creaOrbita(foco);
	}
}
