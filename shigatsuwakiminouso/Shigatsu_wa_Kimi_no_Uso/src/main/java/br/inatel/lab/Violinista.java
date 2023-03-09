package br.inatel.lab;

public class Violinista extends Musico implements Som{
    private String marcaBreu;
    private boolean usaEspaleira;

    public String getMarcaBreu() {
        return marcaBreu;
    }

    public void setMarcaBreu(String marcaBreu) {
        this.marcaBreu = marcaBreu;
    }

    public boolean isUsaEspaleira() {
        return usaEspaleira;
    }

    public void setUsaEspaleira(boolean usaEspaleira) {
        this.usaEspaleira = usaEspaleira;
    }

    @Override
    public void tocar() {
        System.out.println("O " + this.getNome() + "esta tocando: " + this.getMusica());
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Marca do breu: " + marcaBreu);
        if (this.usaEspaleira == true)
            System.out.println("Usa espaleira");
        else
            System.out.println("Nao usa espaleira");
    }

    @Override
    public void desafinar() {
        System.out.println(this.getNome() + " desafinou");
        if (usaEspaleira == false)
           this.setPontuacao(pontuacao-((10*pontuacao)/100));
        else this.setPontuacao(pontuacao-((5*pontuacao)/100));
    }
}
