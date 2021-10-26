package Ejercicio02;
import java.util.Scanner; 
import java.util.ArrayList;

public class bodega {
	private ArrayList<producto>productos;
	public Scanner leer = new Scanner(System.in); 
	private String nombre,busqueda;
	private double precio;
	private int stock;
	public bodega() {
		productos = new ArrayList<producto>();
	}
	public void addProducto(producto p) {
		productos.add(p);

	}
	public void print(String texto) {
		System.out.println(texto);
	}
	public void listarProductos() {

		for(int i=0; i<productos.size();i++) {
			print((i+1)+".- "+productos.get(i).getNombre());
		}
	}
	public void registrar() {
		print("Ingrese el nombre del producto: ");
		nombre=leer.next();
		print("Ingrese el Stock: ");
		stock=leer.nextInt();
		print("Ingrese el precio: ");
		precio =leer.nextDouble();
		addProducto(new producto(nombre,precio,stock));
	}
	public void buscar() {
		print("Ingrese el nombre del producto que desea buscar: ");
		nombre=leer.next();
		for(producto p: productos) {
			busqueda = p.getNombre();
		}

		if(busqueda.equals(nombre)){
			print("MENSAJE : Este producto SI se encuentra registrado");
		}else {
			print("Aviso : ESTE PRODUCTO NO SE ENCUENTRA REGISTRADO");
		}
	}
	public void modificarStock() {

		listarProductos();
		print("Ingrese el nombre del producto que desea modificar el Stock:");
		nombre=leer.next();
		for(producto p: productos) {
			busqueda = p.getNombre();
			if(busqueda.equals(nombre)){
				print("Ingrese un valor (Stock):");
				stock=leer.nextInt();
				p.setStock(stock);
				print("MENSAJE :Este campo se a modificado de forma correcta");
			}else {
				print("AVISO: Este producto NO SE ENCUENTRA REGISTRADO");
			}				
		}
	}
	public void listar() {
		print("\t"+"Nombre P"+"\t"+"Precio"+"\t"+"Stock");
		for(int i=0; i<productos.size();i++) {

			print((i+1)+".- "+"\t"+productos.get(i).getNombre() + "\t"+"\t"+productos.get(i).getPrecio()+"\t"+productos.get(i).getStock());
		}
	}

}
