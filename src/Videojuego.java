
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

	public Videojuego(String titulo, int horasEstimadas, String genero, String compañia) {
		this.titulo = titulo;
		this.horasEstimadas = horasEstimadas;
		this.genero = genero;
		this.compañia = compañia;
		this.entregado = false;
	}
	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;

	

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

	public String getCompañia() {
		return compañia;
	}

	@Override
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}

	@Override
	public String toString() {
		return "El videojuego " + getTitulo() + " tiene " + getHorasEstimadas()
				+ " horas estimadas de juego, es de género " + getGenero() + " y lo ha creado la c" + "compañía"
				+ getCompañia() + ".Entregado" + entregado;
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
