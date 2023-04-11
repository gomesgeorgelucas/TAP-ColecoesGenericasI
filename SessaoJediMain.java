
public class SessaoJediMain {

	public static void main(String[] args) {
		
		var sessao1 = new SessaoJedi("Sessao Teste", new TreinadorJedi("Titulo Teste", "Nome Teste"));
		sessao1.addIniciado(new IniciadoJedi("Nome teste", "", 0));

	}

}
