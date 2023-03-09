public abstract class
Personagem {
    //atributos
    public static int cont;
    private int numCadastro;
    private String nome;
    private int poder;
    private int vida;
    private int idade;

    //atributo implicito
    Arma arma = new Arma();

    Personagem()
    {
        cont++;
        numCadastro = cont;
    }

    //getter's e setter's

    public int getNumCadastro() {
        return numCadastro;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    //metodos
    public void mostraInfo()
    {
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Poder: " + poder);
        System.out.println("Idade: " + idade);
        System.out.println("Vida: " + vida);
    }
}
