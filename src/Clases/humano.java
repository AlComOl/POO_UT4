package Clases;

public class humano implements Cloneable{

	protected String tipo ="trabajador";
	
	public String getTipo() {
		return this.tipo;
	}
	public void setTipo(String param) {
		this.tipo=param;
	}
	
//	metodo equals
	public boolean equals(String param) {
		boolean info =true;
		if(this.equals(param)) {
			
		}else {
			info=false;
		}
		return info;
	}
}
