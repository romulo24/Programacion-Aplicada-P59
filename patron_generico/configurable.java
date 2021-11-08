package patron_generico;

import javax.swing.JOptionPane;

public interface configurable {
	public default void printUI(String texto ,int tipo) {
		if (tipo== 1)
			JOptionPane.showMessageDialog(null, texto);
		else if(tipo==2)
			System.out.println(texto);
	}
	public default String respuesta(String pregunta) {
		return JOptionPane.showInputDialog (pregunta);
	}
	
}
