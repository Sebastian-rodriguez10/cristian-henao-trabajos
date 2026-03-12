
public class Operario {
	private String documento;
	private String nombre;
	private Double sueldo;
	private Integer años;
	private Double aumento;
	private Double sueldoActualizada;
	
	public Operario () {
		
	}
	
	public Operario(String documento, String nombre, Double sueldo, Integer años, Double descuento, Double sueldoActualizada) {
		this.documento = documento;
		this.nombre = nombre;
		this.sueldo = sueldo;
		this.años = años;
		this.aumento = descuento;
		this.sueldoActualizada = sueldoActualizada;
	}


	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String docuemnto) {
		this.documento = docuemnto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getSueldo() {
		return sueldo;
	}
	public void setSueldo(Double sueldo) {
		this.sueldo = sueldo;
	}
	public Integer getAños() {
		return años;
	}
	public void setAños(Integer años) {
		this.años = años;
	}
	
	public Double getSueldoActualizada() {
		return sueldoActualizada;
	}
	public void setSueldoActualizada(Double sueldoActualizada) {
		this.sueldoActualizada = sueldoActualizada;
	}
	
	public Double getDescuento() {
		return aumento;
	}

	public void setDescuento(Double descuento) {
		this.aumento = descuento;
	}

	@Override
	public String toString() {
		return "Operario [documento=" + documento + ", nombre=" + nombre + ", sueldo=" + sueldo + ", años=" + años
				+ ", descuento=" + aumento + "%" + ", sueldoActualizada=" + sueldoActualizada + "]";
	}
	
	

}
