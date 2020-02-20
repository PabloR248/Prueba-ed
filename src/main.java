import java.util.ArrayList;
import java.util.Iterator;



public class main {

	
	
	
	public static void main (String []args) {
		ArrayList<Serie> series = new ArrayList<Serie>(5);
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>(5);
		Videojuego v1=new Videojuego("Minecraft", 5);
		Videojuego v2=new Videojuego("LoL", 10);
		Videojuego v3=new Videojuego("Metal Gear", 13);
		Videojuego v4=new Videojuego("COD", 11, "acción","Microsoft");
		Videojuego v5=new Videojuego("FIFA", 4, "Simulación","EA");
		Serie s1=new Serie("Simpsons", "Matt Groening");
		Serie s2=new Serie("Family", "Paco Peña");
		Serie s3=new Serie("Monstruos", "Adolfo Pérez");
		Serie s4=new Serie("Scary serie", "Miedo", "Alan Poe", 3);
		Serie s5=new Serie("Peaky Blinders", "Acción", "Juan Lebrón", 7);
	videojuegos.add(0,v1);
	videojuegos.add(1,v2);
	videojuegos.add(2,v3);
	videojuegos.add(3,v4);
	videojuegos.add(4,v5);
	series.add(0,s1);
	series.add(1,s2);
	series.add(2,s3);
	series.add(3,s4);
	series.add(4,s5);
	
	v1.entregar(false);
	v3.entregar(false);
	s2.entregar(false);
	s4.entregar(false);
	
	int videojuegosEntregados=0;
	int seriesEntregadas=0;
	
	
	
	}
}
