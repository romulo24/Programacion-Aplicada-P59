package Ejercicio04;

public class ejecutable {
	public static void main(String [] args) {

		productos[] bodega = new productos[3];
		bodega[0] = new productos("Teclado","Teclado Negro Internacioal",14,10);
		bodega[1] = new productos("Monitor","Monitor marca LG",4,85);
		bodega[2] = new productos("Mouse","Genious inalambrico",10,8);

		for( productos p:bodega) {
			p.informacion();
		}

	}
}
