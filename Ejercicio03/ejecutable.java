package Ejercicio03;

public class ejecutable {

	public static void main(String[] args) {

		persona[] personas = new persona[3];
		personas[0] = new persona("Romulo Torres",19,125.50,1.70);
		personas[1] = new persona("Mateo Reyes",20,123.50,1.50);
		personas[2] = new persona("Patrica Contreras",25,180.50,1.65);
		
		
		for(persona ps:personas) {
			if(ps.getEdad()<20)
			System.out.println(ps.toString());
		}
		figuras [] fg = new figuras[3];
		fg[0] = new triangulo("Triangulo Rectangulo","Azul",12.5,25.54);
		fg[1] = new triangulo("Triangulo Equilatero","Blanco",18,27.4);
		fg[2] = new triangulo("Triangulo Isoceles","Negro",20,2.4);
		for( figuras fsg :fg) {
			System.out.println(fsg.informacion());
		}
	}
	
}
