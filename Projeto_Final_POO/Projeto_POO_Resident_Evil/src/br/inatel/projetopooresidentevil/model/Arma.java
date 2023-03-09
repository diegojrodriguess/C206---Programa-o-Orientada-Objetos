package br.inatel.projetopooresidentevil.model;

public class Arma {
    private String nomeArma;
    private int firepower;
    private String tipoArma;

    //metodo da Arma
    public void mostraInfo (){
        System.out.println("Nome da Arma: " + nomeArma);
        System.out.println("Firepower: " + firepower);
        System.out.println("Tipo de Arma" + tipoArma);
    }
    //getter's e setter's

    public String getNomeArma() {
        return nomeArma;
    }

    public void setNomeArma(String nomeArma) {
        this.nomeArma = nomeArma;
    }

    public int getFirepower() {
        return firepower;
    }

    public void setFirepower(int firepower) {
        this.firepower = firepower;
    }

    public String getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(String tipoArma) {
        this.tipoArma = tipoArma;
    }
}
