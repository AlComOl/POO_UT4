package PracticaU4_POO_Sorteo;

public class Navidad extends Sorteo{
	
//	Atributos
	
	private  int tercerN;
	private  int  tercerC;
	private  int cuartoN1;
	private  int cuartoC1;//Solo tiene que haver un premio del cuarto premio
	private  int cuartoN2;
	private  int cuartoC2;
	
	
//	Constructores
	
	public Navidad() {
		
	}
//	pasamos los valores del padre y lo invocamos.De manera que tenemos todos los datos en esta clase
	public  Navidad(String fechasS, String lugarS, int num1premio, int cantidad1G, int num2premio, int cantidad2G,int tn, int tc, int cn1, int cC1, int cn2, int cC2) {
		super(fechasS,lugarS,num1premio,cantidad1G,num2premio,cantidad2G);
		this.tercerN=tn;
		this.tercerC=tc;
		this.cuartoN1=cn1;
		this.cuartoC1=cC1;
		this.cuartoN2=cn2;
		this.cuartoC2=cC2;
		
	}
	public int  getTercerN() {
		return tercerN;
	}
	public void setTercerN(int tercerN) {
		this.tercerN=tercerN;
	}
	
	public int getTercerC() {
		return tercerC;
	}
	public void setTercerC(int tercerC) {
		this.tercerC = tercerC;
	}
	public int getCuartoC1() {
		return cuartoC1;
	}
	public void setCuartoC1(int cuartoC1) {
		this.cuartoC1 = cuartoC1;
	}
	public int getCuartoC2() {
		return cuartoC2;
	}
	public void setCuartoC2(int cuartoC2) {
		this.cuartoC2 = cuartoC2;
	}
	
	public  int getCuartoN1() {
		return cuartoN1;
	}
	public void setCuartoN1(int cuartoN1) {
		this.cuartoN1 = cuartoN1;
	}
	public int getCuartoN2() {
		return cuartoN2;
	}
	public void setCuartoN2(int cuartoN2) {
		this.cuartoN2 = cuartoN2;
	}
	@Override
	public int getLimite() {
		// TODO Auto-generated method stub
		return 0;
	}
//	aqui Esta mal este metodo porque lo hereda del padre
//	public void reintegroPP(int numero) {
//		int reintegro=numero%10;	
//		System.out.println(reintegro);
//	}
	
	@Override
	public String toString() {
		return "\n Tercer numero premiado"+getTercerN()+"\n Cantidad tercer numero"+getTercerC()+
				"\n Primer Cuarto numero premiado"+getCuartoN1()+"\n Cantidad Cuarto Numero premiado"+getCuartoC2()+
				"\n Segundo cuarto Premio"+getCuartoN2()+"\n Cantidad Cuarto segundo Numero premiado"+getCuartoN2()+
				""+"";
	}
	@Override
	public int reintegroPP() {
		return cuartoC1;
		// TODO Auto-generated method stub
		
	}
	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
