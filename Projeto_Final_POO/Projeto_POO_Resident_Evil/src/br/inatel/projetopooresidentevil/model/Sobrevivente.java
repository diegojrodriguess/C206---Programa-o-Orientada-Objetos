package br.inatel.projetopooresidentevil.model;

public class Sobrevivente extends Personagem implements Lutar {
    private String tipoSobrevivente;
    //override no metodo mostrainfo

    @Override
    public void mostraInfo() {
        super.mostraInfo();
        System.out.println("Tipo de Sobrevivente: " + tipoSobrevivente);
    }

    //atributo implícito
    Arma arma = new Arma();


    //getter e setter
    public String getTipoSobrevivente() {
        return tipoSobrevivente;
    }

    public void setTipoSobrevivente(String tipoSobrevivente) {
        this.tipoSobrevivente = tipoSobrevivente;
    }

    //metodos da interface lutar
    @Override
    public void defender() {
        System.out.println("O(a) " + getNome() + " se defendeu");
    }

    @Override
    public void atirar(Arma arma, Personagem p) {
        System.out.println("O(A)" + getNome() + " atirou em " + p.getNome());
        p.setVida(p.getVida() - arma.getFirepower());
        System.out.println("Vida do(A) " + p.getNome() + ": " + p.getVida());
    }
}
