import java.util.HashMap;

public class Ejemplo1 {
    public static void main(String[] args) {

        HashMap<String, String> paises = new HashMap<>();

        paises.put("CO", "Colombia");
        paises.put("MX", "México");

        System.out.println(paises.get("CO"));
    }
}
