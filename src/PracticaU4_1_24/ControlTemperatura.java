package PracticaU4_1_24;

public final class ControlTemperatura extends ControlInstalacion{
	
	private final float lMax=30;
	private float lMin=18;
	public ControlTemperatura(String nombre, float dato, float lMin,float lMax){
		super(nombre,dato);
		
		lMax=this.lMax;
		lMin=this.lMin;
	
	
	}
	

	@Override
	public void procesarValor() {
		// TODO Auto-generated method stub
		
	}
	
	public void setLectura() {
		
	}


	@Override
	public float getLectura() {
		// TODO Auto-generated method stub
		return 0;
	}

}
