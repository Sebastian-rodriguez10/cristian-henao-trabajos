import java.lang.foreign.ValueLayout;
import java.util.HashMap;

public class Datos {

	HashMap<String, Operario> lista; 
	
	public Datos() {
		lista = new HashMap<String, Operario>();
	}

	public String agregar (String document, Operario ope) {
		if (lista.containsKey(document) == false) {
			lista.put(document, ope);
			return "Si";
		}else {
			System.out.println("Ya existe este usuario");
			return "No";
		}
		
	}
	
	public void consultarOperario(String documento) {
		if (lista.containsKey(documento)) {
			System.out.println(lista.get(documento));
		}else {
			System.out.println("La persona consultada no existe");
		}
	}
	public void imprimirLista () {
		System.out.println("======== LISTA OPERARIOS =========");
		for (Operario operario : lista.values()) {
			System.out.println(operario + "\n");
		}
	}
}
