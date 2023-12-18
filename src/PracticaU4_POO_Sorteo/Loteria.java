package PracticaU4_POO_Sorteo;

public interface Loteria {

//	atributo
	
	public  int tipo=20 ;
	public final int LIMITE=40000;
	
	
	public abstract void  reintegroPP();
	public abstract int getLimite();
	public abstract int getTipo();
	public abstract String toString();
	
	
}
