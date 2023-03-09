public class Arma {
    //atributos
    private String nomeArma;
    private int forca;
    private String tipoArma;

    //getter's e setter's


    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }

    //metodos
    public void mostraInfo()
    {
        System.out.println("Nome da arma: " + nomeArma);
        System.out.println("Forca: " + forca);
        System.out.println("Tipo de arma: " + tipoArma);
    }
    public void energizar ()
    {

    }
}
