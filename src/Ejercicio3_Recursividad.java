
public class Ejercicio3_Recursividad {

	public static void main(String[] args) {
		Ejercicio3_Recursividad ej3= new Ejercicio3_Recursividad();
		System.out.println(ej3.sep("hello"));
		System.out.println(ej3.sep("abc"));
		System.out.println(ej3.sep("ab"));
	}
	
	public String sep(String str) {
		if(str.length()<=1){
            return str;
        } else {
          
            return str.charAt(0)+"##"  +  sep(str.substring(1));
        }
	}
	
	

}
