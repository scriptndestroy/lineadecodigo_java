package com.lineadecodigo.java.basico.arrays;

/**
 * @file CopiarArrays.java
 * @version 1.1
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   19-junio-2007
 * @url    http://lineadecodigo.com/2007/06/19/copiar-arrays-en-java/
 * @description Utilizar el m�todo .arrayCopy para copiar arrays.
 */

public class CopiarArrays {

	 public static void main(String[] args) {
		   
	   //Array Uno
	   String a1[] = {"Avila","Burgos","Le�n","Palencia","Salamanca",
	     "Segovia","Soria","Valladolid","Zamora"};	   
	   //Array Dos. Por el momento vacio
	   String[] a2 = new String[9]; 
	   
	   //Listamos Array Uno
	   System.out.println("Array Uno");
	   listarArray(a1);
	   
	   //Listamos Array Dos. Estar� vacio.
	   System.out.println("Array Dos");
	   listarArray(a2);
	   
	   //Copiamos el array uno en el dos
	   System.arraycopy(a1,0,a2,0,a1.length);
	   
	   
	   //Listamos Array Uno
	   System.out.println("Array Uno");
	   listarArray(a1);
	   
	   //Listamos Array Dos. Ahora tendr� datos.
	   System.out.println("Array Dos");
	   listarArray(a2); 
	   
	 }
		   
	 public static void listarArray (String[] a){ 
	   for (int x=0;x<a.length;x++){
	     System.out.println(a[x]);
	   } 
	 }

}
