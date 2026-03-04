import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class VentanaPromedio extends JFrame implements ActionListener{

	
	JLabel etiTitulo;
	JLabel etiNombre;
	JLabel etiMateria;
	JLabel etiDocumento;
	JLabel etiN1, etiN2, etiN3;
	JLabel etiResultado;
	JLabel etiRes;
	
	JTextField txtNombre;
	JTextField txtMateria;
	JTextField txtDocumento;
	JTextField txtN1,txtN2,txtN3;
	
	JButton btnCalcular;
	JButton btnLimpiar;
	JButton btnConsultaIndividual;
	JButton btnLista;
	JScrollPane scrollPane;
	JTextArea textArea;
	
	private Estudiante miEst;
	Procesos miProceso;
	ModeloDatos datos;
	
	public VentanaPromedio() {
		miProceso=new Procesos();
		datos = new ModeloDatos();
		
		setTitle("Ventana Promedio");
		setSize(900,700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		iniciarComponentes();
	}

	private void iniciarComponentes() {
		setLayout(null);
		
		etiTitulo=new JLabel();
		etiTitulo.setText("CALCULO DEL PROMEDIO");
		etiTitulo.setBounds(250, 10, 350, 90);
		etiTitulo.setFont(new Font("SansSerif", Font.PLAIN, 25));
		
		etiNombre=new JLabel();
		etiNombre.setText("Nombre: ");
		etiNombre.setBounds(50, 70, 120, 90);
		
		txtNombre=new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(130, 95, 520, 40);
		
		etiMateria=new JLabel();
		etiMateria.setText("Materia: ");
		etiMateria.setBounds(50, 120, 120, 90);
		
		txtMateria=new JTextField();
		txtMateria.setText("");
		txtMateria.setBounds(130, 155, 220, 40);
		
		etiDocumento=new JLabel();
		etiDocumento.setText("Documento: ");
		etiDocumento.setBounds(380, 130, 120, 90);
		
		txtDocumento=new JTextField();
		txtDocumento.setText("");
		txtDocumento.setBounds(480, 155, 170, 40);
	
		
		etiN1=new JLabel();
		etiN1.setText("Nota1: ");
		etiN1.setBounds(50, 190, 120, 90);
		
		txtN1=new JTextField();
		txtN1.setText("");
		txtN1.setBounds(40, 250, 100, 40);
		
		etiN2=new JLabel();
		etiN2.setText("Nota2: ");
		etiN2.setBounds(180, 190, 120, 90);
		
		txtN2=new JTextField();
		txtN2.setText("");
		txtN2.setBounds(170, 250, 100, 40);
		
		etiN3=new JLabel();
		etiN3.setText("Nota3: ");
		etiN3.setBounds(300, 190, 120, 90);
		
		txtN3=new JTextField();
		txtN3.setText("");
		txtN3.setBounds(290, 250, 100, 40);
		
		etiResultado=new JLabel();
		etiResultado.setText("Resultado: ");
		etiResultado.setBounds(50, 320, 150, 90);
		etiResultado.setFont(new Font("SansSerif", Font.PLAIN, 20));
		
		
		etiRes=new JLabel();
		etiRes.setText("GANA LA MATERIA ");
		etiRes.setBounds(170, 320, 350, 90);
		etiRes.setFont(new Font("SansSerif", Font.PLAIN, 20));

		
		btnCalcular=new JButton();
		btnCalcular.setText("Calcular");
		btnCalcular.setBounds(650,550,90,40);
		btnCalcular.addActionListener(this);
		
		btnLimpiar=new JButton();
		btnLimpiar.setText("Limpiar");
		btnLimpiar.setBounds(550,550,90,40);
		btnLimpiar.addActionListener(this);
		
		btnConsultaIndividual = new JButton("Consultar");
		btnConsultaIndividual.setBounds(300,550, 90, 40);
		btnConsultaIndividual.addActionListener(this);
		
		btnLista = new JButton("lista");
		btnLista.setBounds(150, 550, 90, 40);
		btnLista.addActionListener(this);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(30, 319, 586, 206);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		add(etiTitulo);
		add(etiNombre);
		add(txtNombre);
		add(etiMateria);
		add(etiDocumento);
		add(txtMateria);
		add(txtDocumento);
		add(etiN1);
		add(txtN1);
		add(etiN2);
		add(txtN2);
		add(etiN3);
		add(txtN3);
		add(etiResultado);
		add(etiRes);
		add(btnCalcular);
		add(btnLimpiar);
		add(btnConsultaIndividual);
		add(btnLista);
		add(scrollPane);
	}

	

	private void calcular() {
		
		String n1=txtN1.getText();
		String n2=txtN2.getText();
		String n3=txtN3.getText();
		
		System.out.println("Presiona Calcular");
		
		miEst=new Estudiante();
		miEst.setDocumento(txtDocumento.getText());
		miEst.setNombre(txtNombre.getText());
		miEst.setMateria(txtMateria.getText());
		miEst.setMateria(txtN1.getText());
		miEst.setMateria(txtN2.getText());
		miEst.setMateria(txtN3.getText());
		
		datos.registrarEstudiante(miEst);
		
		///if(miProceso.validarNota(n1,n2,n3)) {
		
		boolean validaN1=validaCampo(n1, txtN1);
		boolean validaN2=validaCampo(n2, txtN2);
		boolean validaN3=validaCampo(n3, txtN3);

		if (validaN1==true && validaN2==true && validaN3==true) {
			
			miEst.setNota1(Double.parseDouble(txtN1.getText()));
			miEst.setNota2(Double.parseDouble(txtN2.getText()));
			miEst.setNota3(Double.parseDouble(txtN3.getText()));
			etiRes.setText(miEst.getNombre());
			reiniciarColores();
			
			
			
			
			double prom=miProceso.calcularPromedio(miEst.getNota1(), miEst.getNota2(), miEst.getNota3());
			
			miEst.setPromedio(prom);

			promedioResultado(prom);
			
		}else {
			JOptionPane.showMessageDialog(null, "Valide los campos solo numeros de 1 a 5", "ERROR", JOptionPane.WARNING_MESSAGE); 
		}

		
		
		System.out.println(miEst);
		System.out.println("Nombre: "+miEst.getNombre());
		
	
		
	}
	public double promedioResultado (double prom) {
		if (prom > 3.5) {
			etiRes.setText("Gano la materia con: " + prom);
			etiRes.setForeground(Color.GREEN);
		}else if (prom > 2.5) {
			etiRes.setText("Tiene que recuperar saco: " + prom);
			etiRes.setForeground(Color.YELLOW);
		}else {
			etiRes.setText("Perdio la materia con: " + prom);
			etiRes.setForeground(Color.RED);
		}
		return prom;
	}
	private boolean validaCampo(String n, JTextField txtNota) {
		boolean valida;
		
		if(miProceso.validarNota(n)) {
			valida=true;
			txtNota.setBackground(Color.white);
		}else {
			System.out.println("Presente mensaje error para nota "+n);
			txtNota.setBackground(Color.red);
			valida=false;
		}
		return valida;
	}

	private void reiniciarColores() {
		txtN1.setBackground(Color.white);
		txtN2.setBackground(Color.white);
		txtN3.setBackground(Color.white);
	}

	private void limpiar() {
		System.out.println("Presiona Limpiar");
		txtNombre.setText("");
		txtMateria.setText("");
		txtDocumento.setText("");
		txtN1.setText("");
		txtN2.setText("");
		txtN3.setText("");
		etiRes.setText("");
	}
	public void consultarLista() {
		String listaconsultada = datos.imprimirListaEstudiantes();
		textArea.setText(listaconsultada);
	}
	public void consultaIndividual () {
		String id = JOptionPane.showInputDialog("Ingrese el id del estudiante que va a buscar: ");
		Estudiante estEncontrado = datos.consultaEstudiante(id);
		
		if (estEncontrado != null) {
			txtNombre.setText(estEncontrado.getNombre());
			txtMateria.setText(estEncontrado.getMateria());
			txtDocumento.setText(estEncontrado.getDocumento());
			txtN1.setText(estEncontrado.getNota1() + "");
			txtN2.setText(estEncontrado.getNota2() + "");
			txtN3.setText(estEncontrado.getNota3() + "");
			promedioResultado(estEncontrado.getPromedio());
		}else {
			JOptionPane.showMessageDialog(null, "No se encontro el usuario", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE); 
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnCalcular) {
			calcular();
		}
		else if(e.getSource()==btnLimpiar) {
			limpiar();
		}else if (e.getSource() == btnConsultaIndividual) {
			consultaIndividual();
		}else if (e.getSource() == btnLista) {
			VentanaEmergente emergente = new VentanaEmergente(datos);	
			emergente.setVisible(true);
		}
	}
}