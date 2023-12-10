package Clases;

public class TestClasePezPrueba{
	public static void main(String[] args) throws Exception{
		PezPrueba pez1 =new PezPrueba();
		PezPrueba pez2 =new PezPrueba();
		PezPrueba pez3 =new PezPrueba();
		PezPrueba pez4 =new PezPrueba("nemo");
//		establezco valores del atributo mediante los setters
		pez1.setNombre("Pepito");
		pez2.setNombre("triqui");
//		Muestro los nombres de los atributos 
	System.out.println(	pez1.getNombre());
	System.out.println(	pez2.getNombre());
//		pez1 apunta a pez2  el contenido es igual 
			pez1=pez2;
//		Probando que el parametro apunte a nulo por lo tanto
			System.out.println("Comparo pez4 , paso por el constructor nemo y p2 que es triqui");
		System.out.println(pez4.equals(pez2));
////		con el metodo equals vemos comparamos y vemos que son exactamente iguales 
		System.out.println("Comparo pez1 apunta a pez2 , son iguales");
		System.out.println(	pez1.equals(pez2));
//		
//meter más ifs para ver otras situaciones como que apunte a nulo el parámetro
//		System.out.println("Mediante ifs apuntando a nulo");
//		if(pez4.equals(pez3)) {
//			boolean iguales=true;
//			System.out.println(iguales);
//		}else if (pez4.equals(null)){
//			//boolean iguales=false;
//			System.out.println("Es igual a nulo");
//		}else if(pez4.equals(123)) {
//			
//		}
		System.out.println("/*********************************");
	System.out.println(	pez3.equals(pez4));
		
//		
////		mediante el metodo clone hacemos un clon del pez 2 y lo metemos en pez3
		System.out.println("Utilizando la clase clone para clonar al pez2 en pez3");
		pez3=pez2.clone(pez2);
		pez1.setNombre("agua");
//		sacamos el nombre del pez3
		System.out.println(pez3.nombre); // Muestra nombre pez2 en su momento
		System.out.println(pez2.nombre); // Muestra nombre pez1 porque apunta al mismo objeto
	}

}

