package ejercicio2_hilos;



import java.util.Date;

import patron_generico.archivo;
import patron_generico.atributos_gen;
import patron_generico.configurable;

public class proceso2 implements Runnable,configurable{

	private atributos_gen<Double,String> datos;
	String [] alumnos = {"Cristian","Raul","Liseth","Angel"};
	String [] materias = {"Programacion","Redes","Matematicas","Administracion"};
	private  archivo arch;
	public proceso2() {
		arch = new archivo();
		datos = new atributos_gen<Double,String>(0.0,null);
		datos.setAtributoS4("src/ejercicio2_hilos/recurso/notas.txt");
	}
	public void run() {
		for (String alumno : alumnos) {
			datos.setAtributoT1(Math.random()*100);
			datos.setAtributoS5(alumno +"\t Materia:\t" + materias[(int) Math.floor(Math.random()*4)] + "\tNota:\t" +datos.getAtributoT1()+ " Estado:"+aprobar(datos.getAtributoT1()));
			printUI(datos.getAtributoS5(),2);
			arch.escribir(datos.getAtributoS4(),"\n"+ datos.getAtributoS5(), false);
		}
		arch.escribir(datos.getAtributoS4(),"\n-------------------"+new Date() +"-------------", false);
	}
	public String aprobar(double valor) {
		if(valor<65) {
			return "REPROBADO";
		}

		else if(valor>=65 && valor<70) {
			return "SUSPENSO";
		}

		else if(valor>=70) {
			return "APROBADO";
		}else{
			return "";
		}
	}	
}