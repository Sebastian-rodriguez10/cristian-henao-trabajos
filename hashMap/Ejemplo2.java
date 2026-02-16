import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejemplo2 {
    public static void main(String[] args) {

        HashMap<String, String> usuarios = new HashMap<>();

        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");

        usuarios.put(usuario, contraseña);

        String buscar = JOptionPane.showInputDialog("Ingrese el usuario a buscar:");

        if (usuarios.containsKey(buscar)) {
            JOptionPane.showMessageDialog(null, "Contraseña: " + usuarios.get(buscar));
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }
    }
}
