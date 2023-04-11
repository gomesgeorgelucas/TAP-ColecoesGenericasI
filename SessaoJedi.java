import java.util.ArrayList;

public class SessaoJedi {
	public String nome;
	public TreinadorJedi treinador;
	public ArrayList<IniciadoJedi> iniciados;
		
	public SessaoJedi(String nome, TreinadorJedi treinador) {
		this.nome = nome;
		this.treinador = treinador;
		this.iniciados = new ArrayList<>();
	}

	public void addIniciado(IniciadoJedi iniciado) {
		if (!this.iniciados.stream().anyMatch(current -> current.nome.equals(iniciado.nome))) this.iniciados.add(iniciado);
	}
	
	public IniciadoJedi getIniciado(String nome) {
		return this.iniciados.stream().filter(iniciado -> iniciado.nome == nome).findFirst().orElse(null);		
	}
	
	public double getMediaAnoNascimento() {
		return this.iniciados.stream().mapToInt(iniciado -> iniciado.anoNascimento).reduce(0, (acc, ano) -> acc + ano)/this.iniciados.size();
	}
	
	public String getDescricao() {
		var sb = new StringBuilder();
		
		sb.append(String.format("--> SESSÃO %s (Treinador: %s)\n", this.nome, this.treinador.getDescricao()));
		
		this.iniciados.stream().forEach(n -> sb.append(String.format("  - Iniciado %d: %s\n", this.iniciados.indexOf(n) + 1, n.getDescricao())));
		
		return sb.toString();
	}
}
