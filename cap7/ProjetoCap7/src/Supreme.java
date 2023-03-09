public class Supreme extends Pizza{
    Supreme()//construtor para preencher a variavel preco com os valores das pizzas
    {
        this.preco = 25f;
    }
    @Override
    public String mostraBrinde() {
        return "caneca";
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Mussarela, cebola, pimentao e azeitona.");
    }
}
