package PracticaU4_POO_Sorteo;

public  abstract class Sorteo implements Loteria{
//	Atributos
	private String fechaS;//fecha del sorteo
	private String lugarS;//lugar del sorteo
	private int num1premio;//número del primer premio
	private int cantidad1G;//cantidad ganada por euro jugado si se acierta el primer premio
	private int num2premio;//número del segundo premio
	private int cantidad2G;//cantidad ganada por euro jugado si se acierta el segundo premio



//constructores
public Sorteo() {
		
}

public Sorteo(String fechasS, String lugarS, int num1premio, int cantidad1G, int num2premio, int cantidad2G) {
	this.fechaS=fechasS;
	this.lugarS=lugarS;
	this.num1premio=num1premio;
	this.cantidad1G=cantidad1G;
	this.num2premio=num2premio;
	this.cantidad2G=cantidad2G;
}

public String getFechaS() {
	return fechaS;
}

public void setFechaS(String fechaS) {
	fechaS = fechaS;
}

public String getLugarS() {
	return lugarS;
}

public void setLugarS(String lugarS) {
	this.lugarS = lugarS;
}

public int getNum1premio() {
	return num1premio;
}

public void setNum1premio(int num1premio) {
	this.num1premio = num1premio;
}

public int getCantidad1G() {
	return cantidad1G;
}

public void setCantidad1G(int cantidad1g) {
	cantidad1G = cantidad1g;
}

public int getNum2premio() {
	return num2premio;
}

public void setNum2premio(int num2premio) {
	this.num2premio = num2premio;
}

public int getCantidad2G() {
	return cantidad2G;
}

public void setCantidad2G(int cantidad2g) {
	cantidad2G = cantidad2g;

}

public void reintegroPP(int numero) {
	int reintegro=numero%10;	
	System.out.println(reintegro);
}



public String toString() {
	return "";
}

}