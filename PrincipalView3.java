import br.edu.fateczl.Lista;
import controller.Controllerex2;

public class PrincipalView3 {
	public static void main(String[] args) {
		Lista<Integer> A = new Lista<>();
		Lista<Integer> B = new Lista<>();
		Lista<Integer> I = new Lista<>();
		Lista<Integer> U = new Lista<>();
		
		Controllerex2 c = new Controllerex2();
		
		A.addFirst(3);
		try {
			A.addLast(5);
			A.addLast(8);
			A.addLast(12);
			A.addLast(9);
			A.addLast(7);
			A.addLast(16);
		} catch (Exception e) {
			e.printStackTrace();
		}
		B.addFirst(9);
		try {
			A.addLast(6);
			A.addLast(2);
			A.addLast(3);
			A.addLast(7);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		c.Interseccao(A, B, I);
		c.Uniao(A, B, U);
		
	}
}
