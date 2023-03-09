public class Twitter extends RedeSocial implements Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("Fez um retweet");
    }

    @Override
    public void postarFoto() {
        System.out.println("foi feito o post de uma foto no twitter");
    }

    @Override
    public void postarVideo() {
        System.out.println("foi feito o post de um video no twitter");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no twitter");
    }
}
