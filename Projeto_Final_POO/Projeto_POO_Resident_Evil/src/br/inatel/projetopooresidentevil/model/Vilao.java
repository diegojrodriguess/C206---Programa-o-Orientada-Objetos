package br.inatel.projetopooresidentevil.model;

public class Vilao extends Personagem implements Atacar {
    private String tipoVilao;

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de Vilao: " + tipoVilao);
    }

    //getter e setter
    public String getTipoVilao() {
        return tipoVilao;
    }

    public void setTipoVilao(String tipoVilao) {
        this.tipoVilao = tipoVilao;
    }


    //metodos da interface
    @Override
    public void ataqueLeve(Personagem p) {
        int dano = 30;
        System.out.println(getNome() + " Realizou um ataque leve");
        p.setVida(p.getVida() - dano);
        System.out.println("Vida do(a) " + p.getNome() + ": " + p.getVida());
    }

    @Override
    public void ataquePesado(Personagem p) {
        int dano = 50;
        System.out.println(getNome() + " Realizou um ataque pesado");
        p.setVida(p.getVida() - dano);
        System.out.println("Vida do(a) " + p.getNome() + ": " + p.getVida());
    }
}
