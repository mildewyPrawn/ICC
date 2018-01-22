package icc1.practica4;

  /**Métodos para la representación de matrices, se encuentran
     en Matriz2x2.java*/


public interface MatrizCuadrada {

    public MatrizCuadrada suma(MatrizCuadrada m);
    
    public MatrizCuadrada resta (MatrizCuadrada m);

    public MatrizCuadrada multiplica (MatrizCuadrada m);

    public double getDeterminante (); 
}
