package Ejercicio07_comodines;
import java.util.Date;

import Ejercicio04.generica;

public class pelicula {
	// ATRIBUTOS 
	private generica<String,?,?>gn;


	public String setSinopsis(String intro) {
		Date fecha = new Date();
		gn = new generica<String,Date,Long>(null,fecha);
		gn.setAtributo1(intro);

		return gn.getAtributo1()+ "Registro:\t"+gn.getAtributo3().toString();

	}
	public String [] funciones(String sala,String horario) {

		gn = new  generica<String,String,Double>(sala,horario);

		String [] funcion = { gn.getAtributo1(),gn.getAtributo3().toString()};
		return   funcion;

	}
	//METODO DE WILDCARD
	public Double precioEntrada(Integer edad) {
		gn = new generica<String,Double,Double>(edad.toString(),4.0);
		if(Integer.parseInt(gn.getAtributo1())<=12) 

			return Double.parseDouble(gn.getAtributo3().toString())+1;

		else

			return Double.parseDouble(gn.getAtributo3().toString())+1;
	}

	public void informacion(generica<?,?,?>datos) {
		System.out.println(datos.getAtributo1().toString());
	}
	// METODOS
}
