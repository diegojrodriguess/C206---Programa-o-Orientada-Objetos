public class Deus extends Personagem implements Lutar{
    //atributos
    private String tipoDeus;


    //getter's e setter's


    public String getTipoDeus() {
        return tipoDeus;
    }

    public void setTipoDeus(String tipoDeus) {
        this.tipoDeus = tipoDeus;
    }

    //metodos da mae
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de Deus: " + tipoDeus);
    }

    //metodos da interface
    @Override
    public void atacar() {
        System.out.println("O " + this.getNome() + " fez um ataque.");
    }

    @Override
    public void defender() {
        System.out.println("O " + this.getNome() + " defendeu.");
    }

    @Override
    public void tomarDano() {
        System.out.println("O " + this.getNome() + " tomou dano.");
        this.setVida(this.getVida()-3);
        System.out.println("Vida: " + this.getVida());
    }

    @Override
    public void gerarDano() {
        System.out.println("O " + this.getNome() + " gerou dano.");
    }
}
