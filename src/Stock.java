import java.util.HashMap;

import org.omg.CORBA.portable.ValueBase;

public class Stock  {

	static HashMap<Producto,Integer> productos = new HashMap<Producto,Integer>();
	
	
	public void añadirStock(Producto p, int stock) {
		productos.put(p,stock);
	}
	
	public void aumentarStock(int idprod, int num) {
		
		if(productos.containsValue(idprod)) {
		}
	}
	
	public void eliminarProducto(int idProd){
		if (productos.containsKey(idProd)) {
			
		}
	}
	
	public static void mostrarStock() {
		for (Producto numero: productos.keySet()){
			String key = productos.toString();
			String value = productos.get(numero).toString();
			System.out.println(key + " " + value);
			}
	}
	
	public static void main(String[] args) {
		Stock s1 = new Stock();
		Producto p = new  Producto(1, "televisión", 2000, "LG de 50 pulgadas");
		s1.añadirStock(p, 12);
		s1.mostrarStock();

	}

}
