package com.lineadecodigo.java.util.collections;

/* 
* @file NumeroElementosLista.java
* @version 1.0
* @author V�ctor Cuervo. (http://lineadecodigo.com)
* @date   03/junio/2015
* @url    http://lineadecodigo.com/java/numero-de-elementos-de-una-lista-en-java/
* @description C�digo que calcula el n�mero de elementos de una lista
*/


import java.util.ArrayList;
import java.util.List;

public class NumeroElementosLista {

	public static void main(String[] args) {

	    // Definimos una ArrayList
	    List<String> list = new ArrayList<String>();
	   
	    // A�adimos elementos
	    list.add("Andrea");
	    list.add("Amaya");
	    list.add("Julio");

	    System.out.println("El numero de elementos de la lista es " + list.size());

	}

}
