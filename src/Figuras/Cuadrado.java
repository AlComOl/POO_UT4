package Figuras;

public class Cuadrado extends Figura {
	private int lado;
	
	Cuadrado(int l) { 
		this.lado = l; 
		}
	
	//método de instancia
	public int getArea() {
		return lado*lado;
		}
//Lo pongo con eclipse Implementar metodos
	@Override
	public void pintar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return 0;
	} 
}
