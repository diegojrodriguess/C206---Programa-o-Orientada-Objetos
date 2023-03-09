public abstract class RedeSocial {
    protected String senha;
    protected int numAmigos;

    //metodos
    public abstract void postarFoto();
    public abstract void postarVideo();
    public abstract void postarComentario();
    public void curtirPublicacao()
    {
        System.out.println("curtiu a publicacao");
    }
    //setter'
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setNumAmigos(int numAmigos) {
        this.numAmigos = numAmigos;
    }

}
