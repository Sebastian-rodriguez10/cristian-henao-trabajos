import java.util.HashMap;

import javax.swing.JOptionPane;

public class ModeloDatos {
	
	HashMap<String, Estudiante> estudiantesMap;
	
	public ModeloDatos() {
		estudiantesMap=new HashMap<String, Estudiante>();
	}
	public String registrarEstudiante(Estudiante est) {
		if (!estudiantesMap.containsKey(est.getDocumento())) {
		estudiantesMap.put(est.getDocumento(), est);
		return "ok";
		}else {
		return "Estudiante existente";
	}
		
	}
	public Estudiante consultaEstudiante(String id) {
		Estudiante est = estudiantesMap.get(id);
		return est;
	}
	public String imprimirListaEstudiantes() {
		String msj = "Datos Estudiante\n";
		for (Estudiante estudiante : estudiantesMap.values()) {
			msj += estudiante + "\n";
		}
		return msj;
	}
	public void eliminar() {

	    String document = JOptionPane.showInputDialog("Ingrese el documento:");

	    if(document == null) return;

	    if(estudiantesMap.containsKey(document)) {
	        estudiantesMap.remove(document);
	        JOptionPane.showMessageDialog(null, "Estudiante eliminado correctamente");
	    } else {
	        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
	    }
	}
	public void actualizarEstudiante(String documento) {

	    if(documento == null) return;

	    Estudiante estudiante = estudiantesMap.get(documento);

	    if(estudiante == null) {
	        JOptionPane.showMessageDialog(null, "Estudiante no encontrado");
	        return;
	    }

	    estudiante.setNombre(JOptionPane.showInputDialog("Ingrese el nuevo nombre"));
	    estudiante.setMateria(JOptionPane.showInputDialog("Ingrese la nueva materia"));
	    estudiante.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva nota1")));
	    estudiante.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva nota2")));
	    estudiante.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nueva nota3")));

	    JOptionPane.showMessageDialog(null, "Estudiante actualizado correctamente");
	}
}
