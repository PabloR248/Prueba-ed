
public class Videojuego extends Entregable implements inter {

	public Videojuego() {

		this.horasEstimadas = 10;
		this.entregado = false;
	}

	public Videojuego(String titulo, int horasEstimadas) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.entregado = false;
	}

	public Videojuego(String titulo, int horasEstimadas, String genero, String compa�ia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compa�ia = compa�ia;
		this.entregado = false;
	}
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compa�ia;

	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getHorasEstimadas() {
		return horasEstimadas;
	}

	public void setHorasEstimadas(int horasEstimadas) {
		this.horasEstimadas = horasEstimadas;
	}

	@Override
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompa�ia() {
		return compa�ia;
	}

	@Override
	public void setCompa�ia(String compa�ia) {
		this.compa�ia = compa�ia;
	}

	@Override
	public String toString() {
		return "El videojuego " + getTitulo() + " tiene " + getHorasEstimadas()
				+ " horas estimadas de juego, es de g�nero " + getGenero() + " y lo ha creado la c" + "compa��a"
				+ getCompa�ia() + ".Entregado" + entregado;
	}

	@Override
	public void entregar(boolean entregado) {
	
		super.entregar(entregado);
	}

	@Override
	public void devolver(boolean entregado) {
		// TODO Auto-generated method stub
		super.devolver(entregado);
	}

	@Override
	public boolean isEntregado(boolean entregado) {
		// TODO Auto-generated method stub
		return super.isEntregado(entregado);
	}

}
