public class Facebook extends RedeSocial implements Compartilhamento,VideoConferencia{
    @Override
    public void postarFoto() {
        System.out.println("postou uma foto no facebook");
    }

    @Override
    public void postarVideo() {
        System.out.println("postou um video no facebook");
    }

    @Override
    public void postarComentario() {
        System.out.println("fez um comentario no facebook");
    }

    @Override
    public void compartilhar() {
        System.out.println("o post foi compartilhado.");
    }

    @Override
    public void fazStreaming() {
        System.out.println("esta fazendo streaming via faceboook");
    }
}
