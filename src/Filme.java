public class Filme {

    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double avaliacao;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Incluído no plano: " + incluidoNoPlano);
        System.out.println("Duração em minutos: " + duracaoEmMinutos);
    }

    void avalia(double nota) {
        double somaDasNotas = this.avaliacao * this.totalDeAvaliacoes;
        this.totalDeAvaliacoes++;
        this.avaliacao = (somaDasNotas + nota) / this.totalDeAvaliacoes;
    }

}
