package ejercicio1_hilos;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo1 = new procesos("Hilo1");
		Thread hilo2 = new procesos("Hilo2");
		procesos hilo3 = new procesos("Hilo3");
		procesos hilo4 = new procesos("Hilo4");
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
	}

}
