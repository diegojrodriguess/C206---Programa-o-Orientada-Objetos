package br.inatel.lab;

public class Cellista extends Musico implements Som {
    private boolean sentado;

    public boolean isSentado() {
        return sentado;
    }

    public void setSentado(boolean sentado) {
        this.sentado = sentado;
    }

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        if (sentado == true)
            System.out.println("esta sentado");
        else System.out.println("nao esta sentado");
    }

    @Override
    public void tocar() {
        System.out.println("O " + this.getNome() + "esta tocando: " + this.getMusica());
    }

    @Override
    public void desafinar() {
        System.out.println(this.getNome() + " desafinou");
        this.setPontuacao(pontuacao-((5*pontuacao)/100));
    }
}
