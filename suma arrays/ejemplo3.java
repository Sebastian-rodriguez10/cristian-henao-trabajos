import javax.swing.JOptionPane;

public class ejemplo3 {
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos nombres va a poner"));
        String[] nombre = new String[tamaño];
        String[] apellido = new String[tamaño];
        String[] nombreApellido = new String[tamaño];

        for (int i = 0; i < nombre.length; i++) {
            nombre[i] = JOptionPane.showInputDialog("ingrese el nombre de la persona en el indice " + i);
            System.out.print(nombre[i] + "|");

        }
        System.out.println();
        for (int i = 0; i < apellido.length; i++) {
            apellido[i] = (JOptionPane.showInputDialog("Ingrese el apellido de la persona en el indice " + i));
            System.out.print(apellido[i] + "|");

        }
        System.out.println();
        for (int i = 0; i < nombreApellido.length; i++) {
            nombreApellido[i] = nombre[i]+ " " + apellido[i];
            System.out.print(nombreApellido[i] + "|");

        }
    }
}
