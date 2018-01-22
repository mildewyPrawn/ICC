/*
 * Código utilizado para el curso de Introducción a las Ciencias de la
 * Computación.
 * Se permite consultarlo para fines didácticos en forma personal.
 */
package SistemaSolar;

import javafx.animation.Interpolator;
import javafx.animation.Timeline;
import javafx.animation.Transition;
import javafx.scene.Node;
import javafx.util.Duration;

/**
 * Asigna la translación total que debe aplicarse a un astro para rotar
 * alrededor del foco indicado.
 * @author blackzafiro
 */
public class OrbitaTransition extends Transition {

    /*
     * El satélite que va a orbitar alrededor de otro.
     */
    private final Satelite satelite;
	
	/*
	 * Parámetros de la elipse.
	 */
	private final double semiejeMayor;
	private final double semiejeMenor;
	private final double c;
	
	/**
	 * Constructor con los datos de la órbita.
	 * @param satelite
	 * @param semiejeMayor
	 * @param semiejeMenor
	 * @param periodoOrbital 
	 */
	public OrbitaTransition(Satelite satelite,
			double semiejeMayor, 
			double semiejeMenor,
			double periodoOrbital) {
			//String direccion) {
		this.satelite = satelite;
		this.semiejeMayor = semiejeMayor;
		this.semiejeMenor = semiejeMenor;
		this.c = Math.sqrt(semiejeMayor * semiejeMayor - semiejeMenor * semiejeMenor);
		
		//setInterpolator(Interpolator.LINEAR);
		setInterpolator(new KeplerInterpolator());
		setCycleDuration(Duration.seconds(periodoOrbital));
		setCycleCount(Timeline.INDEFINITE);
	}
    
	/**
	 * Asigna la translación total que debe aplicarse a un astro para rotar
	 * alrededor del foco indicado.
	 * @param frac número entre 0 y 1 indicando en qué tiempo de la animación 
	 * está el satélite.
	 * Los valores extremos corresponden a los cero grados en la órbita.
	 */
    @Override
    protected void interpolate(double frac) {
		double t = 2 * Math.PI * frac;
        double x = semiejeMayor * Math.cos(t);
        double y = semiejeMenor * Math.sin(t);
        Node foco = this.satelite.getFoco().getFigura();
		this.satelite.getNodo().setTranslateX(foco.getTranslateX() + c);
        this.satelite.getNodo().setTranslateY(foco.getTranslateY());
		
		this.satelite.getFigura().setTranslateX(x);
		this.satelite.getFigura().setTranslateY(y);
		
		System.out.flush();
    }
    
}
