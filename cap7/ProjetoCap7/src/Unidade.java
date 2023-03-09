public abstract class Unidade {
    protected String endereco;
    protected String nomeResponsavel;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    //atributo implicito
    Pizza [] pizzas = new Pizza[100];

    //metodos
    public void mostraPizzas()
    {
        for (int i = 0; i < pizzas.length; i++) {
            if (pizzas[i] != null)
            {
                if (pizzas[i] instanceof Brasileira)
                    System.out.println("Brasileira");
                else if (pizzas[i] instanceof Pepperoni)
                    System.out.println("Pepperoni");
                else System.out.println("Supreme");
            }
        }
    }
}
