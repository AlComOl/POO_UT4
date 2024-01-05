package Apuntes;

public class Vehiculo{
private int numRuedas = 4;
private int numPuertas=4;
protected boolean llevoRadio=true;
public Vehiculo(){
showinfo();
}
public Vehiculo(int numPuertas,int numRuedas)
{
this.numPuertas=numPuertas;
this.numRuedas=numRuedas;
showinfo();
}
public void showinfo(){
System.out.println("Soy un vehiculo de "+ numPuertas +" puertas y "+numRuedas+" ruedas");
}
public void conducir(){
System.out.println("Conduzco con mis " + numRuedas + " ruedas.");
if (llevoRadio) System.out.println("Voy escuchando la radio");
}

}
		
	 
		
		