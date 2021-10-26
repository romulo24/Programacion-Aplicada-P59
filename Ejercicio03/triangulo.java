package Ejercicio03;

public class triangulo extends figuras{
	protected generica<Double>g2 = new generica<Double>();

	public triangulo(String tipo, String color,double base, double altura) {
		super(tipo, color);
		g2.setAtributo1(base);
		g2.setAtributo2(altura);
	}
public double area() {
	return g2.getAtributo1()*g2.getAtributo2()/2;
}
public  String informacion() {
	return "Figura: "+g1.getAtributo1()+"\nColor: "+g1.getAtributo2()+
			"Area: "+area()+ " m2"+"\n";
}
}
