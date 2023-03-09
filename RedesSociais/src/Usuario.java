public class Usuario {
    //atributos
    private String nome;
    private String email;

    //construtor da classe com o array de referencias
    RedeSocial [] redesSociais = new RedeSocial[100];
    public Usuario (RedeSocial[] redesSociais)
    {
        this.redesSociais = redesSociais;
    }

    //setter's
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}
