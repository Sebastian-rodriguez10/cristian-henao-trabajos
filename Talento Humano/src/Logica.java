
public class Logica {
	
	Operario operario;

	public Logica() {
		
	}
	
	public void porcentajes (Operario ope) {
		double porcentaje = 0;
		if (ope.getSueldo()<500 && ope.getAños() >= 10) {
			System.out.println("obtuvo un 20% de descuento");
			porcentaje = 0.20;
		}else if (ope.getSueldo()<500 && ope.getAños()<10) {
			System.out.println("obtuvo un 5% de descuento");
			porcentaje = 0.05;
		}else if (ope.getSueldo() >=500 ) {
			System.out.println("No obtuvo descuento");
			porcentaje=0;
		}
		double nuevoSueld = ope.getSueldo() * porcentaje;
		ope.setSueldoActualizada(nuevoSueld);
		
		ope.setDescuento(porcentaje*100);
	}

}
