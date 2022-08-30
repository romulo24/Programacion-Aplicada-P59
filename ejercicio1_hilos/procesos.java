package ejercicio1_hilos;

import patron_generico.configurable;

public class procesos extends Thread implements configurable{
	private int cont = 1;
	public procesos(String msg) {
		super(msg);
	}
	public void run() {
		//SENTENCIAS QUE EJECUTA EL HILO

		for (int i = 0; i <=5; i++) {
			printUI(this.getName()+ ":" +(i+1),2);

		}
		
		
	}
}
