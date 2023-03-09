public class Camarote extends Ingresso{
    private String tamanhoCamiseta;

    public String getTamanhoCamiseta() {
        return tamanhoCamiseta;
    }

    public void setTamanhoCamiseta(String tamanhoCamiseta) {
        this.tamanhoCamiseta = tamanhoCamiseta;
    }

    @Override
    public void mostraInfos()
    {
        super.mostraInfos();//isso aproveita tudo que veio do metodo original da classe
        System.out.println("tamanho da camiseta: " + tamanhoCamiseta);
    }
}
