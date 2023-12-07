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
	

public class Pez implements Cloneable{
//  atributo protected para poder ver el contenido desde sus clases hijas y desde el mismo paquete.
		protected String nombre;
		
//		constructor
		public Pez() {//Probando que apunte a nulo
			nombre="";
		}
//		constructor con argumentos
		public Pez(String param) {
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

		
		public boolean equals(Object o) {
			boolean igual;
			if(this==o) {
				 igual =true;
				
			}else {
				igual =false;
			}
		
			return  igual;
		}
		
//			Metodo clone hace una copia del objeto y sobre escribe al padre
		@Override
		public Pez clone(){
			Pez nuevo = null;
//			La dinamica try cath es como si consigues hacer la ación 
			try {
//			Instancia un otro objeto de Clase pez haciendo el casting
			nuevo=(Pez) super.clone();
//			Si no lo consigues ejecuta esto 
			}catch(CloneNotSupportedException ex){
				System.out.println("Error al duplicar");
			}
			return nuevo;
		}
		
		
}
