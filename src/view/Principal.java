package view;

import controller.ArvoreController;

public class Principal {

	public static void main(String[] args) {
		
		int[] vet = { 7, 8, 3, 4, 2, 1, 6, 5 };

		ArvoreController cont = new ArvoreController();

		cont.execucao(vet);

	}

}
