package Recursividad;

public class CuentaAtras {

	public static void main(String[] args) {
		
	System.out.println(cuentaAtras(6));
	}
	
	public static int cuentaAtras(int param) {
		int res;
		
		if(param==0) {
			 res=0;
			
		}else {
			
			System.out.println(param);
			
			res=cuentaAtras(param-1);
		
			System.out.println(param);
		}
	return 	res;
	}

}
