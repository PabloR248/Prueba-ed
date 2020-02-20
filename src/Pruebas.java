import java.util.HashMap;
import java.util.Scanner;

public class Pruebas {
	
	static HashMap<Producto,Integer> productos = new HashMap<Producto,Integer>();
	public static void main(String[] args) {
		System.out.println("Elija entre las siguientes opciones:\n1. Añadir un producto con su stock\n2. Aumentar stock de un producto\n"
				+"3. Eliminar producto\n4. Mostrar productos y stock");
		Scanner sc= new Scanner(System.in);
		int option=sc.nextInt();
		
		switch(option) {
		case 1: System.out.println("Seleccione un producto insertando su nombre");
		String nombre=sc.nextLine();
		
		System.out.println("Seleccione su stock");
		int stock=sc.nextInt();
		break;
		case 2: System.out.println("Seleccione un producto insertando su id");
		int idproducto2=sc.nextInt();
		System.out.println("Seleccione caunto quiere aumentar su stock");
		int stock2=sc.nextInt();
		case 3: System.out.println("Elimine un producto insertando su id");
		int idEliminar=sc.nextInt();
		case 4: Stock.mostrarStock();
			}
		
		
		
		
		}
	}

