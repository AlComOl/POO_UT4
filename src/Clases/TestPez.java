package Clases;

public class TestPez {

	public static void main(String[] args) {
		
		Pez pez1 =new Pez();
		Pez pez2 =new Pez("nemo");
		Sardina pez3 =new Sardina();
		Lenguado pez4=new Lenguado();
		Pez pez5 =new Pez();
		Loro loro1=new Loro();
		System.out.println("Peces que tengo dentro del acuario");
		System.out.println("pez1 "+pez1.getNombre()+"\t Identificador "+pez1.CodigoAnimal());
		System.out.println("pez2 "+pez2.getNombre()+"\t Identificador "+pez2.CodigoAnimal());
		System.out.println("pez3 "+pez3.getNombre()+"\t Identificador "+pez3.CodigoAnimal());
		System.out.println("pez4 "+pez4.getNombre()+"\t Identificador "+pez4.CodigoAnimal());
		System.out.println("loro1 "+loro1.getNombre()+"\t Identificador "+pez4.CodigoAnimal());
		
		
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
		
		pez5.clone(pez2);
		
		if(pez2.equals(pez5)) {
			System.out.println("pez2 y pez5 son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
		
		
		
		System.out.println("**************Comparando sardina con pez ");
		
		
		
		if(pez3.equals(pez1)) {
			System.out.println("pez3 y pez1 son iguales");
		}else {
			System.out.println("pez3 y pez1 son diferentes");
		}
		
		System.out.println("**************Comparando con un parametro que apunta a null");
		
		if(pez1.equals(null)) {
			System.out.println("son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
	
		System.out.println("****************Compararando  pez1 con un String*********");
	
		if(pez1.equals("Pepe")) {
			System.out.println("son iguales");
		}else {
			System.out.println("pez2 y pez5 son diferentes");
		}
		
		System.out.println("********************Comparando los atributos**********");
		
//		pez1.setNombre("nemo");
		
		pez1=pez2;
		
		if(pez1.equals(pez2)) {
			System.out.println("son iguales");
		}else {
			System.out.println("no son iguales");
		}
		
	}

}
