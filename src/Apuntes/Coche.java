package Apuntes;


 class Coche extends Vehiculo
{
public Coche()
{
System.out.println("Soy un coche");
}
@Override
public void conducir()
{
cierraPuertas();
super.conducir();
}
public void cierraPuertas(){
System.out.println("Cierro las puertas.");
}
}