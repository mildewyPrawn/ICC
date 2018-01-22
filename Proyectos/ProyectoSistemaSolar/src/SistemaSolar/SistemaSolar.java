/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package SistemaSolar;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


/**
 * Simulación del sistema solar utilizando JavaFX
 * https://docs.oracle.com/javase/8/javafx/api/index.html
 * @author blackzafiro
 */
public class SistemaSolar extends Application {
	
	private Astro sol;
	private Satelite mercurio;
	private Satelite venus;
	private Satelite tierra;
	private Satelite luna;
	private Satelite marte;
	private Satelite fobos;
	private Satelite deimos;
	private Satelite jupiter;
	private Satelite europa;
	private Satelite ganimide;
	private Satelite calisto;
	private Satelite io;
	private Satelite saturno;
	private Satelite titan;
	private Satelite mimas;
	private Satelite encelados;
	private Satelite urano;
	private Satelite puck;
	private Satelite miranda;
	private Satelite ariel;
	private Satelite umbriel;
	private Satelite titania;
	private Satelite oberon;	
	private Satelite neptuno;	
	private Satelite triton;
	private Satelite nereida;
	private Satelite proteus;	
	private Satelite larissa;
	private Satelite despina;	
	private Satelite galatea;
	private Satelite thalassa;
	private Satelite nalad;
	private Satelite pluton;
	private Satelite caronte;
	private Satelite nix;
	private Satelite hidra;
	
	
	/**
	 * Crea al sol, los planteas y sus satélites, asignando quien gira
	 * alrededor de quien.
	 */
	private void creaAstros() {
		sol = new Astro(25,"file:./Planetas/sol.jpeg");
		mercurio = new Satelite(Satelite.DatosSatelite.MERCURIO, sol);
		venus = new Satelite(Satelite.DatosSatelite.VENUS, sol);
		tierra = new Satelite(Satelite.DatosSatelite.TIERRA, sol);
		luna = new Satelite(Satelite.DatosSatelite.LUNA, tierra);
		marte = new Satelite(Satelite.DatosSatelite.MARTE, sol);
		fobos = new Satelite(Satelite.DatosSatelite.FOBOS, marte);
		deimos = new Satelite(Satelite.DatosSatelite.DEIMOS, marte);
		jupiter = new Satelite(Satelite.DatosSatelite.JUPITER, sol);
		europa = new Satelite(Satelite.DatosSatelite.EUROPA, jupiter);
		ganimide = new Satelite(Satelite.DatosSatelite.GANIMIDE, jupiter);
		calisto = new Satelite(Satelite.DatosSatelite.CALISTO, jupiter);
		io = new Satelite(Satelite.DatosSatelite.IO, jupiter);	
		saturno = new Satelite(Satelite.DatosSatelite.SATURNO, sol);
		titan = new Satelite(Satelite.DatosSatelite.TITAN, saturno);
		mimas = new Satelite(Satelite.DatosSatelite.MIMAS, saturno);
		encelados = new Satelite(Satelite.DatosSatelite.ENCELADOS, saturno);		
		urano = new Satelite(Satelite.DatosSatelite.URANO, sol);
		puck = new Satelite(Satelite.DatosSatelite.PUCK, urano);
		miranda = new Satelite(Satelite.DatosSatelite.MIRANDA, urano);
		ariel = new Satelite(Satelite.DatosSatelite.ARIEL, urano);
		umbriel = new Satelite(Satelite.DatosSatelite.UMBRIEL, urano);
		oberon = new Satelite(Satelite.DatosSatelite.OBERON, urano);
		neptuno = new Satelite(Satelite.DatosSatelite.NEPTUNO, sol);
		triton = new Satelite(Satelite.DatosSatelite.TRITON, neptuno);
		nereida = new Satelite(Satelite.DatosSatelite.NEREIDA, neptuno);
		proteus = new Satelite(Satelite.DatosSatelite.PROTEUS, neptuno);
		larissa = new Satelite(Satelite.DatosSatelite.LARISSA, neptuno);
		despina = new Satelite(Satelite.DatosSatelite.DESPINA, neptuno);
		galatea = new Satelite(Satelite.DatosSatelite.GALATEA, neptuno);
		thalassa = new Satelite(Satelite.DatosSatelite.THALASSA, neptuno);
		nalad = new Satelite(Satelite.DatosSatelite.NALAD, neptuno);
		pluton = new Satelite(Satelite.DatosSatelite.PLUTON, sol);
		caronte = new Satelite(Satelite.DatosSatelite.CARONTE, pluton);
		nix = new Satelite(Satelite.DatosSatelite.NIX, pluton);
		hidra = new Satelite(Satelite.DatosSatelite.HIDRA, pluton);
		
	
	}
	
	/**
	 * Crea la escena y agrega los primeros nodos, sobre los cuales
	 * se han agregado a los demás astros.
	 * @return la escena con el sol, planetas y satélites.
	 */
	private Scene montaNodos() {
		StackPane root = new StackPane();
		root.setCenterShape(true);
		Image image = new Image("file:./Planetas/space4.jpg");
		ImageView im = new ImageView();
		im.setImage(image);
		ImageView im1 = new ImageView();
		im1.setImage(image);
		



		//Scene scene = new Scene(root, ANCHO_VENTANA_INICIAL, ALTO_VENTANA_INICIAL);
		//Image imagen = new Image("file:./Planetas/space2.jpg");
		//Scene.setFill(new ImagePattern(image,0,0,1,1,true));

		//root.getChildren().add(iv1);
		root.getChildren().add(im);
		root.getChildren().add(sol.getNodo());
			
		Scene scene = new Scene(root, 1200, 800, Color.BLACK);
		
		
		return scene;
	}
	
	/**
	 * Acomoda los elementos en la intefaz e inicia la animación.
	 * @param primaryStage
	 * @throws Exception 
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		creaAstros();
		montaNodos();
		
		Scene scene = montaNodos();
		primaryStage.setTitle("Sistema solar");
        primaryStage.setScene(scene);
        primaryStage.show();
	}
	
	/**
	 * Inicia la simulación.
	 * @param args 
	 */
	public static void main(String[] args) {
        launch(args);
	
    }
	
}
