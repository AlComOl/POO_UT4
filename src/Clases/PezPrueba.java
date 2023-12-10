package Clases;

/****************************************************************************************************************************

Autor: Álvaro Comenge

Fecha:05/12/23


Descripción:

	 Realice la clae Pez, la cual tendrá un miembro nombre de tipo String el cual podrá ser heredado por su susbclases.
	 Realice un método getNombre y otro setNombre. Utilice el oobjeto this en estos metodos. Implemente en esta clase el método clone() 
	 así como el método equals() para poder hacer una comparación en profundidad. Realice un programa que haga un testeo en profundidad 
	 de las características de la clase.




***********************************************************************************************************************************/
	

public class PezPrueba {
//  atributo protected para poder ver el contenido desde sus clases hijas y desde el mismo paquete.
		protected String nombre;
		
//		constructor
		public PezPrueba() {//Probando que apunte a nulo
			nombre="";
		}
//		constructor con argumentos
		public PezPrueba(String param) {
			this.nombre=param;
		}
//	getter	
		public String getNombre() {
			
			return this.nombre;
		}
//		setter
		public void setNombre(String param) {
			
			this.nombre=param;
		}

//		Metodo equals para comparar 
		
		public boolean equals(Object o) {
			boolean igual;
			
			if(this.getNombre()==((PezPrueba)o).getNombre()) {
				 igual =true;
				
			}else {
				igual =false;
			}
		
			return  igual;
		}
		
		
		
//			Metodo clone hace una copia del objeto y sobre escribe al padre
		
		public PezPrueba clone(PezPrueba a){
			PezPrueba nuevo = new PezPrueba();
			nuevo.setNombre(a.getNombre());
			return nuevo;
		}
		
		
}
