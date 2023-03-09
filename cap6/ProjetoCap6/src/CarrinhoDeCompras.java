public class CarrinhoDeCompras {
    //atributos explicitos
    private String loginCliente;

    //atributos implicitos
    private Ingresso [] ingressos = new Ingresso[100];

    //metodos
    public void addIngresso(Ingresso ing)
    {
        for (int i = 0; i < ingressos.length; i++) {
            if (ingressos[i] != null)
            {
                ingressos[i] = ing;
                break;
            }
        }
    }
    public void mostraDetalhesCompras()
    {
        //for para mostrar dados de todos os ingressos comprados e o total da compra
    }
}
