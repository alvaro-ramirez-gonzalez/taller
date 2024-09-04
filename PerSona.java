import java.time.LocalDate;

public class PerSona extends UsuaRio {
    private double peso;
    private double altura;
    private LocalDate fechaRegistro;

    public PerSona(String nombre, String apellido, String id, String genero, double peso, double altura, LocalDate fechaRegistro) {
        super(nombre, apellido, id, genero);
        this.peso = peso;
        this.altura = altura;
        this.fechaRegistro = fechaRegistro;
    }
    
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public LocalDate getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(LocalDate fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public double calcularIMC() {
        if (altura <= 0) {
            throw new IllegalArgumentException("La altura debe ser mayor que cero.");
        }
        return peso / (altura * altura);
    }

    public String clasificarIMC(double imc) {
        if (imc < 16) {
            return "Delgadez severa";
        } else if (imc < 16.9) {
            return "Delgadez moderada";
        } else if (imc < 18.4) {
            return "Delgadez leve";
        } else if (imc < 24.9) {
            return "Normal";
        } else if (imc < 29.9) {
            return "Sobrepeso";
        } else if (imc < 34.9) {
            return "Obesidad leve";
        } else if (imc < 39.9) {
            return "Obesidad moderada";
        } else {
            return "Obesidad mórbida";
        }
    }
    public void mostrarResultado() {
        double imc = calcularIMC();
        String clasificacion = clasificarIMC(imc);
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Género: " + getGenero());
        System.out.println("Fecha de Registro: " + fechaRegistro);
        System.out.println("IMC: " + String.format("%.2f", imc));
        System.out.println("Clasificación: " + clasificacion);
        System.out.println();  // Línea en blanco para separar los registros
    }
  
}
