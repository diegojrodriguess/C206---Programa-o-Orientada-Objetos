public abstract class Pizza {
    protected float preco;

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    //metodos abstratos
    public abstract void mostraIngredientes();
    public abstract String mostraBrinde();

}
