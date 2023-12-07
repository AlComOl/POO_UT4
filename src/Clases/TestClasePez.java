package Clases;

public class TestClasePez{
	public static void main(String[] args) throws Exception{
		Pez pez1 =new Pez();
		Pez pez2 =new Pez();
		Pez pez3 =new Pez();
		Pez pez4 =new Pez("nemo");
//		establezco valores del atributo mediante los setters
		pez1.setNombre("Pepito");
		pez2.setNombre("triqui");
//		Muestro los nombres de los atributos 
	System.out.println(	pez1.getNombre());
	System.out.println(	pez2.getNombre());
//		pez1 apunta a pez2  el contenido es igual 
			pez2=pez1;
//		Probando que el parametro apunte a nulo por lo tanto
			System.out.println("Comparo pez4 , paso por el constructor nemo y p2 que es triqui");
		System.out.println(pez4.equals(pez2));
////		con el metodo equals vemos comparamos y vemos que son exactamente iguales 
		System.out.println("Comparo pez1 apunta a pez2 , son iguales");
		System.out.println(	pez1.equals(pez2));
//		
//meter más ifs para ver otras situaciones como que apunte a nulo el parámetro
		System.out.println("Mediante ifs apuntando a nulo");
		if(pez4.equals(pez3)) {
			boolean iguales=true;
			System.out.println(iguales);
		}else if (pez4.equals(null)){
			//boolean iguales=false;
			System.out.println("Es igual a nulo");
		}
//		
////		mediante el metodo clone hacemos un clon del pez 2 y lo metemos en pez3
		System.out.println("Utilizando la clase clone para clonar al pez2 en pez3");
		pez3=pez2.clone();
//		sacamos el nombre del pez3
		System.out.println(pez3.nombre);//es el nombre del pez1 porque pez2 apunta a pez1
	

	}

}

