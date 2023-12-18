package PracticaU4_POO_Sorteo;
import java.util.*;
public  class CompruebaPremios {
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int opcion, opcion1,opcion3,comprobar;//menus
		int num1,num2,cantidad1,cantidad2;//sorteo
		int num3,cantidad3,cantidad4_1,cantidad4_2,num4_1,num4_2;//navidad
		String fecha ="",lugar ="";
		Navidad na = new Navidad();
		do {
			System.out.println("\n 1-Crear sorteo \n 2-Comprobar Premios \n 3-SALIR");
			opcion=entrada.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Que tipo de sorteo deseas crear \n 1-Navidad \n 2-Ninyo \n 3-Ordinario");
				opcion1=entrada.nextInt();
				switch (opcion1) {
				case 1:
//					ATRIBUTOS SUPER
					System.out.println("Introduce fecha sorteo ");
					fecha=entrada.next();
					
					System.out.println("Introduce lugar sorteo ");
					lugar=entrada.next();
					
					
					System.out.println("Introduce numero primer premio ");
					num1=entrada.nextInt();
					
					System.out.println("Introduce cantidad premio primer premio ");
					cantidad1=entrada.nextInt();
					
					System.out.println("Introduce numero segundo premio ");
					num2=entrada.nextInt();
					
					System.out.println("Introduce cantidad premio segundo premio ");
					cantidad2=entrada.nextInt();
					
//					ATRIBUTOS DE NAVIDAD
					System.out.println("Introduce tercer premio premio");
					num3=entrada.nextInt();
//					a.setTercerN(num3);
					
					System.out.println("Introduce cantidad premio tercer premio");
					cantidad3=entrada.nextInt();
//					a.setTercerC(cantidad3);
					
					System.out.println("Introduce primer numero cuarto");
					num4_1=entrada.nextInt();
//					a.setCuartoN1(num4);
					
					System.out.println("Introduce cantidad primer cuarto");
					cantidad4_1=entrada.nextInt();
//					a.setCuartoC1(cantidad4_1);
					
					System.out.println("Introduce segundo numero cuarto");
					num4_2=entrada.nextInt();
//					a.setCuartoN2(num4_2);
					
					System.out.println("Introduce cantidad segundo cuarto");
					cantidad4_2=entrada.nextInt();
//					a.setCuartoC2(cantidad4_2);
					 na=new Navidad(fecha,lugar,num1,cantidad1,num2,cantidad2,num3,cantidad3,num4_1,cantidad4_1,num4_2 ,cantidad4_2);
					
					break;
				
				case 2:
//					switch para Ordinario 

					break;
				case 3:
//					 switch para el sorteo del niño
					break;

				default:
					break;
				}
				
		
				
				break;
//				COMPROBAR PREMIOS
			case 2:
				
				System.out.println("Que sorteo quieres comprovar los premios \n 1-Navidad \n 2-Ordinario \n 3-Ninyo");
				comprobar=entrada.nextInt();
					switch (comprobar) {
					case 1:
						boolean stop=false;
						int decimo, dinero,premio;
						
						while(!stop) {
							System.out.println("Introduce numero a comprobar");
							decimo=entrada.nextInt();
							System.out.println("Introduce el dinero invertido en decimos");
							dinero=entrada.nextInt();
							if(decimo==na.getNum1premio()) {
								System.out.println("Has ganado el primer premio");
//								cantidad de dinero por euro invertido
								premio=na.getCantidad1G()*dinero;
								System.out.println("El premio es "+premio);
							}
							
						}
						
						
						break;

					default:
						break;
					}
				break;

			default:
				break;
			}
			
			
		}while(opcion!=0);
		


	}

}
