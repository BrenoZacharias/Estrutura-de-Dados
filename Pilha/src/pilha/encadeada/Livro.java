package pilha.encadeada;

public class Livro {

	String nome;
	int ano;
	double preco;
	Livro anterior;
	
	public Livro(String nome, int ano, double preco) {
		this.nome = nome;
		this.ano = ano;
		this.preco = preco;
	}
	
	public Livro getAnterior() {
		return anterior;
	}
	
	public void setAnterior(Livro anterior) {
		this.anterior = anterior;
	}
	
	public String toString(){
		return "Nome: " + nome + " Ano: " + ano + " Pre?o: " + preco;
	}
}
