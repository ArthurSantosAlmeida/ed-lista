package controller;

import br.edu.fateczl.Lista;

public class Controllerex2 {

	public void Interseccao(Lista<Integer> A, Lista<Integer> B, Lista<Integer> I) {
		
		for (int i = 0; i < A.size(); i++) {
			for (int ii = 0; ii < B.size(); ii++) {
				try {
					if (A.get(i) == B.get(ii)) {
					I.addFirst(A.get(i));
				}
				} catch (Exception e) {
				}
			}
		}
		System.out.print("Intersecção -> ");
		for (int i = 0; i < I.size(); i++) {
			try {
				System.out.print(I.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void Uniao(Lista<Integer> A, Lista<Integer> B, Lista<Integer> U) {
		
		for (int i = 0; i < A.size(); i++) {
			try {
				U.add(A.get(i), i);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		for (int i = 0; i < B.size(); i++) {
			try {
				int num = B.get(i);
				U.addLast(num);
			} catch (Exception e) {
			}
		}
		for (int i = 0; i < U.size(); i++) {
			try {
				System.out.print(U.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println();
		System.out.print("União -> ");
		for (int i = 0; i < U.size(); i++) {
			try {
				System.out.print(U.get(i) + " ");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
