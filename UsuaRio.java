import java.time.LocalDate;

public class UsuaRio {
    private String nombre;
    private String apellido;
    private String id;
    private String genero;

    public UsuaRio(String nombre, String apellido, String id, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.genero = genero;
    }

    UsuaRio(String nombre, String apellido, String id, String genero, double peso, double altura, LocalDate fechaRegistro) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarResultado() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrarResultado'");
    }

   
}