package lab02Genericidad;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Principal {
	System.out.println("Introduzca texto: ");
	
	Scanner sc = new Scanner(System.in);
	
	List<Character> lisDatos = new ArrayList();
	
	String texto = sc.nextLine();
	for( i = 0; i < texto.lenght(); i++ ) {
		lisDatos.add( texto.charAt(i) );
		}
	List<Cuenta<Character>> lisPares = Frecuenciador.recuento(lisDatos);
	// Para usar sort debemos hacer que Cuenta implemente
	// la interfaz Comparable
	
	for( Cuenta<Character> c : lisPares ) {
		System.out.println( c.getFrec()+": "+c.getElem() );
	}

}
