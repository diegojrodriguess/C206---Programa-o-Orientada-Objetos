public class Cliente {
    //atributos
    public String nome;
    public long cpf;


    //METODOS
    public float calculaTotalCompra(float valor)
    {
        float compraTotal = 0;
        float compra = valor;
        compraTotal = compraTotal + compra;
        return compraTotal;
    }
}
