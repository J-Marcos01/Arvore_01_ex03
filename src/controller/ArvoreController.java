package controller;

import br.edu.fateczl.arvore_int.Arvore;

public class ArvoreController {

	public ArvoreController() {
		super();
	}

	public void execucao(int[] vet) {

		Arvore arvore = new Arvore();

		for (int elemento : vet) {
			arvore.Insert(elemento);
		}
		System.out.println("Removendo 7");
		arvore.remove(7);

		System.out.println("Removendo 6");
		arvore.remove(6);
		
		try {
			System.out.println("Pré ordem :");
			arvore.prefixSearch();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\nordem :");
			arvore.infixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			System.out.println("\nPós ordem :");
			arvore.postfixSearch();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
