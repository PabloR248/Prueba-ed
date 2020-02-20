
public abstract class h extends Entregable {

	protected String titulo;
	protected int horasEstimadas;
	protected boolean entregado;
	protected String genero;
	protected String compañia;

	public h() {
		super();
	}

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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCompañia() {
		return compañia;
	}

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