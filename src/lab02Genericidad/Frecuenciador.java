package lab02Genericidad;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Frecuenciador {
	public static <T> Cuenta<T> busqueda(List<Cuenta<T>> l, T e) {
		for( Cuenta<T> c : l ) {
			if( c.getElem().equals(e) ) {
				return c;
				}
			}
		return null;
		}


public static <T> List<Cuenta<T>> recuento(List<T> lis) {
	List<Cuenta<T>> res = new ArrayList();
	for( T elem : lis ) {
		Cuenta<T> c = busqueda( res, elem );
		if( c == null ) {
			res.add( new Cuenta(elem) );
			}
		else {
			c.incr();
			}
		}
	return res;
	}
}
