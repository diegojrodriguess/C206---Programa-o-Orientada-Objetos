package br.inatel.simuvoto.model;

public class Eleitor {
    //atributos do eleitor
    private String cpf;
    private int numVoto;//numero do candidato que o eleitor x ira votar

    //getter's
    public String getCpf() {
        return cpf;
    }

    public int getNumVoto() {
        return numVoto;
    }
    //setter's
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNumVoto(int numVoto) {
        this.numVoto = numVoto;
    }
}
