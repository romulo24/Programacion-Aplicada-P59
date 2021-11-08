package Ejercicio08_ejemploPractica03;

import javax.swing.JOptionPane;

public class ciudades {
	
	//llamando al panel grafico
	private panel_ejemplo pe;
	
public ciudades(panel_ejemplo pe) {//INICIALIZANDO UN OBJETO
	
	this.pe=pe;
	cargarCiudades("Elija una ciudad","Cuenca","Quito","Guayaquil");
}
	
	@SuppressWarnings("unchecked")//ojo
	
	public void cargarCiudades(String...ciudades) {
		for(String ciudad : ciudades) {
			pe.cmb_ciudades.addItem(ciudad);
			
		}
	}
	
	public void print(String texto) {
		JOptionPane.showMessageDialog(null,texto);
	}
	
	public void mensaje(String ciudad) {
		switch(ciudad) {
		case "Quito":
			print("Carita de Dios");
			break;
		case "Guayaquil":
			print("Perla del pacifico");
			break;
		case "Cuenca":
			print("Ciudad de las mas bonitas");
			break;
		case "Ambato":
			print("tierra de flores y frutas");
			break;
		}
	}
}
