package Ejercicio08_ejemploPractica03;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_ejemplo extends JPanel {


	private ciudades cds;
	public JComboBox cmb_ciudades;
	/**
	 * Create the panel.
	 */
	public panel_ejemplo() {
		setLayout(null);

		JLabel lbl_etiqueta = new JLabel("Ciudades:");
		lbl_etiqueta.setFont(new Font("Tahoma", Font.BOLD, 12));
		lbl_etiqueta.setBounds(23, 24, 66, 14);
		add(lbl_etiqueta);

		cmb_ciudades = new JComboBox();
		cmb_ciudades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		cmb_ciudades.setBounds(85, 21, 310, 22);
		add(cmb_ciudades);

		//importante instanciar
		cds = new ciudades(this); //Instanciando la clase 
		init();
	}
	public void init() {
		cmb_ciudades.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cds.mensaje(cmb_ciudades.getSelectedItem().toString());
			}


		}
				);


	}
}
