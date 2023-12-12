package Clases;

public class Pez {
	
	protected String nombre;
	
	public Pez() {
		
	}
	
	public Pez(String param) {
		
		this.nombre=param;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void setNombre(String param) {
		this.nombre=param;
	}
	
	public boolean equals(Object a) {
		boolean igual = false;
		if(this!=a) {
			igual = false;
		}
		else {
			Pez nuevo =new Pez();
			nuevo=(Pez)a;
			if(this.nombre==(nuevo.nombre)) {
				 igual = true;
			}
		}
		return igual;
	}
	

	
	
	public Pez clone(Object p) {
		Pez nuevo =new Pez();
		nuevo =(Pez) p;
		return nuevo;
	}
}

