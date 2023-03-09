public class Gigante extends Personagem implements Criar{
    //atributos
    private String tipoGigante;
    private float altura;

    //getter's e setter's


    public String getTipoGigante() {
        return tipoGigante;
    }

    public void setTipoGigante(String tipoGigante) {
        this.tipoGigante = tipoGigante;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    //metodos da mae
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de Gigante: " + tipoGigante);
        System.out.println("Altura: " + altura);
    }

    //metodos da interface
    @Override
    public void construirPortais() {
        System.out.println("O " + this.getNome() + " Construiu um portal.");
    }
}
