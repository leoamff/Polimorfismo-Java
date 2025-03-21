

public class Main {
    public static void main(String[] args) {

    int diasAtraso = 5;
    
    Livro livro = new Livro();
    livro.anoPublicacao = 2000;
    livro.autor = "Cleiton Soarez";
    livro.numCopias = 100;
    livro.titulo = "A natureza rosa";
    
    DVD dvd = new DVD();
    dvd.anoPublicacao = 1970;
    dvd.duracaoMinutos = 120;
    dvd.numCopias = 25;
    dvd.titulo = "O rei leão";

    Revista revista = new Revista();
    revista.anoPublicacao = 2020;
    revista.edicao = "Roger Dantas";
    revista.numCopias = 2;
    revista.titulo = "Como ser eu";

    System.out.println("Livro: " + livro.titulo + " - Multa: R$" + livro.calcular_multa(diasAtraso));
    System.out.println("DVD: " + dvd.titulo + " - Multa: R$" + dvd.calcular_multa(diasAtraso));
    System.out.println("Revista: " + revista.titulo + " - Multa: R$" + revista.calcular_multa(diasAtraso));
    }
}
