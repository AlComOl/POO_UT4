package PracticaU4_POO_Sorteo;

public abstract class Ninyo extends Sorteo{

//	Atributos
	
	private int tercerp;
	private int cantidadp;
	private int reintegro2;//revisar deberia ser un metodo 
	private int reintegro3;
	
//	Constructores
	
	public Ninyo() {
		
	}
	public Ninyo(int tp, int cp, int r2, int r3) {
		this.tercerp=tp;
		this.cantidadp=cp;
		this.reintegro2=r2;
		this.reintegro3=r3;
		
	}
}
