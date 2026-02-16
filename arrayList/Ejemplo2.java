import java.util.ArrayList;

public class Ejemplo2 {
     public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        System.out.println("Números: " + numeros);

        numeros.add(40);
        numeros.add(50);

        System.out.println("Después de agregar más: " + numeros);
        System.out.println("Cantidad de elementos: " + numeros.size());
    }
}

