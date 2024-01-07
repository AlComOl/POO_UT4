package PruebaPracticaMascarilla;

public abstract class Mascarilla  implements Interface{
	
//atributos 
	protected float precio;
	
//	constructor
	
	public Mascarilla() {
		
	}
	public Mascarilla(float precio) {
		this.precio=precio;
	}
	
//	metodos 
	
	public double getPrecio() {
		return precio;
	}
	public double getParteIva() {
		double pp=(precio*IVA)/100;
		return pp;
	}
	protected int getIVA() {
		return 21 ;
	}

}
