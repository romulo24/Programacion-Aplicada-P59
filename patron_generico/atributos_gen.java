package patron_generico;

import java.util.ArrayList;

public final class atributos_gen <T,S> {

	//ATRIBUTOS 

	private T atributoT1,atributoT2,atributoT3;
	private S atributoS4,atributoS5,atributoS6;
	private ArrayList<T>almacen;



	//CONSTRUCTORES SOBRECARGA DE CONSTRUCTORES

	public atributos_gen() {
		this.atributoT1=null;
		this.atributoT2=null;
		this.atributoT3=null;
		this.atributoS4=null;
		this.atributoS5=null;
		this.atributoS6=null;
	}
	public atributos_gen(T atributoT1,S atributoS4) {
		this.atributoT1 = atributoT1;
		this.atributoS4 = atributoS4;

	}
	public atributos_gen(T atributoT1,S atributoS4, S atributoS5) {
		this.atributoT1 = atributoT1;
		this.atributoS4 = atributoS4;
		this.atributoS5 = atributoS5;
	}
	public atributos_gen(T atributoT1,T atributoT2,S atributoS4, S atributoS5) {
		this.atributoT1 = atributoT1;
		this.atributoT2 = atributoT2;
		this.atributoS4 = atributoS4;
		this.atributoS5 = atributoS5;
	}

	//METODOS
	public void addAlmacen(T objeto) {
		almacen.add(objeto);
	}
	public ArrayList<T>getAlmacen(){
		return almacen;
	}
	public void reemplazarObjeto(int index,T objeto) {
		almacen.add(index,objeto);

	}
	//GETERS SETTERS
	public T getAtributoT1() {
		return atributoT1;
	}
	public void setAtributoT1(T atributoT1) {
		this.atributoT1 = atributoT1;
	}
	public T getAtributoT2() {
		return atributoT2;
	}
	public void setAtributoT2(T atributoT2) {
		this.atributoT2 = atributoT2;
	}
	public T getAtributoT3() {
		return atributoT3;
	}
	public void setAtributoT3(T atributoT3) {
		this.atributoT3 = atributoT3;
	}
	public S getAtributoS4() {
		return atributoS4;
	}
	public void setAtributoS4(S atributoS4) {
		this.atributoS4 = atributoS4;
	}
	public S getAtributoS5() {
		return atributoS5;
	}
	public void setAtributoS5(S atributoS5) {
		this.atributoS5 = atributoS5;
	}
	public S getAtributoS6() {
		return atributoS6;
	}
	public void setAtributoS6(S atributoS6) {
		this.atributoS6 = atributoS6;
	}


}
