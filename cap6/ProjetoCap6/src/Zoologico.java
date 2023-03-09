public class Zoologico {
    //atributos explicitos
    private String nome;
    private String endereco;

    //atributos implicitos
    private Animal[] bixos = new Animal[100];

    public Animal[] getBixos() {
        return bixos;
    }

    public void setBixos(Animal[] bixos) {
        this.bixos = bixos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
