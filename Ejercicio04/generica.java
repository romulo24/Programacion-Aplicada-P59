package Ejercicio04;

public class generica<T,S,N extends Number> {
	
	//ATRIBUTOS GENERICOS 
	private T atributo1,atributo2;
	private S atributo3,atributo4;
	
	//METODOS GENERICOS 
	public generica(T at1,T at2,S at3,S at4) {
		this.atributo1=at1;
		this.atributo2=at2;
		this.atributo3=at3;
		this.atributo4=at4;
	}
	public generica(T at1,S at2) {
		this.atributo1=at1;
		this.atributo3=at2;
	}
	//METODOS GENERICOS 
	public void print(T atributo) {
		System.out.println("\t"+atributo);
		
	}
	public N ValoresCalculados(N valor) {
		return valor;
	}
	
	
	//GETTERS & SETTERS GENERICOS
	
	public T getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(T atributo1) {
		this.atributo1 = atributo1;
	}
	public T getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(T atributo2) {
		this.atributo2 = atributo2;
	}
	public S getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(S atributo3) {
		this.atributo3 = atributo3;
	}
	public S getAtributo4() {
		return atributo4;
	}
	public void setAtributo4(S atributo4) {
		this.atributo4 = atributo4;
	}

}
