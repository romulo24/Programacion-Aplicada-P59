package Ejercicio01;
import java.util.ArrayList;

public class estudiantes {
	//ATRIBUTOS
	private ArrayList<String>nombres;
	private ArrayList<Double>notas; 
	//double hece referencia a un tipo de dato
	// Double hace referencia a una clase


	public estudiantes() {
		this.nombres = new ArrayList<String>();
		this.notas = new ArrayList<Double>();
	}
	public void addNombres(String name) {
		nombres.add(name);

	}
	public void listarNobres() {
		int i = 1;
		for (String name: nombres) { //For each
			print(i +".-\t" +name);
			i++;
		}
	}
	public void print(String texto) {
		System.out.println(texto);
	}
}

