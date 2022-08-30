package ejercicio3_graphics;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;

public class lienzo extends JPanel {
	private Color color1,color2,color3;
	private int x1=0,x2=0,x3=0;

	/**
	 * Create the panel.
	 */
	public lienzo() {
		setBackground(Color.WHITE);
		repaint();
	}
	public void paint(Graphics g) {
		//cuadrado
		super.paint(g);
		g.setColor(color1);
		g.fillRect((10+x1),20,50,50);
		//CIRCULO
		g.setColor(color2);
		g.drawOval((10+x2),100,50,50);
		//TRIANGULO
		g.setColor(color3);
		int [] x = {(10+x3),(35+x3),(60+x3)};
		int [] y ={250,200,250};
		g.fillPolygon(x,y,3);

	}
	public void setColor(Color color1) {
		this.color1 = color1 ;
	}
	
	public void setColor2(Color color2) {
		this.color2 = color2 ;
	}
	
	public void setColor3(Color color3) {
		this.color3 = color3 ;
	}
	public void setX1(int x1) {
		this.x1 += x1;
	}
	public void setX2(int x2) {
		this.x2 += x2;
	}
	public void setX3(int x3) {
		this.x3 += x3;
	}
}
