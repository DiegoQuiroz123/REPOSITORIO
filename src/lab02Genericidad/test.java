package lab02Genericidad;

public class test {
	public static void main( String args[] ){
		String[] v = {”Perez”,”Sanchez”,”Rodriguez”};
		Integer[] w = {12,34,56};
		System.out.println(existe(v,”Sanchez”));
		System.out.println(existe(w,34));
		System.out.println(existe(w,”Salas”));
		
		Producto []p = {new Producto("p1",34.5,300),new Producto("p2",50,400),new Producto("p3",24.5,500)};
		

	
}

public static <T> boolean existe(T[] vec,T x) {
	for(T e : vec) {
		if(e.equals(x))
			return true;
		}
	return false;
	}

public static <T extends Comparable<T>> T menor(T[] vec) {
	T men= vec[0];
	for (T e : vec) {
		if(e.compareTo(men) <  0)
			men = e;
	}
	return men;
}
}
