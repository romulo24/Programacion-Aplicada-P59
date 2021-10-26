package Ejercicio03;

public class persona {

	//ATRIBUTOS 
	//private String nombre,correo;
	//private int edad;
	//private double peso,estatura;

	private generica<String> g1 = new generica<String>();
	private generica<Integer> g2 = new generica<Integer>();
	private generica<Double> g3 = new generica<Double>();

	//METODOS

	public persona(String nombre,String correo){
		g1.setAtributo1(nombre);
		g1.setAtributo1(correo);

	}
	public persona(String nombre,int edad,double peso,double estatura) {
		g1.setAtributo1(nombre);
		g2.setAtributo1(edad);
		g3.setAtributo1(peso);
		g3.setAtributo2(estatura);
	}
	public String toString() {
		return "Nombre: "+g1.getAtributo1()+"\n Edad: "+g2.getAtributo1()+"\t Años"+
				"\n Peso: " +g3.getAtributo1()+"\t libras \n Estatura: "+g3.getAtributo2()+"\t Metros"+"\n";
	}
	
	public int getEdad() {
		
		return g2.getAtributo1();
		
		
	}
}
