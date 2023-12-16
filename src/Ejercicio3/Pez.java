package Ejercicio3;


public class Pez {
	
	protected String nombre ;
	private static int numpeces=0; //poniendo el static lo que hacemos es que el atrubuto sea
//	comun para todos los objetos y cada vez que instanciamos un objeto pase por el constructor 
//	y aumente en 1 .
	
	public Pez() {
		numpeces++;
	}
//	constructor de copia 
	public Pez(Pez o) {
		this.nombre=o.nombre;
	}
	
	public Pez(String param) {
		
		this.nombre=param;
		numpeces++;
	}
	
	public String getNombre() {
		
		return this.nombre;
	}
	
	public void setNombre(String param) {
		this.nombre=param;
	}
	
	public int getnumpeces() {
		return this.numpeces;
	}
	public void setnumpeces(int param) {
		numpeces=param;
	}

	public boolean equals(Object a) {
		boolean igual = true;
		if(this==a) {
			igual = true;
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
	
}

