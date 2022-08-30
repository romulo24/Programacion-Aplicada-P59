package ejercicio2_hilos;

public class ejecutble {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo1 = new proceso("HILO1");
		Thread hilo2 = new proceso("HILO2");
		//IMPLENTACION DE LA INTERFAZ RUNNABLE
		Thread hilo5 = new Thread(new proceso2());
		
		
		hilo1.start();
		hilo2.start();
		hilo5.start();
		
		/*Thread hilo3 = new proceso("HILO3");
		Thread hilo4 = new proceso("HILO4");

		try {
			
			//SINCRONIZACION DE HILOS
			hilo1.start();
		   //hilo1.sleep(1000);
			hilo2.start();
			//hilo2.sleep(1000);
			hilo3.start();
			//hilo3.sleep(1000);
			hilo4.start();

		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

*/
	}

}
