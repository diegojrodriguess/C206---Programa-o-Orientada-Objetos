public class Main {
    public static void main(String[] args) {
        //criando objetos
        RedeSocial [] redesSociais = new RedeSocial[100];
        Facebook facebook = new Facebook();
        Twitter twitter = new Twitter();
        Usuario usuario = new Usuario(redesSociais);


        //preenchendo as informacoes
        usuario.setNome("Diego");
        usuario.setEmail("diego.rodrigues@ges.inatel.br");

        facebook.setSenha("facebook123");
        facebook.setNumAmigos(1000);

        twitter.setSenha("twitter321");
        twitter.setNumAmigos(1551);

        //colocando as redes sociais no Array de redes
        redesSociais [0] = facebook;
        redesSociais [1] = twitter;

        //chamando os metodos
        usuario.redesSociais[0].postarFoto();
        usuario.redesSociais[0].curtirPublicacao();
        Facebook facebookaux = (Facebook) usuario.redesSociais[0];
        facebookaux.fazStreaming();

        usuario.redesSociais[1].postarVideo();
        usuario.redesSociais[1].postarComentario();
        Twitter twitteraux = (Twitter) usuario.redesSociais[1];
        twitteraux.compartilhar();

    }
}