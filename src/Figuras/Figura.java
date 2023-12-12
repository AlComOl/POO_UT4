package Figuras;

 public abstract class Figura{
	
		abstract public void pintar ( ) ;
		abstract public double area ( ) ;
		
		private String color;
		
		public String getColor() {
			return color;
		}
		public void  setColor() {
			this.color=color;
		}
		}

