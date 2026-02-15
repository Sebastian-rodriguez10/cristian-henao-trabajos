import java.lang.reflect.Array;
import java.util.Scanner;

public class ejemplo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] nombres = new String[3];
        for(int i=0; i < nombres.length; i++){
            System.out.println("ingrese un nombre: ");
            nombres[i] = scanner.next();
        }
        for(int i=0; i < nombres.length; i++){
            System.out.println("Nombre: " + nombres[i]);
        }
        
        
    }
}
