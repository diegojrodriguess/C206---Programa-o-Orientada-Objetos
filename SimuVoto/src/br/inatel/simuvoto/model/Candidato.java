package br.inatel.simuvoto.model;

public class Candidato {
    //atributos da classe candidato
    private String nome;
    private int numero;
    private String bordao;

    //construtor da classe
    public Candidato (String name, int num, String bord)
    {
        this.nome = name;
        this.numero = num;
        this.bordao = bord;
    }
    //getter's
    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getBordao() {
        return bordao;
    }
}
