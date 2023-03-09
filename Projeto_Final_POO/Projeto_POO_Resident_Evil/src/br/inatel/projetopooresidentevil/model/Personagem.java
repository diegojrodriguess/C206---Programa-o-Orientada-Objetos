package br.inatel.projetopooresidentevil.model;

public abstract class Personagem {
    //atributos do personagem
    private String nome;
    private int idade;
    private int vida;

    //atributo
    public void mostraInfo()
    {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Vida: " + vida);
    }



    //getter's e setter's

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
}
