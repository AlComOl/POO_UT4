package Figuras;

public class Rectangulo extends Figura
{
private int ancho, alto;
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
public double area ( ) {
	return ancho*alto;
}
 public void pintar ( ) {
	
}

}
