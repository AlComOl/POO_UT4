package Clases;

public class TestPez {

	public static void main(String[] args) {
		
		Pez pez1 =new Pez();
		Pez pez2 =new Pez("nemo");
		Sardina pez3 =new Sardina();
		Lenguado pez4=new Lenguado();
		
		System.out.println("Peces que tengo dentro del acuario");
		System.out.println("pez1 "+pez1.getNombre());
		System.out.println("pez2 "+pez2.getNombre());
		System.out.println("pez3 "+pez3.getNombre());
		System.out.println("pez4 "+pez4.getNombre());
		
		
		System.out.println("*****************Comparando 2 pez difenrentes");
		
		
		if(pez1.equals(pez2)) {
			System.out.println("pez1 y pez2 son iguales");
			
		}else {
			System.out.println("pez1 y pez2 son diferentes");
		}
		
		System.out.println("************Apuntando*****************");
		pez1=pez2;//pez1 apunta a pez2 
		
		if(pez1.equals(pez2)) {
			System.out.println("pez1 y pez2 son iguales");
		}else {
			System.out.println("pez1 y pez2 son diferentes");
		}

		System.out.println("*************clonando******************");
		
		Pez pez5=pez2.clone(pez2);
		
		if(pez2.equals(pez5)) {
			System.out.println("pez2 y pez5 son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
		
		
		System.out.println("**************Comparando sardina con pez ");
		
		
		
		if(pez3.equals(pez2)) {
			System.out.println("pez2 y pez5 son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
		
		System.out.println("**************Comparando con un parametro que apunta a null");
		
		if(pez1.equals(null)) {
			System.out.println("son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
	
		System.out.println("****************Compararlo con un String*********");
	
		if("Pepe".equals("Pepe")) {
			System.out.println("son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
		
		
	}

}
