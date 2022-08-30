package ejercicio2_hilos;

import patron_generico.*;

public class proceso extends Thread implements configurable {
	private atributos_gen<Integer,?> datos;


	public proceso(String msg) {
		super(msg);
		datos = new atributos_gen<Integer,Double>(0,0.0);
	}

//METODO RUN SIEMPRE SERA DE TIPO VOID
	public void run() {

		for (int i = 0; i < 10 ; i++) {
			datos.setAtributoT1(getSuma(i,datos.getAtributoT1()));
			printUI(this.getName() + "-> "+ datos.getAtributoT1() ,2);
			try {
				this.sleep(1000);
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			
		}
		printUI("______________________________________",2);
	}
	public Integer getSuma(int num1, int num2) {
		return num1 + num2;

	}
}
