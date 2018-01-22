    package icc1.practica4;

    public class Matriz2x2 implements MatrizCuadrada {
    private double a;	/**La primera entrada de la matriz */	
    private double b;	/**La segunda entrada de la matriz */
    private double c;	/**La tercera entrada de la matriz */
    private double d;	/**La cuarta entrada de la matriz  */
    private double e;   /**Se usa en el método de matriz inversa */
    private double f;   /**Se usa en el método de matriz inversa */
    private double determinante;

	/** Constructor único de matrices
	  * @param a la primera entrada de la matriz
	  * @param a la segundaa entrada de la matriz
	  * @param a la tercera entrada de la matriz
	  * @param a la cuarta entrada de la matriz
	  */

    Matriz2x2 (double a, double b, double c, double d) {
	this.a = a;
	this.b = b;
	this.c = c;
	this.d = d;
	this.determinante = this.a * this.d - this.b * this.c;
    }

	/**Constructor para matrices en cero. 
	  * @param 0 multiplica la matriz por cero.
	  * @return devuelve en ceros la matriz. 
	  */

    public Matriz2x2 () {
	this.a = 0;
	this.b = 0;
	this.c = 0;
	this.d = 0;
	this.determinante = 0;
    }
	
	/**Constructor para matrices por un escalar. 
	  * @param 0 multiplica la matriz por un escalar.
	  * @return devuelve la matriz multiplicada por el escalar. 
	  */

    public MatrizCuadrada multiplica (double x) {
	double a, b, c, d;

	a = x * this.a;
	b = x * this.a;
	c = x * this.a;    
	d = x * this.a;

	MatrizCuadrada resultado;
	resultado = new Matriz2x2 (a, b, c, d);
	return resultado;
    }

	/**Constructor para multiplicar matrices. 
	  * @param dados ciertos valores se multiplica en el mismo 		  * orden en que están acomodadas.
	  * @return devuelve los resultados de multiplicar y da     		  * una nueva matriz. 
	  */

    public MatrizCuadrada multiplica (MatrizCuadrada m) {
	double a, b, c, d;
	Matriz2x2 m2x2 = (Matriz2x2)m;

	a = this.a * m2x2.a + this.b * m2x2.c;
	b = this.a * m2x2.b + this.b * m2x2.d;
	c = this.c * m2x2.a + this.d * m2x2.c;
	d = this.c * m2x2.b + this.d * m2x2.d;

	MatrizCuadrada resultado;
	resultado = new Matriz2x2 (a, b, c, d);
	return resultado;
    }

	/**Constructor para sumar matrices. 
	  * @param dados ciertos valores se suma en el mismo 		  * orden en que están acomodadas.
	  * @return devuelve los resultados de sumar  y da     		  * una nueva matriz. 
	  */

    public MatrizCuadrada suma (MatrizCuadrada m) {
	double a, b, c, d;
	Matriz2x2 m2x2 = (Matriz2x2)m;

       	a = this.a + m2x2.a;
	b = this.b + m2x2.b;
	c = this.c + m2x2.c;
	d = this.d + m2x2.d;

	MatrizCuadrada resultado;
	resultado = new Matriz2x2 (a, b, c, d);
	return resultado;
    }

	/**Constructor para restar matrices. 
	  * @param dados ciertos valores se resta en el mismo 		  * orden en que están acomodadas.
	  * @return devuelve los resultados de restar y da     		  * una nueva matriz. 
	  */

    public MatrizCuadrada resta (MatrizCuadrada m) {
	double a, b, c, d;
	Matriz2x2 m2x2 = (Matriz2x2)m;

       	a = this.a - m2x2.a;
	b = this.b - m2x2.b;
	c = this.c - m2x2.c;
	d = this.d - m2x2.d;

	MatrizCuadrada resultado;
	resultado = new Matriz2x2 (a,b,c,d);
	return resultado;
    }

	/**Constructor para invertir una matriz dada. 
	  * @param dados ciertos valores para la matriz, se obtiene un 		  * determinante y se multiplica.
	  * @return devuelve los resultados de multiplicarla y tienen 		  * que ser ceros y unos. 
	  */

    public MatrizCuadrada inversa (MatrizCuadrada m) {
	double a, b, c, d;
	a = this.a;
	b = this.b; 
	c = this.c; 
	d = this.d;
	e = (a*d) - (b*c);
	f = 1/e;

	if (e== 0) { 
	System.out.print("No hay inversa"); 
	} else { 
	a = f * d;
	b = f * (-b);
	c = f * (-c);
	d = f * a;
	}
	
	MatrizCuadrada resultado;
	resultado = new Matriz2x2 (a,b,c,d);
	return resultado;
    }

	/**Método para obener el valor de "a".
	  * @return el valor de a.
	  */
	
	public double getA () {
	     return this.a;
	}

	/**Método para asignar un valor a "a".
	  * @param valor de "a".
	  */

	public void setA (double a) {
	     this.a = a;
	     this.determinante = this.a*this.d-this.b*this.c;
	}

	/**Método para obener el valor de "b".
	  * @return el valor de b.
	  */

	public double getB () {
	     return this.b;
	}

	/**Método para asignar un valor a "b".
	  * @param valor de "b".
	  */

	public void setB (double b) {
	     this.b = b;
	     this.determinante = this.a*this.d-this.b*this.c;
	}

	/**Método para obener el valor de "c".
	  * @return el valor de c.
	  */

	public double getC () {
	     return this.a;
	}

	/**Método para asignar un valor a "c".
	  * @param valor de "c".
	  */

	public void setC (double c) {
	     this.c = c;
	     this.determinante = this.a*this.d-this.b*this.c;
	}

	/**Método para obener el valor de "d".
	  * @return el valor de d.
	  */

	public double getD () {
	     return this.a;
	}

	/**Método para asignar un valor a "d".
	  * @param valor de "d".
	  */

	public void setD (double d) {
	     this.d = d;
	     this.determinante = this.a*this.d-this.b*this.c;
	}

	/** Método para que se imprima la cadena de la matriz 		  * representada.
	  * @return imprime la cadena en la consola.
	  */

	public double getDeterminante () {
	     return this.determinante;
	}

	public String toString () {
	     return this.a + "\t" + this.b + "\n" + this.c + "\t" + 	         this.d;
	}

	}
