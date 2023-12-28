package Ejercicio3;

public class TestPez {

	public static void main(String[] args) {
		
		
		Pez pez1 = new Pez();
		Pez pez2 = new Pez("Carlos");
		Pez pez3 = new Pez();
//		Pez pez4 = new Pez();
		Pez pez5 =new Pez("Jose");
	
		
		
		System.out.println(pez1.getnumpeces());
		System.out.println(pez2.getnumpeces());
		System.out.println(pez5.getNombre()+pez5.getnumpeces());
	
		
		
		
		
		Pez pez4 = new Pez(pez2);
//		compruebo que los peces tienen el mismo atributo(nombre)
		
		System.out.println(pez1.getNombre());
		System.out.println(pez5.getNombre());
//		con la funcion equals que tenenemos en el ejercicio 2
		
	if(pez1.equals(pez5)==true) {
		System.out.println("Son iguales");
	}else {
		System.out.println("Son distintos");
	}
}
}