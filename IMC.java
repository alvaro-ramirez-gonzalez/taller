import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class IMC {
    public static void main(String[] args) {
        List<UsuaRio> usuarios = new ArrayList<>();

            String nombre = JOptionPane.showInputDialog("Dijite el  nombre:");
            String apellido = JOptionPane.showInputDialog("Dijite  el  apellido:");
            String id = JOptionPane.showInputDialog("Introduce el ID:");
            var genero = JOptionPane.showInputDialog("Escriba su genero");

            double peso = 0;
            boolean pesoValido = false;
            while (!pesoValido) {
                try {
                    String pesoStr = JOptionPane.showInputDialog("Introduce su peso:");
                    peso = Double.parseDouble(pesoStr);
                    pesoValido = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Peso inválido. Introduce un número válido.");
                }
            }

            
            double altura = 0;
            boolean alturaValida = false;
            while (!alturaValida) {
                try {
                    String alturaStr = JOptionPane.showInputDialog("Introduce tu altura en metros:");
                    altura = Double.parseDouble(alturaStr);
                    if (altura <= 0) {
                        JOptionPane.showMessageDialog(null, "La altura debe ser mayor que cero.");
                    } else {
                        alturaValida = true;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Altura inválida. Introduce un número válido.");
                }
            }
            LocalDate fechaRegistro = LocalDate.now();

            
           UsuaRio usuario = new UsuaRio(nombre, apellido, id, genero, peso, altura, fechaRegistro);
            usuarios.add(usuario);

            
            usuario.mostrarResultado();

           
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres registrar otro usuario?", "Confirmar", JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.NO_OPTION) {
                boolean continuar = false;
            }
        }
    }

