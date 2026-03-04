import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaEmergente extends JDialog implements ActionListener {

    ModeloDatos datos;
    JScrollPane scrollPane;
    JTextArea textArea;
    JButton btnEditar, btnEliminar;
    

    public VentanaEmergente(ModeloDatos datos) {
        this.datos = datos;

        setLayout(null);
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);

        iniciar();
        consultarLista();
    }

    public void iniciar () {

        JLabel tituloLista = new JLabel("Lista de estudiantes");
        tituloLista.setHorizontalAlignment(SwingConstants.CENTER);
        tituloLista.setFont(new Font("Tahoma", Font.PLAIN, 20));
        tituloLista.setBounds(200, 20, 350, 30);
        add(tituloLista);

        textArea = new JTextArea();
        textArea.setEditable(false);

        scrollPane = new JScrollPane(textArea);
        scrollPane.setBounds(100, 80, 600, 250);
        add(scrollPane);

        btnEditar = new JButton("Editar");
        btnEditar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnEditar.setBounds(150, 400, 200, 50);
        btnEditar.addActionListener(this);
        add(btnEditar);

        btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnEliminar.setBounds(450, 400, 200, 50);
        btnEliminar.addActionListener(this);
        add(btnEliminar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == btnEliminar) {
            datos.eliminar();
            consultarLista();
        }

        if(e.getSource() == btnEditar) {
            String documento = JOptionPane.showInputDialog("Ingrese el documento del estudiante a editar:");
            datos.actualizarEstudiante(documento);
            consultarLista();
        }
    }

    public void consultarLista() {
        String lista = datos.imprimirListaEstudiantes();
        textArea.setText(lista);
    }
}