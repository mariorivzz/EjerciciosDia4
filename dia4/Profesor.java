package dia4;

public class Profesor implements Persona{
	
	private String nombre;
	private String asignaturas;

	public Profesor(String nombre, String asignaturas) {
		super();
		this.nombre = nombre;
		this.asignaturas = asignaturas;
	}
	
	public Profesor() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAsignaturas() {
		return asignaturas;
	}

	public void setAsignaturas(String asignaturas) {
		this.asignaturas = asignaturas;
	}

	@Override
	public void andar() {
		// TODO Auto-generated method stub
		
		System.out.println("El profesor está andando");
		
	}

	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
		System.out.println("El profesor está corriendo");
		
	}

	@Override
	public void programar() {
		// TODO Auto-generated method stub
		
		System.out.println("El profesor está programando");
		
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", asignaturas=" + asignaturas + "]";
	}

}
