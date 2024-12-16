
public class App {

	public static void main(String[] args) {
		 // Criando uma instância de Pessoa para cada estuantes
        Pessoa pessoa1 = new Pessoa("Luciendyson", 19);
        Pessoa pessoa2 = new Pessoa("Raniely", 20);
        Pessoa pessoa3 = new Pessoa("Amanda", 20);


        // Exibindo as informações dos estudantes
        pessoa1.exibirInformacoes();
        pessoa2.exibirInformacoes();
        pessoa3.exibirInformacoes();
    }
}