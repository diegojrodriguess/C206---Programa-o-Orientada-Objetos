public class Pepperoni extends Pizza{
    Pepperoni()//construtor para preencher a variavel preco com os valores das pizzas
    {
        this.preco = 15f;
    }
    @Override
    public String mostraBrinde() {
        return "caneta";
    }

    @Override
    public void mostraIngredientes() {
        System.out.println("Pepperoni e mussarela.");
    }
}
