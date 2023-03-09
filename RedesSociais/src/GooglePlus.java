public class GooglePlus extends RedeSocial implements VideoConferencia, Compartilhamento{
    @Override
    public void compartilhar() {
        System.out.println("esta sendo compartilhado no GooglePlus");
    }

    @Override
    public void postarFoto() {
        System.out.println("posotu uma uma foto no GooglePlus");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no GooglePlus");
    }

    @Override
    public void postarComentario() {
        System.out.println("postou um comentario no GoooglePlus");
    }

    @Override
    public void fazStreaming() {
        System.out.println("Esta fazendo streaming via GooglePlus");
    }
}
