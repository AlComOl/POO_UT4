package Clases;

public class Loro extends Animal{
	
	private String nombre= "LoroManolo";
	
	public String getNombre() {
		return this.nombre;
	}
	@Override
	public int CodigoAnimal() {
		
		return this.hashCode();
	}

}
