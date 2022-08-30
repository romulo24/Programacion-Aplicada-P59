package ejercicio4_join;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread hilo1 = new proceso(" Hilo 1 ");
		Thread hilo2 = new proceso(" Hilo 2 ");
		Thread hilo3 = new proceso(" Hilo 3 ");
		Thread hilo4 = new proceso(" Hilo 4 ");
		/*try {
			hilo1.start();
			hilo1.join();
			hilo2.start();
			hilo2.join();
			hilo3.start();
			hilo3.join();
			hilo4.start();
			hilo4.join();
			System.out.println("Refistros almacenados");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		hilo1.start();
		
		hilo2.start();
		hilo3.start();
		hilo4.start();
	}

}
