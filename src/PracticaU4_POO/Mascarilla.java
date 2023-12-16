package PracticaU4_POO;

public abstract class Mascarilla implements Interface{
	
//	Atributos
	protected float precio;//creo que esta mal la unidad
	
//	Constructor
	public Mascarilla() {
		
	}
	
	public Mascarilla(float precio) {
		this.precio=precio;
	}
	
//	metodos
	
	public double getPrecio() {
		
		return precio;
	}
	public double getParteIVA() {
		
		float precioIVA;
		precioIVA=(float) (this.precio*IVA/100);
		
		return precioIVA;
		
	}
	protected abstract int getIVA();
}
