
import br.edu.fateczl.Lista;
import controller.Controllerex1;

public class PrincipalView2 {
	public static void main(String[] args) {
		
		Lista<Integer> lista = new Lista<>();
		Controllerex1 c = new Controllerex1();
		
		try {
			lista.addFirst(10);
			lista.addLast(5);
			lista.addLast(8);
			lista.addLast(1);
			lista.addLast(9);
			lista.addLast(2);
			lista.addLast(4);
			lista.addLast(7);
			lista.addLast(3);
			lista.addLast(6);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.print("Lista normal -> ");
		for (int i = 0; i < lista.size(); i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("");
		c.Ordenar(lista);
	}
}
