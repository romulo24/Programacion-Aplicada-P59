package ejercicio5_bloqueos1;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			cajero cj = new cajero(i, 1000);
			Thread hilo = new Thread (cj);
			hilo.start();
		}
	}

}
