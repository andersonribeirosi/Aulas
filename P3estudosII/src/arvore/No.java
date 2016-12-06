package arvore;

public class No {

	private int valor;
	private No esquerda;
	private No direita;

	public No(int valor) {
		this.valor = valor;

	}

	public static No raiz;

	public static void inserirElemento(int valor) {
		inserirElemento(raiz, valor);

	}

	public void exibirRaiz() {
		if (raiz == null) {
			System.out.println("Arvóre vazia!");
			return;
		}

		System.out.println("Raiz " + raiz.getValor());
	}

	public static void inserirElemento(No node, int valor) {
		if (node == null) {
			raiz = new No(valor);

		} else if (valor < node.valor) {
			if (node.esquerda != null) {
				inserirElemento(node.esquerda, valor);

			} else {
				System.out.println(valor + " a esqueda de " + node.valor);
				node.esquerda = new No(valor);
			}

		} else {
			if (node.direita != null) {
				inserirElemento(node.direita, valor);

			} else {
				System.out.println(valor + " a direita de " + node.valor);
				node.direita = new No(valor);
			}
		}
	}


		public void posOrdem(No node) {
		if (node != null) {
			posOrdem(node.esquerda);
			posOrdem(node.direita);
			System.out.print(node.valor + " ");
		}
	}

	// public void emOrdem(No node) {
	// if (node != null) {
	// emOrdem(node.getEsquerda());
	// System.out.print(node.getValor() + " ");
	// emOrdem(node.getDireita());
	// }
	// }
	//
	// public void preOrdem(No node) {
	// if (node != null) {
	// System.out.print(node.getValor() + " ");
	// preOrdem(node.getEsquerda());
	// preOrdem(node.getDireita());
	// }
	// }
	//

	public static void main(String[] args) {
		inserirElemento(10);
		inserirElemento(7);
		inserirElemento(15);
		inserirElemento(2);
		inserirElemento(6);

		System.out.println();
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public No getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No esquerda) {
		this.esquerda = esquerda;
	}

	public No getDireita() {
		return direita;
	}

	public void setDireita(No direita) {
		this.direita = direita;
	}

	public static No getRaiz() {
		return raiz;
	}

	public static void setRaiz(No raiz) {
		No.raiz = raiz;
	}

}
