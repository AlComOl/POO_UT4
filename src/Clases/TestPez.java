package Clases;

import Clases.Pez.lenguado;

public class TestPez {

	public static void main(String[] args) {
		
		Pez pez1 =new Pez();
		Pez pez2 =new Pez("nemo");
		sardina pez3 =new sardina();
//		con el metodo static hacemos que la clase sea interna y por tanto podemos acceder a ella
		Pez.lenguado pez4=new Pez.lenguado();
		System.out.println("Peces que tengo dentro del acuario");
		System.out.println("pez1 "+pez1.getNombre());
		System.out.println("pez2 "+pez2.getNombre());
		System.out.println("pez3 "+pez3.getNombre());
		System.out.println("pez4 "+pez4.getNombre());
		System.out.println("*****************");
		
		
//		con equals comparamos el objeto en global
		
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
		
		
		
		
		
		
		
//		System.out.println("Compara el global de pez1 es igual a p2 " + pez1.equals(pez2));
//		pez2.setNombre(null);//al cambiar el valor el atributo será diferente
//		System.out.println("Compara atrubuto de  pez1 es igual a p2 " +pez1.equalsA(pez2));
//		System.out.println("Si pez2 apunta a pez1");
//		pez2=pez1;//al apuntar pez2 a pez1 tendran los mismos valores(si despues cambiamos el puntero valdra hacia donde apuntemos)
//		pez1.equals(pez2);
//		
//		System.out.println(pez2.equalsA(pez1));
//	
//		System.out.println(pez2.equals(pez1));
//		
//		System.out.println("************ ");
//		
//		Pez pez5=pez1.clone(pez1);
//		System.out.println(pez1.equals(pez5));
//		
//		System.out.println("************Apuntando a pez3 ");
//		pez5=pez3;
//		System.out.println(pez1.equals(pez5));
//		
//		
		
	
		
		
		
	}

}
