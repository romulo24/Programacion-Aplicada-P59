package ejercicio4_join;
import java.util.Date;

import patron_generico.*;
public class proceso extends Thread implements configurable{
	private archivo archivos;
	private atributos_gen<String,?>datos;
	public proceso(String msg) {
		super(msg);
		archivos = new archivo();
		datos = new atributos_gen<String,Date>("src/ejercicio4_join/ejemplo/datos.txt",new Date());
	}

	public void run() {
		
		archivos.escribir(datos.getAtributoT1(),"DAT:\t"+ datos.getAtributoS4().toString(),false);
		for (int i = 0; i < 10 ; i++) {
			archivos.escribir(datos.getAtributoT1(),this.getName()+": Proceso-"+i+"\t"+ new Date(), false);

			printUI(archivos.leer(datos.getAtributoT1()),2);
		}
	}
}
