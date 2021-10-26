package Ejercicio05;
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
//ENCERAR LOS VALORES 
	
	public void encerar() {
	g.setAtributo1(0.0);
	
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
