package classroom;

public class Persona {

    public final long cedula;
    String nombre;
    static int totalPersonas;
    
    static {
        totalPersonas = 0;
        // eliminamos cedula de el static, es final, esto nos quitaba acceso.
    }

    // parece que siempre queremos tener acceso a cambiar la cedula dentro de un constructor
    public Persona(long cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }
    
    public Persona(String nombre, long cedula) {
        this.cedula = cedula;
        this.nombre = nombre;
        totalPersonas++;
    }

    public Persona(long cedula) {
        this.cedula = cedula;
        this.nombre = "";
        totalPersonas++;
    }

    // este recibia nombre pero no lo usaba
    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 1; // aca este dato faltaba
        totalPersonas++;
    }

    // faltaba un constructo
    public Persona() {
        this.nombre = "";
        this.cedula = 0; // tambien faltaba
        totalPersonas++;
    }

    public long getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
