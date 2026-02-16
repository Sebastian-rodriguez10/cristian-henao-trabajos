import java.util.HashMap;

import javax.swing.JOptionPane;

public class Ejemplo3 {
    public static void main(String[] args) {

        HashMap<String, String> usuarios = new HashMap<>();
        int continuar;
        do {
        String usuario = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        String contraseña = JOptionPane.showInputDialog("Ingrese la contraseña:");

        usuarios.put(usuario, contraseña);

        continuar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese 1 para agregar otro usuario  /   Ingrese 2 para salir"));
        
        } while (continuar == 1);
        String buscar = JOptionPane.showInputDialog("Ingrese el usuario a buscar:");

        if (usuarios.containsKey(buscar)) {
            JOptionPane.showMessageDialog(null, "Contraseña: " + usuarios.get(buscar));
        } else {
            JOptionPane.showMessageDialog(null, "Usuario no encontrado.");
        }  

        for (String usuario : usuarios.keySet()) {
            System.out.println("usuario: " + usuario + "   contraseña: " + usuarios.get(usuario));
        }
    }
}
