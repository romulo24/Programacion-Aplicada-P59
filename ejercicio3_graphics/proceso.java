package ejercicio3_graphics;
import java.awt.Color;
import java.util.Date;

import patron_generico.*;
public class proceso extends Thread{
	private lienzo dibujo;
	private atributos_gen<String,?>datos;

	public proceso(lienzo dibujo, String tipo) {
		this.dibujo=dibujo;
		datos = new atributos_gen<String,Date>(tipo,new Date());
	}
	public void run() {
		for (int i = 0; i < 20; i++) {
			int red =(int)Math.floor(Math.random()*255);
			int green =(int)Math.floor(Math.random()*255);
			int blue =(int)Math.floor(Math.random()*255);
			switch(datos.getAtributoT1()) {
			case "cuadrado":
				dibujo.setColor(new Color(red,green,blue));
				dibujo.setX1((int)Math.floor(Math.random()*100));
				break;
			case "circulo":
				dibujo.setColor2(new Color(red,green,blue));
				dibujo.setX2((int)Math.floor(Math.random()*100));
				break;
			case "triangulo":
				dibujo.setColor3(new Color(red,green,blue));
				dibujo.setX3((int)Math.floor(Math.random()*100));
				break;
			}
			dibujo.repaint();
			try {
				this.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}

		}

	}
}
