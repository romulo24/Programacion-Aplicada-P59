package Ejercicio01;
import java.util.Scanner;
public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		estudiantes est = new estudiantes();
		Scanner leer = new Scanner(System.in);
		int opcion = 0;
		while(true) {
			est.print("1.- Registrar Estudiante ");
			est.print("2.- Imprimir lista ");
			est.print("3.- Salir ");

			opcion = leer.nextInt();
			if(opcion == 1) {
				est.print("Ingrese el nombre del Estudiante:");
				est.addNombres(leer.next());
			}else if(opcion == 2) {
				est.listarNobres();
			}else if(opcion == 3) 
				break;
			else
				est.print("Opcion incorrecta");
		}

	}

}
