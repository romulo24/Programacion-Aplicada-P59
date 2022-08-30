 package ejercicio5_bloqueos1;

public class cajero extends banco implements Runnable{

	public cajero(int cuenta_origen, double cantidad) {
		datos.setAtributoS4(cuenta_origen);
		datos.setAtributoT2(cantidad);

	}

	public void run() {
		while (true) {
			datos.setAtributoS4((int)(50*Math.random()));
			datos.setAtributoS5((int)(50*Math.random())); //Entrega de manera randomica las cuentas de destino
			datos.setAtributoT3(datos.getAtributoT2()*Math.random());
			transferencias(datos.getAtributoS4(),datos.getAtributoS5(),datos.getAtributoT3());
			try {
				Thread.sleep((int)(1000*Math.random()));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}

	}

}
