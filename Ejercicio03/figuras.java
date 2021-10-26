package Ejercicio03;

public class figuras {

		//ATRIBUTOS
	
	protected generica<String>g1 = new generica<String>();
	
	//METODOS
	public figuras(String tipo,String color) {
		g1.setAtributo1(tipo);
		g1.setAtributo2(color);

	}
	public String informacion() {
	return "Tipo: "+g1.getAtributo1()+"\nColor: "+g1.getAtributo2();	
	}
}
