import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.EventListener;

import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class Iu extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Datos datos;
	Logica logica;
	Operario operario;
	private JTextField inputSueldo;
	private JTextField inputAñosAntiguedad;
	private JTextField inputDocumento;
	private JTextField inputNombre;
	private JButton botonCalcular, botonLimpiar;
	private JLabel textoResultado;
	private JLabel textoPorcentaje;
	private JButton btnLista;
	private JButton btnBuscarOperario;
	public Iu() {
		datos = new Datos();
		logica = new Logica();
		setBounds(100, 100, 871, 448);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		initialize();
	}

	private void initialize() {		
		JLabel titulo = new JLabel("Calculo de Aumento Salarial ");
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setFont(new Font("Tahoma", Font.PLAIN, 20));
		titulo.setBounds(165, 22, 517, 38);
		getContentPane().add(titulo);
		
		JLabel tituloNombre = new JLabel("Nombre:");
		tituloNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloNombre.setBounds(50, 133, 155, 38);
		getContentPane().add(tituloNombre);
		
		JLabel tituloAños = new JLabel("Años de antiguedad:");
		tituloAños.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloAños.setBounds(50, 181, 192, 38);
		getContentPane().add(tituloAños);
		
		inputSueldo = new JTextField();
		inputSueldo.setBounds(231, 236, 249, 32);
		getContentPane().add(inputSueldo);
		inputSueldo.setColumns(10);
		
		inputAñosAntiguedad = new JTextField();
		inputAñosAntiguedad.setColumns(10);
		inputAñosAntiguedad.setBounds(231, 188, 249, 32);
		getContentPane().add(inputAñosAntiguedad);
		
		JLabel tituloSueldo_1 = new JLabel("Ingrese el Sueldo:");
		tituloSueldo_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloSueldo_1.setBounds(50, 229, 155, 38);
		getContentPane().add(tituloSueldo_1);
		
		JLabel tituloDocumento = new JLabel("Documento:");
		tituloDocumento.setFont(new Font("Tahoma", Font.PLAIN, 18));
		tituloDocumento.setBounds(50, 85, 155, 38);
		getContentPane().add(tituloDocumento);
		
		inputDocumento = new JTextField();
		inputDocumento.setColumns(10);
		inputDocumento.setBounds(231, 92, 249, 32);
		getContentPane().add(inputDocumento);
		
		inputNombre = new JTextField();
		inputNombre.setColumns(10);
		inputNombre.setBounds(231, 140, 249, 32);
		getContentPane().add(inputNombre);
		
		JLabel lblNewLabel = new JLabel("Nuevo sueldo");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD, 18));
		lblNewLabel.setBounds(502, 113, 345, 32);
		getContentPane().add(lblNewLabel);
		
		textoResultado = new JLabel("");
		textoResultado.setHorizontalAlignment(SwingConstants.CENTER);
		textoResultado.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textoResultado.setBounds(502, 155, 345, 32);
		getContentPane().add(textoResultado);
		
		textoPorcentaje = new JLabel("");
		textoPorcentaje.setFont(new Font("Tahoma", Font.BOLD, 20));
		textoPorcentaje.setHorizontalAlignment(SwingConstants.CENTER);
		textoPorcentaje.setBounds(502, 204, 345, 64);
		getContentPane().add(textoPorcentaje);
		
		botonCalcular = new JButton("Agregar");
		botonCalcular.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		botonCalcular.setBounds(421, 292, 163, 38);
		getContentPane().add(botonCalcular);
		botonCalcular.addActionListener(this);
		
		botonLimpiar = new JButton("Limpiar");
		botonLimpiar.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		botonLimpiar.setBounds(50, 292, 163, 38);
		getContentPane().add(botonLimpiar);
		botonLimpiar.addActionListener(this);
		
		btnLista = new JButton("Lista");
		btnLista.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		btnLista.setBounds(231, 292, 163, 38);
		getContentPane().add(btnLista);
		
		btnBuscarOperario = new JButton("Buscar Operario");
		btnBuscarOperario.setFont(new Font("Yu Gothic UI Light", Font.PLAIN, 19));
		btnBuscarOperario.setBounds(605, 292, 163, 38);
		getContentPane().add(btnBuscarOperario);
		btnLista.addActionListener(this);
		
	}
	
	private void calcular() {
		System.out.println("calculo");
		
		operario = new Operario();
		operario.setDocumento(inputDocumento.getText());
		operario.setNombre(inputNombre.getText());
		operario.setSueldo(Double.parseDouble(inputSueldo.getText()));
		operario.setAños(Integer.parseInt(inputAñosAntiguedad.getText()));
		
		String respuesta = datos.agregar(operario.getDocumento(), operario);
		if (respuesta.equalsIgnoreCase("Si")) {
			JOptionPane.showMessageDialog(null, "Registrado exitosamente");
		}else {
			JOptionPane.showMessageDialog(null, "No se pudo registrar, usuario ya existente");
		}
		logica.porcentajes(operario);
		
		porcentajesColor(operario);
		textoResultado.setText(operario.getSueldoActualizada() + "");
		textoPorcentaje.setText("Aumento " + operario.getDescuento()+"%"+" su sueldo");
		System.out.println(operario);
		
	}
	private void limpiar() {
		inputDocumento.setText("");
		inputNombre.setText("");
		inputSueldo.setText("");
		inputAñosAntiguedad.setText("");
		textoResultado.setText("");
		textoPorcentaje.setText("");
	}
	
	public void porcentajesColor (Operario ope) {
		
		if (ope.getSueldo()<500 && ope.getAños() >= 10) {
			textoPorcentaje.setForeground(Color.green);
		}else if (ope.getSueldo()<500 && ope.getAños()<10) {
			textoPorcentaje.setForeground(Color.green);
		}else if (ope.getSueldo() >=500 ) {
			textoPorcentaje.setForeground(Color.red);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botonCalcular) {
			calcular();
		}else if (e.getSource() == botonLimpiar) {
			limpiar();
		}else if (e.getSource() == btnLista) {
			datos.imprimirLista();
		}else if (e.getSource() == btnBuscarOperario) {
			consultar();
		}
	}

	private void consultar() {
		
	}
}
