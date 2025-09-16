import br.com.newton.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Avaliação: " + meuFilme.getAvaliacao());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    }
    
}