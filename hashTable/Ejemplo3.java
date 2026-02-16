import java.util.Hashtable;

import javax.swing.JOptionPane;

public class Ejemplo3 {
   public static void main(String[] args) {

        Hashtable<String, Double> estudiantes = new Hashtable<>();
        int opcion;

        do {
            String nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante:");
            double nota = Double.parseDouble(
            JOptionPane.showInputDialog("Ingrese la nota del estudiante:")
            );

            estudiantes.put(nombre, nota);

            opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese 1 para continuar  /   ingrese 2 para salir  "));

        } while (opcion == 1);


        for (String nombre : estudiantes.keySet()) {
            System.out.println(nombre + ": " + estudiantes.get(nombre));
        }
    }
}
