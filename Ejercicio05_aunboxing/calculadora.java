package Ejercicio05_aunboxing;
import Ejercicio04.generica;

public class calculadora {

	//ARIBUTOS 
	private generica<Double,Integer,Double>g;
	private panel_calculadora pc; //DECLARANDO A LA CLASE DE PANEL_CALCULADORA


	//METODOS
	public calculadora(panel_calculadora pc) {

		g = new generica<Double,Integer,Double>(0.0,0);
		this.pc=pc; //INICIALIZACION DEL panel_calculadora	
	}

	public Double getSuma(Double valor) {
		g.setAtributo1(valor+g.getAtributo1());
		return g.ValoresCalculados(g.getAtributo1());

	}
	public Double getResta(Double valor) {
		if(g.getAtributo1()==0)
			g.setAtributo1(valor);
		else
			g.setAtributo1(valor-g.getAtributo1());
		return g.ValoresCalculados(g.getAtributo1());
	}


	public Double getMultiplicacion(Double valor) {
		if(g.getAtributo1()==0) {
			g.setAtributo1(valor);
		}
		else if(g.getAtributo1()!=0) {
			g.setAtributo1(valor*g.getAtributo1());

		}
		return g.ValoresCalculados(g.getAtributo1());
	}

	public Double getDivision(Double valor) {
		if(g.getAtributo1()==0)
			g.setAtributo1(valor);
		else
			g.setAtributo1(valor/g.getAtributo1());
		return g.ValoresCalculados(g.getAtributo1());

	}
	//ACTIVAR Y DESACTIVAR BOTONES 
	public void estadoBotones(boolean estado) {
		pc.btn_Suma.setEnabled(estado);
		pc.btn_Resta.setEnabled(estado);
		pc.btn_Multiplicacion.setEnabled(estado);
		pc.btn_Division.setEnabled(estado);
		pc.btn_Promedio.setEnabled(estado);
		pc.btn_Porcentaje.setEnabled(estado);
		pc.btn_Ac.setEnabled(estado);
		pc.btn_Resultado.setEnabled(estado);

	}

	//ENCERAR LOS VALORES 
	public void encerar() {
		g.setAtributo1(0.0);
		g.setAtributo3(0);
		//PANEL DE LA CALCULADORA
		pc.textField.setText("0.0");

	}

	public void addValores(Double valor) {
		g.setAtributo1(getSuma(valor));
		g.setAtributo3(g.getAtributo3()+1);
	}
	public double getPromedio() {
		if(g.getAtributo1() == 0 )
			g.setAtributo1(0.0);
		else
			g.setAtributo1(g.getAtributo1()/g.getAtributo3());
		return g.ValoresCalculados(g.getAtributo1());
	}

	public double getPorcentaje(Double valor) {
		if(g.getAtributo1() ==0 )
			g.setAtributo1(valor);
		else 
			g.setAtributo1((g.getAtributo1()/100) * valor );
		return g.ValoresCalculados(g.getAtributo1());
	}
}
