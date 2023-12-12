package Clases;
public class TestEstaticos {
		public static void main (String[] args) {
		
		Cohete c1 = new Cohete();
		Cohete c2 = new Cohete();
		Cohete c3 = new Cohete();
		c3=new Cohete();jhn
		System.out.println(c1.getCohetes());
		System.out.println(c3.getCohetes());
		System.out.println(Cohete.getCohetes());
		}
		}