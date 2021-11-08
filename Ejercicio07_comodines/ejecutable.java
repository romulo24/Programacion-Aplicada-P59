package Ejercicio07_comodines;
import Ejercicio04.generica;
public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pelicula ps = new pelicula();

		System.out.println("Sinopsis: " + ps.setSinopsis("Pelicula de Terror") + 
				"\nFuncion: " + ps.funciones("Sala 4","17:00 - 19:00")[0] +
				"\nHorario: " + ps.funciones("Sala 4","17:00 - 19:00")[1] +
				"\nValor Entrada: $" + ps.precioEntrada(12));

		pelicula [] cine = new pelicula[5];
		cine[0] = ps;
		System.out.println(cine[0]);
		generica<String,String,Double>g1 = new generica<String,String,Double>(ps.setSinopsis("Pelicula de Terror "),
				ps.funciones("Sala 4","17:00 - 19:00")[0]);
		ps.informacion(g1);					

	}

}

