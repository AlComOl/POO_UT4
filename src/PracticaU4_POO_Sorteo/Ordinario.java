package PracticaU4_POO_Sorteo;

public class Ordinario extends Sorteo {

//	Atributos
	
	private int reintegro2;//número del segundo reintegro
	private int reintegro3;//numero del tercer reintegro
	
	
//	constructores
	
	public Ordinario() {
		
	}
	
	public Ordinario(int r2,int r3) {
		this.reintegro2=r2;
		this.reintegro3=r3;
	}
	
	public int getReintegro2() {
		return reintegro2;
	}
	
	public void setReintegro2(int r2) {
		this.reintegro2=r2;
	}
	
	public int getReintegro3() {
		return reintegro2;
	}
	
	public void getReintegro3 (int r3) {
		this.reintegro3=r3;
	}
	
	@Override
	public int getLimite() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getTipo() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int reintegroPP() {
		// TODO Auto-generated method stub
		return 0;
	}
}
