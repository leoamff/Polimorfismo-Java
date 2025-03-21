class DVD extends ItemBiblioteca {

    int duracaoMinutos;

    @Override
    public double calcular_multa(int diasAtraso)
    {
        return diasAtraso * 2.0;
    }
}