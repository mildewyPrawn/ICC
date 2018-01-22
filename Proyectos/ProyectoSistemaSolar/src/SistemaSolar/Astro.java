/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package SistemaSolar;

import javafx.scene.Node;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.image.Image;

/**
 * Clase que representa a todos los astros alrededor de los cuales pueden girar
 * otros astros.
 * @author blackzafiro
 */
public class Astro {
	
	/**
	 * Panel sobre el cual se dibuja este astro y sus satélites.
	 */
	protected Pane nodo;
	
	/**
	 * Figura que representa a este astro.
	 */
	protected Circle figura;
	
	/**
	 * Constructor.
	 * @param diametro Pixeles de diámetro.
	 */
	
	
	public Astro(double diametro, String image) {
		nodo = new StackPane();
//		nodo.setStyle("-fx-background-color: rgba(0, 0, 0, 0.0);");
		nodo.setMaxSize(100, 100);

		Image imagen = new Image(image);
		figura = new Circle(diametro);
		figura.setFill(new ImagePattern(imagen,0,0,1,1,true));
		nodo.getChildren().add(figura);
		
	}
	
	/**
	 * Devuelve al panel sobre el cual se dibujará este astro y sus satélites.
	 * @return nodo
	 */
	public Pane getNodo() {
		return nodo;
	}
	
	/**
	 * Devuelve el nodo figura que dibuja a este astro.
	 * Sus coordenadas son relativas al panel que la contiene.
	 * @return 
	 */
	public Node getFigura() {
		return figura;
	}
	
	
}
