package br.inatel.lab;

public class Pianista extends Musico implements Tecnica, Tempo{
    private float alturaBanco;

    public float getAlturaBanco() {
        return alturaBanco;
    }

    public void setAlturaBanco(float alturaBanco) {
        this.alturaBanco = alturaBanco;
    }

    @Override
    public void tocar() {
        System.out.println("O " + this.getNome() + "esta tocando: " + this.getMusica());
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Altura do banco: " + alturaBanco);
    }

    @Override
    public void tocarAcorde() {
        System.out.println("O " + this.getNome() + "tocou um acorde");
    }

    @Override
    public void errarPausa() {
        this.setPontuacao(pontuacao-25);
        System.out.println("Ira recomecar");
    }
}
