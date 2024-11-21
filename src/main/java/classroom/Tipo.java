package classroom;

public enum Tipo {
	// Falta el string del enum, ponemos sin nombre por defecto
	DISCIPLINAR(10, "Sin nombre"),FUNDAMENTACION(20, "Sin nombre"),ELECTIVA(30, "Sin nombre");
	
	private int codigo;
	private String nombre;

	// public Tipo, un constructor no puede contener el modificador public.f
	Tipo(int codigo,String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}
}
