package lab02Genericidad;

public class Cuenta<T> implements Comparable<Cuenta<T>> {
	private T elem;
	private int frec;
	public Cuenta(T elem) 
	{
		this.elem = elem;
		this.frec = 1;
		}
	public T getElem() { return this.elem; }
	public int getFrec () { return this.frec; }
	public void incr() { this.frec++; }
	
	/*public int compareTo(Cuenta o) {
		if( o.getFrec() == this.frec ) { return 0;}
		else if( o.getFrec () > this.frec ) { return 1; }
		else { return -1; }
		}
	*/
	
	public int compareTo( Cuenta<T> o) 
	{
		return this.frec- o.getFrec();	
		}
	
	} 