package Clases;

public class Pez {
	
	protected String nombre;
	
	public Pez() {
		String nombre=null;
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
		boolean igual;
		if(this==a) 
			igual = true;
		else 
			 igual = false;
		
		return igual;
	}
	
	public boolean equalsA(Object o) {
		boolean igual;
		
		if(this.getNombre()==((Pez)o).getNombre()) {
			 igual =true;
			
		}else {
			igual =false;
		}
	
		return  igual;
	}
	
	public Pez clone(Object p) {
		Pez nuevo =new Pez();
		nuevo =(Pez) p;
		return nuevo;
	}
	

	
	public static class lenguado extends Pez{
		
		public lenguado() {
			this.nombre="lenguado";
		}
	}
}

