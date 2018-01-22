package icc.practica8;

public class Matriz2D{
 private double [][] matriz;
 static Matriz2D mat;



  public Matriz2D(int reng,int col){
     matriz = new double [reng][col];
  }
  public static Matriz2D datos(double [][] m){
    mat = new Matriz2D(m.length,m[0].length);
    for (int i=0; i< m.length; i++){
      for(int j=0; j <m[0].length; j++){
        mat.matriz[i][j] = m[i][j];
      }
    }
    return mat;
  }

  public String toString(){
    String res="";
    for (int i = 0; i < matriz.length; i++) {
      for (int j = 0; j < matriz[0].length; j++) {
          res = res+matriz[i][j] + "  ";
   }
   res = res+"\n";

 }
 return res;
}

  public int getColumnas(){
    if (matriz.length > 0){
      return matriz[0].length;
    }else{
      return 0;
    }
  }
  public int getRenglones(){
    return matriz.length;
  }

  public Matriz2D sumaMatriz (Matriz2D m){
	Matriz2D suma = new Matriz2D(mat.getRenglones(),mat.getColumnas());

	Matriz2D mat = new Matriz2D(2,2);
	double [][] matriz = {{2,4.5},{6,9}};
	Matriz2D mat2 = new Matriz2D(2,2);
	double [][] matriz2 = {{1,2},{4,6}};

    if (mat.getRenglones() != mat2.getRenglones() && (mat.getColumnas() != mat2.getColumnas())){
       new Error("No se pueden sumar las matrices");
     }else{
       for (int i =0; i < mat.getRenglones(); i++) {
         for (int j =0; j < mat.getColumnas(); j++) {
          suma.matriz[i][j] = m.matriz[i][j] + this.matriz[i][j];
        }
      }
  }
  return suma;
}


  public Matriz2D restaMatriz (Matriz2D m){
    Matriz2D resta = new Matriz2D(mat.getRenglones(),mat.getColumnas());

	Matriz2D mat = new Matriz2D(2,2);
	double [][] matriz = {{2,4.5},{6,9}};
	Matriz2D mat2 = new Matriz2D(2,2);
	double [][] matriz2 = {{1,2},{4,6}};

    if (mat.getRenglones() != mat2.getRenglones() && (mat.getColumnas() != mat2.getColumnas())){
       new Error("No se pueden restar las matrices");
     }else{
       for (int i =0; i < mat.getRenglones(); i++) {
         for (int j =0; j < mat.getColumnas(); j++) {
          resta.matriz[i][j] = m.matriz[i][j] - this.matriz[i][j];
        }
      }
  }
  return resta;
  }

  public Matriz2D multEsc (Matriz2D m,int escalar){
    Matriz2D resultado = new Matriz2D(m.getRenglones(),m.getColumnas());
    for(int i =0; i!= m.getRenglones(); i++){
        for(int j =0; j!= m.getColumnas(); j++){
            resultado.matriz[i][j] = m.matriz[i][j]*escalar;
          }
        }
    return resultado;
}

  public Matriz2D multiplicaMatriz (Matriz2D m){
    Matriz2D prod = new Matriz2D(m.getRenglones(),m.getColumnas());

	Matriz2D mat = new Matriz2D(2,2);
	double [][] matriz = {{2,4.5},{6,9}};
	Matriz2D mat2 = new Matriz2D(2,2);
	double [][] matriz2 = {{1,2},{4,6}};

    if (mat.getColumnas() != m.mat.getRenglones()){
       new Error("No se pueden multiplicar las matrices");
     }else{
       for (int i =0; i < mat.getRenglones(); i++) {
         for (int j =0; j < mat.getColumnas(); j++) {
          prod.matriz[i][j] += (matriz[i][j] * m.matriz[i][j]);
      }
    }
  }
  return prod;
}

public static void main (String[] args){
    Matriz2D mat = new Matriz2D(2,2);
    double [][] matriz = {{2,4.5},{6,9}};
    Matriz2D mat2 = new Matriz2D(3,3);
    double [][] matriz2 = {{1,2,3},{2,4,6},{7,1,8}};
    Matriz2D mat2d = mat.datos(matriz);
    Matriz2D matriz2d = mat2.datos(matriz2);
    int a = 5;
    System.out.println(mat.datos(matriz));
    System.out.println("El número de renglones en la matriz uno es de: "+mat.getRenglones());
    System.out.println("El número de columnas en la matriz uno es es: "+mat.getColumnas());
    System.out.println("El número de renglones en la matriz dos es de: "+mat2.getRenglones());
    System.out.println("El número de columnas en la matriz dos es es: "+mat2.getColumnas());
    System.out.println("la matriz de sumar mat y matricita es:");
    System.out.println(matriz2d.sumaMatriz(mat2d));
    System.out.println("la matriz de restar mat y matricita es:");
    System.out.println(matriz2d.restaMatriz(mat2d));
    System.out.println("la matriz de multiplicar mat por el escalar  "  +a);
    System.out.println(matriz2d.multEsc(mat2d,a));
    System.out.println("la matriz de multiplicar  mat y matricita es");
    System.out.println(matriz2d.multiplicaMatriz(mat2d));
  }
}

