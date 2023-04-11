
public class TreinadorJedi {

	public String titulacao;
	public String nome;

	public TreinadorJedi() {
		this("Titulo", "Nome");
	}

	public TreinadorJedi(String titulacao, String nome) {
		this.titulacao = titulacao;
		this.nome = nome;
	}

	public String getDescricao() {
		return String.format("%s %s", this.titulacao, this.nome);
	}

}
