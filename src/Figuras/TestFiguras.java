package Figuras;



public class TestFiguras {

	 public static void main (String[] args){
	 Cuadrado c = new Cuadrado (5);
	 Rectangulo r1 = new Rectangulo(3, 2);
	 Rectangulo r2 = new Rectangulo(3, 2);
	 Rectangulo r3;
	 Rectangulo r = new Rectangulo();
	 Rectangulo cuadrado = new Rectangulo(5);//
//	 r = r2; r.finalize();
	 
	 
	 System.out.println(c.getColor());
	 c.setColor ("Verde");
	 System.out.println(c.getColor());
	 
	 System.out.println("Area: " +c.area());
	 
	 System.out.println("Ancho = " + r1.getAncho());
	 System.out.println("Alto = " + r1.getAlto());
	 
        r1.incrementarAncho();
	 r2=r1;
	 
	 r1 = r1.incrementarAnchoR();
	 System.out.println("Ancho1 = " + r1.getAncho());
	 
	 //equals
	 if(r1.equals(r2) || r1 == r2)
	    System.out.println("Iguales r1 y r2");
	 else
	    System.out.println("No son iguales r1 y r2");
	 
	 r3=r1;
	 if(r1.equals(r3) || r1 == r3)
	    System.out.println("Iguales r1 y r3");
	 else
	    System.out.println("No son iguales r1 y r3");
	    
	//getClass()
	    System.out.println(r1.getClass());
	    System.out.println(r2.getClass());
	    System.out.println(r3.getClass());
	//hashCode()
	    System.out.println(r1.hashCode());
	    System.out.println(r2.hashCode());
	    System.out.println(r3.hashCode());    
	//toString    
	    System.out.println(r1.toString());
	    System.out.println(r2.toString());
	    System.out.println(r3.toString());
	    
	//clone
	    Rectangulo r4 = new Rectangulo(7,5);
	    r4 = (Rectangulo) r1.clone();
	        System.out.println();
	    System.out.println(r1.toString());
	    System.out.println(r4.toString());
	    System.out.println("Ancho = " + r1.getAncho());
	 System.out.println("Alto = " + r1.getAlto());
	 System.out.println("Ancho = " + r4.getAncho());
	 System.out.println("Alto = " + r4.getAlto());
	 
	 
	 
	 
	 
	    
	//test clone
	    Rectangulo r5 = (Rectangulo) r1.clone();

	    System.out.println("Ancho r4 antes = " + r5.getAncho());
	    System.out.println("Alto r4 antes = " + r5.getAlto());
	 
	    r5.incrementarAncho();

	    System.out.println("Ancho r1 = " + r1.getAncho());
	    System.out.println("Alto r1 = " + r1.getAlto());
	 
	    System.out.println("Ancho r5 = " + r5.getAncho());
	    System.out.println("Alto r5 = " + r5.getAlto());

	    r5.setColor("Rojo");
	    System.out.println("Alto r5 = " + r5.getColor());
	//constructor de copia
	   Rectangulo r6 = new Rectangulo(r1);
	   r6.incrementarAncho();
	   r6.incrementarAlto();
	   System.out.println("Prueba constructor de copia");
	   System.out.println("Ancho r1 = " + r1.getAncho());
	   System.out.println("Alto r1 = " + r1.getAlto());
	   System.out.println("Ancho r6 = " + r6.getAncho());
	   System.out.println("Alto r6 = " + r6.getAlto());
	//finalizadores
	   for (int i = 0; i < 20; i++) {
	        Rectangulo r7 = new Rectangulo(7,5);
	  }
	   System.runFinalization();
	//   System.gc();
	  //prueba m�todo area de la interfaz
	   System.out.println("Area r6 = " + r6.area());
	   
	  //final
	  final Cuadrado c1 = new Cuadrado(5);
	  Cuadrado c2 = new Cuadrado(15);
	 // c1 = c2;
	// c2 = c1; //si que lo permite
	  c1.setLado(25); //si que permite utilizar los m�todos p�blicos
	  System.out.println("Area c1 = " + c1.area());
		
	  

	 }

	 }