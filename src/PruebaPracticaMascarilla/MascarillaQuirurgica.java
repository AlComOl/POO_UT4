package PruebaPracticaMascarilla;

public class MascarillaQuirurgica extends Mascarilla{

//	atributos
	
	private int IVA=0;
	private double precioMaximo;
	
//	constructores 
	
	public MascarillaQuirurgica(double precio,double precioMaximo) {
		super.precio=(float) precio;
		this.precioMaximo=precioMaximo;
	}
//	metodos
	
	protected int getIVA() {
		
		return IVA;
	}
	public double getPrecioMaximo() {
		
		return precioMaximo;
	}
	
	public void  setPrecioMaximo(double precioMaximo) {
		
		this.precioMaximo=precioMaximo;
		
	}
	@Override
	public String toString() {
		return "\n Tipo de macarilla quirurgica tiene un precio de "+precio+" euros"+
				"\n El IVA de la mascarilla es "+getParteIva()+
				"\n La parte de IVA es "+ precio*IVA/100+" euros"+
				"\n PVP "+ (getParteIva()+getPrecio())+" euros";
	}
}
