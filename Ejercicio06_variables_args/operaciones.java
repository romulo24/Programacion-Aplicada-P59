package Ejercicio06_variables_args;
import Ejercicio04.generica;
public class operaciones {
	private generica<Double,Integer,Double>gn;

	//METODOS 
	public operaciones() {
		gn = new generica<Double,Integer,Double>(0.0,0);


	}
	public Double getPromedio(double...notas) {
		gn.setAtributo1(0.0);
		for(Double nota: notas) {
			gn.setAtributo1(nota+gn.getAtributo1());
		}
		return gn.ValoresCalculados(gn.getAtributo1()/notas.length);
	}

	public Double getSuma(double [] nums) {
		gn.setAtributo1(0.0);
		for(Double num:nums) {
			gn.setAtributo1(num+gn.getAtributo1());
		}
		return gn.getAtributo1();
	}
}
