public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 175;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(10);
        meuFilme.avalia(5);
        meuFilme.avalia(8);
        meuFilme.avalia(9);

        System.out.println("Avaliação: " + meuFilme.avaliacao);
        System.out.println("Total de avaliações: " + meuFilme.totalDeAvaliacoes);
    }
    
}