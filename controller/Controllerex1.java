package controller;

import br.edu.fateczl.Lista;

public class Controllerex1 {

	public Controllerex1() {
		super();
	}
	
	public void Ordenar (Lista<Integer> lista) {
		
		for (int i = 0; i < 10; i++) {
			for (int ii = 0; ii < 9; ii++) {
				try {
					int num1 = lista.get(ii);
					int num2 = lista.get(ii+1);
					if (num1 > num2) {
						int aux = lista.get(ii+1);
						
						lista.remove(ii+1);
						lista.add(num1, ii+1);
						
						lista.remove(ii);
						lista.add(aux, ii);
						
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		System.out.print("Lista ordenada -> ");
		for (int i = 0; i < lista.size(); i++) {
			try {
				System.out.print(lista.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}

}
