package PracticaU4_POO;

public class RestodeMascarillas extends Mascarilla{
	
//	atributos
	private int iva=IVA;//invoco al iva de la interface
	private String tipoMascarilla;
	
//	constructor
	
	public RestodeMascarillas(String tipo, double precio) {
		
		this.tipoMascarilla=tipo;
		this.precio=(float) precio;
	}
	
	protected int getIVA() {

		return iva;
	}
	
	public String tipoMascarilla() {
		
		return tipoMascarilla;
	}
	public String getTipo() {
		
		return tipoMascarilla;
	}
	
	public void setTipoMascarilla(String tipo) {
		
		this.tipoMascarilla=tipo;
	}
	@Override
	public String toString() {
		
		return "Las mascarillas de tipo "+getTipo()+ "tienen un precio de "+getPrecio()+" el grabamen (impuesto) "+getIVA()+"IVA corresponde a la mascarilla "+getParteIVA()+"PVP"+(getPrecio()+getParteIVA());
	}

	


	}
