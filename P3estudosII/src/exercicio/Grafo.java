package exercicio;
import java.util.ArrayList;

public class Grafo {
	protected String grafo;
	
	static ArrayList<Vertice> listaVertice = new ArrayList<Vertice>();
	static ArrayList<Aresta> listaAresta = new ArrayList<Aresta>();
	
	protected Grafo(String grafo) {
		this.grafo = grafo;
	}
	protected void adicionarVertice(Vertice v){		
		listaVertice.add(v);
	}
	protected void adicionarAresta(Aresta a){
		listaAresta.add(a);
	}
	

	protected int obterVerticeGrau(Vertice v){
		int grauVertice = 0;
		if(listaVertice.contains(v)== true){
			for(Aresta a : listaAresta){
				if((a.arestaDestino.equals(v))||(a.arestaOrigem.equals(v))){
					grauVertice++;					
				}
			}
			return grauVertice;
		}
		else{
			System.out.println("Vertice não pertencente ao grafo \n");
			return -1;
		}
	}
	
}
