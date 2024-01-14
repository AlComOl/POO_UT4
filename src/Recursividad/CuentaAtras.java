package Recursividad;

public class CuentaAtras {

	public static void main(String[] args) {
		
		cuentaAtras(6);
	}
	
	public static int cuentaAtras(int param) {
		int res;
		
		if(param==0) {
			 res=0;
			
		}else {
			System.out.println(param);
			
			res=1+cuentaAtras(param-1);
			
			
		}
	return 	res;
	}

}
