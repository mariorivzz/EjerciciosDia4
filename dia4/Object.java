package dia4;

public class Object {
	
	//Atributos.
	private String nombre;
	private int id;
	
	//Constructores, primero con par�metros luego sin ellos.
	public Object(String nombre, int id) {
		this.nombre = nombre;
		this.id = id;
	}
	
	public Object() {}

	//Getters y Setters .
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//M�todo toString para mostar los datos.
	@Override
	public String toString() {
		return "Object [nombre=" + nombre + ", id=" + id + "]";
	}
	
	
	

}
