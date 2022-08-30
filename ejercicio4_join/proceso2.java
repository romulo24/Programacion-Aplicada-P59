package ejercicio4_join;

import 	patron_generico.archivo;
import patron_generico.configurable;

public class proceso2 implements Runnable,configurable{
	private Thread next_hilo;
	private archivo arch;
	public proceso2(Thread next_hilo) {
		this.next_hilo = next_hilo;
		arch = new archivo();
	}
	public void run() {
		try {
			next_hilo.join();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		String [] info = arch.leer("src/ejercicio4_join/ejemplo/datos.txt").split(" ");
		int cont=0;
		for (String dato : info) {
			if(arch.validarCadena(dato,"^[p][a-z]+[o]$")) {
				cont++;
			}
			printUI("Procesos existentes:"+ cont,1);
		}
	}


}
