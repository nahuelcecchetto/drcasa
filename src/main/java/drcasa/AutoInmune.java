package drcasa;

public class AutoInmune implements Enfermedad {
	
	private int cantidadVecesQueAfecto = 0;
	
	public boolean esAgresiva () {
		return cantidadVecesQueAfecto > 30;
	}

	public void pasarUnDia() {
		cantidadVecesQueAfecto = cantidadVecesQueAfecto +1;
	}
}
