public class Brasileira extends Pizza{
    Brasileira()//construtor para preencher a variavel preco com os valores das pizzas
    {
        this.preco = 20f;
    }
    @Override
    public void setPreco(float preco) {
        super.setPreco(preco);
    }

    @Override
    public String mostraBrinde() {
        return "chaveiro";
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Mussarela, requeijao, presunto e azeitona.");
    }
}
