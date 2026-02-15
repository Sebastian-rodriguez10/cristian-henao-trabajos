import javax.swing.JOptionPane;

public class ejemplo2 {

    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tamaño del array"));
        int[] a = new int[tamaño];
        int[] b = new int[tamaño];
        int[] c = new int[tamaño];
        int[] d = new int[tamaño];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del array a "));
            System.out.print(a[i] + "|");

        }
        System.out.println();
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del array b"));
            System.out.print(b[i] + "|");

        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            c[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero del array c"));
            System.out.print(c[i] + "|");

        }
        System.out.println();
        for (int i = 0; i < c.length; i++) {
            d[i] = a[i] + b[i] + c[i];
            System.out.print(d[i] + "|");

        }
    }
}
