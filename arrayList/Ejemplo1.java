import java.util.ArrayList;

public class Ejemplo1 {
    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Carlos");

        System.out.println("Lista inicial: " + nombres);

        nombres.add("Ana");

        System.out.println("Se agrego a Ana: " + nombres);

        nombres.remove("Maria");

        System.out.println("se elimino a maria: " + nombres);
    }
}

