package PracticaU4_POO_Sorteo;

public interface Loteria {

//	atributo
	
	public  int tipo=20 ;
	public final int LIMITE=40000;
	
//	una interface tiene todos los metodos por hacer
	public abstract int  reintegroPP();//no hace falta ponerlo 
	public abstract int getLimite();
	public abstract int getTipo();
	public abstract String toString();
	
	
}
