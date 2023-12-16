package PracticaU4_POO;

public class MascarillaQuirurgica extends Mascarilla{
	
//	Atributos
	private int IVA=4;
	private double precioMaximo;
	
//	Constructor

	
	public MascarillaQuirurgica(double precio, double precioMax) {
		 
		this.precio=(float) precio;
		this.precioMaximo=precioMax;
		
	}
	
	protected int  getIVA() {
		
		return  IVA;
	}
	
	public double getPrecioMaximo() {
		
		return precioMaximo;
		
	}
	
	public void setPrecioMaximo(double precioMaximo) {
		
		this.precioMaximo=precioMaximo;
	}
	@Override
	public double getParteIVA() {
		
		float precioIVA;
		precioIVA=(float) (this.precio*IVA/100);
		
		return precioIVA;
		
	}
//	cuando tienes una funcion toString lo que haces es como etiquetar la clase escribiendo los datos en to string 
	@Override
	public String toString() {
		
		return "Precio de la mascarilla "+getPrecio()+"\n Precio maximo de la mascarilla "+getPrecioMaximo()+" \n Tipo grabamen (impuestos) "+ getIVA()+"\n IVA de las mascarillas "+getParteIVA()+"\n PVP "+(getParteIVA()+getPrecio());
	}

}
