
public class IniciadoJedi {
	public String nome;
	public String especie;
	public int anoNascimento;
	
	public IniciadoJedi() {
		this("NomeJedi", "Humano", 10);
	}

	public IniciadoJedi(String nome, String especie, int anoNascimento) {
		this.nome = nome;
		this.especie = especie;
		this.anoNascimento = anoNascimento;
	}
	
	public String getDescricao() {
		return String.format("%s (especie=%s, nascimento=%s)", this.nome, this.especie, this.getAnoNascimento());
	}
	
	public String getAnoNascimento() {
		return Math.abs(this.anoNascimento) + (this.anoNascimento < 0 ? " ABY" : " DBY"); 
	}
	
}
