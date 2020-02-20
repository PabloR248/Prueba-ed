
public class Serie extends Entregable {

	private String titulo;
	private int numeroTemps;
	private boolean entregado;
	private String genero;
	private String creador;
	
	public Serie() {
		
		this.numeroTemps=3;
		this.entregado=false;
		
	}
	
	
	public Serie(String titulo,String creador) {
		this.titulo=titulo;
		this.creador=creador;
		this.numeroTemps=3;
		this.entregado=false;
		
	}
	public Serie(String titulo, String genero,String creador,int numeroTemps) {
		this.titulo=titulo;
		this.numeroTemps=numeroTemps;
		this.genero=genero;
		this.creador=creador;
		this.entregado=false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroTemps() {
		return numeroTemps;
	}

	public void setNumeroTemps(int numeroTemps) {
		this.numeroTemps = numeroTemps;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	@Override
	public String toString() {
		return "La serie " + getTitulo() + " tiene " + getNumeroTemps() + " temporadas,es de género "+ getGenero()+
				", y su creador es " + getCreador() + ".Entregado=" + entregado;
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
