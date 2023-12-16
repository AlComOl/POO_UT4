package PrecioDevolucion;

public class DarCambio {

	 public  void darCambio(int c) {
		   if (c!=0) {
		   		int d;
		 		int salidaB;
		 		while (c!=0) {			
		 			d=c>=50000 ? 50000:c>=20000 ? 20000:c>=10000 ? 10000:c>=5000 ? 5000:c>=2000 ? 2000:c>=1000 ? 1000:c>=500 ? 500 : c>=200 ? 200:c>=100 ? 100:c>=50 ? 50:c>=20 ? 20:c>=10 ? 10:c>=5 ? 5 : c>=2 ? 2: c>=1 ? 1: 0; 
		 			if (d>0) {
		 				salidaB= c/d;
		 				c=c%d;
		 				if (salidaB>0&&d>=500) {
		 					System.out.println("Billete de "+ d/100 + " euros: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=200&&d>100) {
		 					System.out.println("Moneda de "+ d/100 + " euros: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=100&&d>50) {
		 					System.out.println("Moneda de "+ d/100 + " euro: "+ salidaB);
		 				}
		 				if (salidaB>0&&d<=50&&d>1) {
		 					System.out.println("Moneda de "+ d + " centimos: "+ salidaB);
		 				}
		 				if (salidaB>0&&d==1) {
		 					System.out.println("Moneda de "+ d + " centimo: "+ salidaB);
		 				}
		 			}
		 		}
		  }
	 }
}
