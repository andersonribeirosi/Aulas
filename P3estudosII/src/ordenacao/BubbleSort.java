package ordenacao;

import javax.swing.JOptionPane;

public class BubbleSort {

	public static void main(String args[]) {
		int[] vet = { 8, 9, 3, 5, 1 };
		int aux = 0;

		for (int i = 0; i < vet.length; i++) {
			for (int j = 0; j < vet.length - 1; j++) {
				if (vet[j] > vet[j + 1]) {
					aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
			}

		}
		String listaOrdenada = "";

		for (int x : vet) {
			listaOrdenada += x + "  /  ";
			
		}
		JOptionPane.showMessageDialog(null, listaOrdenada);
	}
}
