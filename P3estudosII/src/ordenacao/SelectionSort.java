package ordenacao;

import javax.swing.JOptionPane;

public class SelectionSort {

	public static void main(String[] args) {

		int menor, indiceMenor;

		// instanciei o vetor com valores pré-definidos
		int vector[] = { 6, 15, 3, 2, 5, 150, -1, -50, -1000, -10, 30, 4, 1 };

		for (int i = 0; i < vector.length; i++) {
			// Atribuí sendo o menor valor
			menor = vector[i];
			indiceMenor = i;

			// compara com os outros valores
			for (int j = i + 1; j < vector.length; j++) {
				if (vector[j] < menor) {
					menor = vector[j];
					indiceMenor = j;

				}

			}

			// Aqui troca-se o menor pelo maior valor
			vector[indiceMenor] = vector[i];
			vector[i] = menor;

		}

		String listaOrdenada = "";
		
		for (int i : vector) {
			listaOrdenada += i + " / ";
		}

		JOptionPane.showMessageDialog(null, "Lista Ordenada de forma crescente");
		
		JOptionPane.showMessageDialog(null, listaOrdenada);
		

	}
}
