import java.util.Hashtable;

public class Ejemplo2 {
    public static void main(String[] args) {

        Hashtable<Integer, Double> notas = new Hashtable<>();

        notas.put(101, 4.5);
        notas.put(102, 3.8);
        notas.put(103, 4.2);

        for (Integer codigo : notas.keySet()) {
            System.out.println("Código: " + codigo + "\n" + "Nota: " + notas.get(codigo));
            System.out.println();
        }
    }
}
