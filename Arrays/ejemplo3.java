import java.util.Scanner;

public class ejemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edad = new int[3];
        for(int i=0; i<3; i++){
            System.out.println("ingrese la edad de la persona: ");
            edad[i] = scanner.nextInt();
         
        }
        for (int i : edad) {
            System.out.println("La edad es: " + i);
               if (i >= 18) {
                System.out.println("la persona es mayor de edad");
                System.out.println();
            }else{
                System.out.println("la persona es menor de edad");
                System.out.println();
            }
        }
    }
}
