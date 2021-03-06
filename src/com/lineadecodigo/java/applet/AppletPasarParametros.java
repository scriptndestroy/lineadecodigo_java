package com.lineadecodigo.java.applet;

/**
 * @file AppletPasarParametros.java
 * @version 1.3
 * @author Linea de Codigo (http://lineadecodigo.com)
 * @date   4-marzo-2007
 * @url		http://lineadecodigo.com/2007/03/04/pasar-parametros-a-un-applet/
 * @description Creaci�n de un applet que recibe dos parametros de forma externa  
 */

import java.applet.Applet;
import java.awt.Graphics;
import com.lineadecodigo.base.*;

public class AppletPasarParametros extends Applet {

	private static final long serialVersionUID = 1L;

	private Web miWeb;
	

	public AppletPasarParametros() {
		super();
	}


	public void init() {
		this.setSize(300, 200);
		//Recuperamos los par�metros
		miWeb = new Web();
		miWeb.setTitulo(getParameter("web"));
		miWeb.setURL(getParameter("url"));
	}
	
	public void paint(Graphics g){
		g.drawString(miWeb.getTitulo(), 10, 20);
		g.drawString(miWeb.getURL(), 10, 40);
	}

}
