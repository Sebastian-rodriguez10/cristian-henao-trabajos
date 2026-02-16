import java.util.Hashtable;

public class Ejemplo1 {
    public static void main(String[] args) {

        Hashtable<String, String> identificacion = new Hashtable<>();

        identificacion.put("Sebastian", "1092456521");
        identificacion.put("Dana", "1094878191");
        identificacion.put("Alejandra", "41950892");

        System.out.println("id de Dana: " + identificacion.get("Dana"));
    }
}
