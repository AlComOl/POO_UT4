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
// Implementar metodos
	@Override
	public void pintar() {
		
		
	}

	@Override
	public double area() {
		
		return 0;
	}

	public void setLado(int i) {
		this.lado=i;
		
	} 
}
