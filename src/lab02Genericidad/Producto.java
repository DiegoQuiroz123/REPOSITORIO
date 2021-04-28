package lab02Genericidad;

public class Producto implements Comparable<Producto> {
	private String nombre;
	private double precio;
	private int cantidad;
	
	
	
	
	public Producto(String nombre, double precio, int cantidad) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", cantidad=" + cantidad + ", precio=" + precio + "]";
	}
	public boolean equals(Object o) {
		if( o instanceof Producto) {
			Producto p= (Producto )o;
			return this.precio==p.getPrecio();
		}
		return false;
	}
	public int compareTo(Producto p) {
		return this.getCantidad()-p.getCantidad();
	}
	

}
