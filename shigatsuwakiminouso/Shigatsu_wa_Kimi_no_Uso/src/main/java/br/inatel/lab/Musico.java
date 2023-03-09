package br.inatel.lab;

public abstract class Musico {
    protected static int contador;
    protected int codigo;
    protected String nome;
    protected int idade;
    protected String musica;
    protected int pontuacao;

    //atributo implicito
    Instrumento i = new Instrumento();

    public Musico ()
    {
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

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

    public String getMusica() {
        return musica;
    }

    public void setMusica(String musica) {
        this.musica = musica;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    //metodos
    public abstract void tocar();

    public void mostraInfo()
    {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Musica: " + this.musica);
    }
    
}
