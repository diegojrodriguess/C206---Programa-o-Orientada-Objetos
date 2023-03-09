package br.inatel.projetopooresidentevil.model;

public class Zumbi extends Personagem{
    private String tipoMutacao;

    //override no metodo da classe abstrata personagem
    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de Mutacao: " + tipoMutacao);
    }

    //atributo do zumbi
    public void morder (Personagem p)
    {
        int dano = 0;
        System.out.println("O(a) " + p.getNome() + "foi mordido por um zumbi!");
        if (tipoMutacao.equals("zumbi"))
            dano = 10;
        else if (tipoMutacao.equals("cerberus"))
            dano = 20;
        else if (tipoMutacao.equals("licker"))
            dano = 30;
        p.setVida(p.getVida() - dano);
        System.out.println("Vida atual do(A) " + p.getNome() + ": " + p.getVida());
    }

    //GETTER E SETTER
    public String getTipoMutacao() {
        return tipoMutacao;
    }

    public void setTipoMutacao(String tipoMutacao) {
        this.tipoMutacao = tipoMutacao;
    }
}
