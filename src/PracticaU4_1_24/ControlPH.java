package PracticaU4_1_24;

public final class ControlPH extends ControlInstalacion{
	
	private float minpH;
	private float maxpH;
//	protected float dato;
	protected String nombre;
	
	public ControlPH(float minpH,float maxpH,String nombre,float dato) {
		super(nombre, dato);
		
	}

	@Override
	public void procesarValor() {
		// TODO Auto-generated method stub
		
	}

	public float getMinpH() {
		return minpH;
	}

	public void setMinpH(float minpH) {
		this.minpH = minpH;
	}
	public float getMaxpH() {
		return maxpH;
	}

	public void setMaxpH(float maxpH) {
		this.maxpH = maxpH;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public void setLectura(float a) {
		dato=a;
		
	}

	@Override
	public float getLectura() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
