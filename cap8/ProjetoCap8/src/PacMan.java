public class PacMan extends Personagem {
    private int pontuacao;
    private int vidas;

    //atributos
    public void perdeVida()
    {
        vidas--;
    }
    public void ganhaPonto()
    {
        pontuacao++;
    }
}
