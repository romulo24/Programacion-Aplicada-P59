package Ejercicio04;

public class productos {

	//ATRIBUTOS 
	private generica<String,Integer,Double>g1;
	
	public productos(String nombre,String descripcion,int unidades,int valor) {
		g1 = new generica<String,Integer,Double>(nombre,descripcion,unidades,valor);
	}
	public productos(String nombre,int unidades) {
		g1 = new generica<String,Integer,Double>(nombre,unidades);
	}
	public String getNombre() {
		return g1.getAtributo1();
	}
	public void informacion() {
		g1.print(g1.getAtributo1()+"\t"+g1.getAtributo3()+"\t PVP: "+g1.ValoresCalculados(g1.getAtributo4()+g1.getAtributo4()*0.12));
	}
}
