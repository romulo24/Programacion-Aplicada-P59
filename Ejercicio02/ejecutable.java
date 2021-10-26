 package Ejercicio02;
import java.util.Scanner;

public class ejecutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leer = new Scanner(System.in);
		int opcion=0;
		bodega obj = new bodega();
		do {
			
			System.out.println(" = = = = = Men� = = = = =");
			System.out.println("1. Registrar productos");
			System.out.println("2. listar productos");
			System.out.println("3. Buscar productos");
			System.out.println("4. Modifiacar stock");
			System.out.println("5. Listar informacion");
			System.out.println("6. Salir");
			System.out.println("Ingrese una opcion:");
			opcion= leer.nextInt();
			switch(opcion) {
			
			case 1:
				obj.print(" = = = = Registro de Productos = = = = ");;
				obj.registrar();
				break;
			case 2:
				obj.print(" = = = = Lista de productos  = = = = ");
				obj.listarProductos();
				break;
			case 3:
				obj.print(" = = = = Buscar Productos = = = = ");
				obj.buscar();
				break;
			case 4:
				obj.print(" = = = = Mofificar Stock = = = = ");
				obj.modificarStock();
				break;
			case 5:
				obj.listar();
				break;
			default:
				obj.print(" = = = = Lista de Producto = = = = ");
				System.out.println(" Gracias por utilizar este Programa");
				break;
			}
		}while(opcion!=6);
		

	}

}
