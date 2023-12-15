package Figuras;

public class Punto {
	
	 
	    private int centro;
	    
	    public Punto(){
	        this.centro=10;
	    }
	    public int getX() {
			return centro;
		}
		public void setX(int x) {
			this.centro = x;
		}
		
		public int getCirculo(Circulo c) {
			Circulo p2=new Circulo();
			p2=c;
			return p2.getcentro();
		}
		
	
		
	    
	   

	}

