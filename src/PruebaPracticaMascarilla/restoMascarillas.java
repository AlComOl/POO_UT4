package PruebaPracticaMascarilla;

public class restoMascarillas extends Mascarilla{
//	atributos 
	
	private int IVA=21;
	private String tipoMascarilla;
	
//	constructor 
	
	public restoMascarillas() {
		
	}
	public restoMascarillas(String nombre, double precio) {
		this.tipoMascarilla=nombre;
		super.precio=(float) precio;
	}
	
//	metodos

	protected int getIVA() {
		return IVA;
	}
	public String gettipoMascarilla() {
		return tipoMascarilla;
	}
	public void setTipoMascarilla(String tipo) {
		this.tipoMascarilla=tipo;
	}
	
	public String toString() {
		return "\n Tipo de macarilla es :"+gettipoMascarilla()+"\n El precio de la mascarilla es "+super.precio+
				"\n El IVA de la mascarilla es "+getIVA()+" %"+" \n La parte de IVA es "+getParteIva();
	}
}
