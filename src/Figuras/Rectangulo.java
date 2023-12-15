package Figuras;

public class Rectangulo extends Figura implements Cloneable, InterfazFigura
{
private int ancho, alto;
//***************************Creo constructor de copia y constructor pasando el parametro
public Rectangulo() {
	
}
public Rectangulo(int param) {
	
}
public Rectangulo(Rectangulo r) {
	this.alto=r.alto;
	this.ancho=r.ancho;
}
//********************************
public Rectangulo(int ancho, int alto)
{
this.ancho = ancho;
this.alto = alto;
}

public int getAncho()
{
return this.ancho; //se puede omitir this
}
public int getAlto()
{
return alto;
}
public Rectangulo incrementarAncho()
{
ancho++;
return this;
}
public Rectangulo incrementarAlto()
{
this.alto++; //se puede omitir this
return this;
}
//*******************************************
public Rectangulo incrementarAnchoR() {
this.ancho++;	
return this;
}

//*****************************************
public Object clone() {
    Object objeto = null;
    try{
        objeto = super.clone();
    }catch(CloneNotSupportedException ex){
        System.out.println("Error al duplicar");
    }
    return objeto;
}
//*******************
public double area ( ) {
	return ancho*alto;
}
 public void pintar ( ) {
	
}

}
