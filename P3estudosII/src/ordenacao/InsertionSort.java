package ordenacao;

import javax.swing.JOptionPane;

public class InsertionSort {

	public static void main(String[] args) {

		int vetor[] = { 6, 8, 1, 10, 15, 120, 60, 80 };
		int j;

		for (int i = 1; i < vetor.length; i++) {
			int temp = vetor[i];

			for (j = i - 1; j >= 0 && temp < vetor[j]; j--)
				vetor[j + 1] = vetor[j];
				vetor[j + 1] = temp;
		}
		String listaOrdenada = "";
		for (int i : vetor) {
			listaOrdenada += i + " / ";
		}

		JOptionPane.showMessageDialog(null, "Numeros Ordenados de forma crescente");

		JOptionPane.showMessageDialog(null, listaOrdenada);
	}
}

