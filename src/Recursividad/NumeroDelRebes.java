package Recursividad;

public class NumeroDelRebes {
	
	public int delRebes (int n) {
		int res;
		if(n<10) {
			res=n;
		}else {
			
			for (int i=0;i<n;i++) {
			n=n/10;
			}
					res=n%10*Math.pow(10, longitud(n)-1)+F(n/10);
		}
		return res;
		}

}
