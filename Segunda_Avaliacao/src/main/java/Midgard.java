public class Midgard {
    Personagem[] personagens = new Personagem[100];

    //metodos
    public void addPersonagem(Personagem p) {
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] == null) {
                personagens[i] = p;
                break;
            }
        }
    }

    public void listarPersonagens() {
        System.out.println("Listando os personagens...");
        for (int i = 0; i < personagens.length; i++) {
            if (personagens[i] != null) {
                if (personagens[i] instanceof Deus) {
                    Deus deusaux = (Deus) personagens[i];
                    deusaux.atacar();
                    deusaux.defender();
                    deusaux.gerarDano();
                    deusaux.tomarDano();
                } else if (personagens[i] instanceof Gigante) {
                    Gigante giganteaux = (Gigante) personagens[i];
                    giganteaux.construirPortais();
                } else {
                    Anao anaoaux = (Anao) personagens[i];
                    anaoaux.construirArmas();
                    anaoaux.requisitarServicos();
                    anaoaux.modificarArmadura();
                    anaoaux.ficarInvisivel();
                }
                personagens[i].mostraInfo();
            }
        }
    }
}
