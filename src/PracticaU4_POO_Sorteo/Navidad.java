package PracticaU4_POO_Sorteo;

public class Navidad extends Sorteo{
	
//	Atributos
	
	private int tercerN;
	private int tercerC;
	private int cuartoN1;
	private int cuartoC1;
	private int cuartoN2;
	private int cuartoC2;
	
	
//	Constructores
	
	public Navidad() {
		
	}
	public Navidad(int tn, int tc, int cn1, int cC1, int cn2, int cC2) {
		this.tercerN=tn;
		this.tercerC=tc;
		this.cuartoN1=cn1;
		this.cuartoC1=cC1;
		this.cuartoN1=cn2;
		this.cuartoC1=cC2;
		
	}
	public int getTercerN() {
		return tercerN;
	}
	public void setTercerN(int tercerN) {
		this.tercerN = tercerN;
	}
	public int getCuartoN1() {
		return cuartoN1;
	}
	public void setCuartoN1(int cuartoN1) {
		this.cuartoN1 = cuartoN1;
	}
	public int getCuartoN2() {
		return cuartoN2;
	}
	public void setCuartoN2(int cuartoN2) {
		this.cuartoN2 = cuartoN2;
	}
	
}
