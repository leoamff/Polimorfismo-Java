class Revista extends ItemBiblioteca {
    String edicao;

    @Override
    public double calcular_multa(int diasAtraso)
    {
        return diasAtraso * 1.0;
    }
}
