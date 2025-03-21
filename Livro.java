
class Livro extends ItemBiblioteca {
    String autor;

    @Override
    public double calcular_multa(int diasAtraso)
    {
        return diasAtraso * 1.5;
    }
}
