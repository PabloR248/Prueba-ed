
public abstract class Entregable {

	public void entregar(boolean entregado) {
		entregado=true;
	}
	
	public void devolver(boolean entregado) {
		entregado=false;
	}
	
	public boolean isEntregado(boolean entregado) {
		return entregado;
	}
}
