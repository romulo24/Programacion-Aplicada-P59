package Ejercicio05_aunboxing;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import java.awt.Font;

public class panel_calculadora extends JPanel {
	public JTextField textField;
	public calculadora cal;//DECLARANDO LA REFENCIA A LA CLASE CALCULADORA
	public  JButton btn_Suma;
	public  JButton btn_Resta;
	public  JButton btn_Multiplicacion;
	public  JButton btn_Division;
	public  JButton btn_Promedio;
	public  JButton btn_Porcentaje;
	public  JButton btn_Ac;
	public  JButton btn_Resultado;
	public  JRadioButton rbtn_funcionCadena;

	/**
	 * Create the panel.
	 */
	public panel_calculadora() {
		setLayout(null);

		textField = new JTextField();
		textField.setForeground(Color.RED);
		textField.setBackground(Color.GRAY);
		textField.setBounds(10, 11, 234, 48);
		add(textField);
		textField.setColumns(10);

		btn_Suma = new JButton("+");
		btn_Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//SUMA DE NUMEROS 
				textField.setText(String.valueOf(cal.getSuma(Double.parseDouble(textField.getText()))));

			}
		});
		btn_Suma.setBackground(Color.CYAN);
		btn_Suma.setBounds(10, 110, 51, 35);
		add(btn_Suma);

		btn_Resta = new JButton("-");
		btn_Resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RESTA DE NUMEROS
				textField.setText(String.valueOf(cal.getResta(Double.parseDouble(textField.getText()))));
			}
		});
		btn_Resta.setBackground(Color.CYAN);
		btn_Resta.setBounds(71, 110, 51, 35);
		add(btn_Resta);

		btn_Multiplicacion = new JButton("x");
		btn_Multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//MULTIPLICACION DE NUMEROS
				textField.setText(String.valueOf(cal.getMultiplicacion(Double.parseDouble(textField.getText()))));
			}
		});
		btn_Multiplicacion.setBackground(Color.CYAN);
		btn_Multiplicacion.setBounds(132, 110, 51, 35);
		add(btn_Multiplicacion);

		btn_Division = new JButton("/");
		btn_Division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(String.valueOf(cal.getDivision(Double.parseDouble(textField.getText()))));
			}
		});
		btn_Division.setBackground(Color.CYAN);
		btn_Division.setBounds(193, 110, 51, 35);
		add(btn_Division);

		btn_Promedio = new JButton("Pr");
		btn_Promedio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PROMEDIO DE NUMEROS 
				cal.addValores(Double.parseDouble(textField.getText()));
			}
		});
		btn_Promedio.setBackground(Color.CYAN);
		btn_Promedio.setBounds(10, 156, 51, 35);
		add(btn_Promedio);

		btn_Porcentaje = new JButton("%");
		btn_Porcentaje.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//PORCENTAJE
			}
		});
		btn_Porcentaje.setBackground(Color.CYAN);
		btn_Porcentaje.setBounds(71, 156, 51, 35);
		add(btn_Porcentaje);

		btn_Ac = new JButton("Ac");
		btn_Ac.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//COLOCAR EN 0 LOS VALORES
				cal.encerar();
			}
		});
		btn_Ac.setBackground(Color.CYAN);
		btn_Ac.setBounds(132, 156, 51, 35);
		add(btn_Ac);

		btn_Resultado = new JButton("=");
		btn_Resultado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RESULTADO DE LAS OPERACIONES QUE SE ESTAM REALIZANDO
				textField.setText(String.valueOf(cal.getPromedio()));
			}
		});
		btn_Resultado.setBackground(Color.RED);
		btn_Resultado.setBounds(193, 156, 51, 35);
		add(btn_Resultado);

		//CREAR UNA INSTANCIA PARA LA CLASE CALCULADORA
		cal = new calculadora(this);

		rbtn_funcionCadena = new JRadioButton("Cadena");
		rbtn_funcionCadena.setFont(new Font("Tahoma", Font.BOLD, 10));
		rbtn_funcionCadena.setBounds(181, 66, 72, 23);

		//-----------------------------------------
		rbtn_funcionCadena.addActionListener(new ActionListener() {


			public void actionPerformed(ActionEvent e) {
				//ACTIVAR Y DESACTIVAR 
				if(rbtn_funcionCadena.isSelected()) 
					cal.estadoBotones(false);
				else
					cal.estadoBotones(true);
			}

		}	
				);
		add(rbtn_funcionCadena);
	}
}
