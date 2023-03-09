public class Anao extends Personagem implements Magia{
    //atributos
    private double altura;
    private String cor;
    private boolean invisivel = false;//nao ha porque ter getter ou setter de invisivel, visto que essa variavel so se usa na funcao de ficar invisivel


    //getter's e setter's


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }



    public void requisitarServicos ()
    {
        System.out.println("O " + this.getNome() + " esta requisitando servicos");
    }
    public void construirArmas ()
    {
        System.out.println("O " + this.getNome() + " esta construindo armas");
    }
    public void ficarInvisivel () {
        if (invisivel == false)
        {
            System.out.println("O " + this.getNome() + " esta invisivel");
            invisivel = true;
         }
        else System.out.println("O anao " + this.getNome() + " ja esta invisivel.");
    }

    //metodo da mae
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Altura: " + altura);
        System.out.println("Cor: " + cor);
    }

    //metodos da interface
    @Override
    public void modificarArma(Arma arma) {
        System.out.println("A arma foi modificada.");
        arma.setForca(arma.getForca()+5);
        arma.mostraInfo();
    }

    @Override
    public void modificarArmadura() {
        System.out.println("A armadura foi modificada pelo: " + this.getNome());
    }
}
