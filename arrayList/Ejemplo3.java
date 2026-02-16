import java.util.ArrayList;

public class Ejemplo3 {
    public static void main(String[] args) {

        ArrayList<String> tareas = new ArrayList<>();

        tareas.add("Estudiar Java");
        tareas.add("Hacer ejercicio");
        tareas.add("Leer");

        System.out.println("Tareas: " + tareas);
        tareas.remove(1);

        System.out.println("Después de eliminar: " + tareas);

        tareas.add("Practicar programación");

        System.out.println("Lista final: " + tareas);
    }
}

