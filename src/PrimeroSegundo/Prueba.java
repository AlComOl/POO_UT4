package PrimeroSegundo;

public class Prueba {

	public void primero() {
		System.out.println("PrimerMetodo");
	}
	public void segundo() {

		this.primero();
		this.primero();
		
		System.out.println("SegundoMetodo");
	}

	public static void main (String args[]){
		Prueba p1=new Prueba();
		
		p1.primero();
		p1.segundo();
		
	}


}


