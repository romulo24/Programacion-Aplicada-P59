package ejercicio3_graphics;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.border.EtchedBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class panel_contenedor extends JPanel {
private proceso hilo1,hilo2,hilo3;
private JButton btn_pause;
private JButton btn_iniciar;


	/**
	 * Create the panel.
	 */
	public panel_contenedor() {
		setForeground(Color.WHITE);
		setBackground(Color.BLACK);
		setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "FIGURAS GEOMETRICAS ", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		setLayout(null);
		
		JPanel panel_controles = new JPanel();
		panel_controles.setBounds(10, 22, 495, 48);
		add(panel_controles);
		panel_controles.setLayout(null);
		
		JButton btn_star = new JButton("START");
		btn_star.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_pause.setEnabled(true);
				hilo1.start();
				hilo2.start();
				hilo3.start();
				
			}
		});
		btn_star.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_star.setBounds(10, 11, 137, 23);
		panel_controles.add(btn_star);
		
		btn_pause = new JButton("||");
		btn_pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn_iniciar.setEnabled(true);
				hilo1.suspend();
				hilo2.suspend();
				hilo3.suspend();
			}
		});
		btn_pause.setEnabled(false);
		btn_pause.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_pause.setBounds(157, 11, 85, 23);
		panel_controles.add(btn_pause);
		
		btn_iniciar = new JButton(">");
		btn_iniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo1.resume();
				hilo2.resume();
				hilo3.resume();
				btn_iniciar.setEnabled(false);
			}
		});
		btn_iniciar.setEnabled(false);
		btn_iniciar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_iniciar.setBounds(258, 11, 63, 23);
		panel_controles.add(btn_iniciar);
		
		JButton btn_stop_1 = new JButton("STOP");
		btn_stop_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hilo1.stop();
				hilo2.stop();
				hilo3.stop();
				btn_pause.setEnabled(false);
				
			}
		});
		btn_stop_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btn_stop_1.setBounds(331, 11, 144, 23);
		panel_controles.add(btn_stop_1);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 81, 495, 345);
		add(panel);
		panel.setLayout(null);
		
		lienzo lienzo_ = new lienzo();
		lienzo_.setBounds(0, 0, 508, 345);
		panel.add(lienzo_);
		
		hilo1 = new proceso(lienzo_,"cuadrado");
		hilo2 = new proceso(lienzo_,"circulo");
		hilo3 = new proceso(lienzo_,"triangulo");

	}
}
