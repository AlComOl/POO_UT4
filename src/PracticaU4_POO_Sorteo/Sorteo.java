package PracticaU4_POO_Sorteo;

public abstract class Sorteo implements Loteria{
//	Atributos
	private int fechaS;
	private String lugarS;
	private int num1premio;
	private int cantidad1G;
	private int num2premio;
	private int cantidad2G;



//constructores
public Sorteo() {
		
}

public Sorteo(int f, String l, int n1, int c1, int n2, int c2) {
	this.fechaS=f;
	this.lugarS=l;
	this.num1premio=n1;
	this.cantidad1G=c1;
	this.num2premio=n2;
	this.cantidad2G=c2;
}

public int getreintegro(int num1premio) {
	int reintegro=num1premio%10;
		
	
	
	return reintegro;
}

}