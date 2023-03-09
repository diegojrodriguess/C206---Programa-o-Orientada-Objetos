public class Main {
    public static void main(String[] args) {
        //criando um objeto Midgard
        Midgard midgard = new Midgard();

        //criando personagens
        Deus zeus = new Deus();
        Gigante gaia = new Gigante();
        Anao sindri = new Anao();

        //criando uma arma
        Arma bladeofchaos = new Arma();

        //preenchendo os valores da arma
        bladeofchaos.setForca(350);
        bladeofchaos.setNomeArma("Blade of Chaos");
        bladeofchaos.setTipoArma("Espada");

        //preenchendo os valores de cada objeto
        zeus.setNome("Zeus");
        zeus.setVida(1000);
        zeus.setTipoDeus("Deus dos deuses");
        zeus.setIdade(1000);
        zeus.setPoder(8001);

        gaia.setNome("Gaia");
        gaia.setIdade(5000);
        gaia.setPoder(5000);
        gaia.setVida(100);
        gaia.setAltura(50);
        gaia.setTipoGigante("natureza");

        sindri.setNome("Sindri");
        sindri.setIdade(200);
        sindri.setAltura(0.9);
        sindri.setPoder(300);
        sindri.setVida(30);
        sindri.setCor("azul");

        //colocando os objetos no array
        midgard.addPersonagem(zeus);
        midgard.addPersonagem(gaia);
        midgard.addPersonagem(sindri);

        //chamando a funcao que chama todas as funcoes
        midgard.listarPersonagens();

        //chamando a funcao do Sindri de modificar armas usando a blade of chaos
        sindri.modificarArma(bladeofchaos);

        System.out.println("Total de personagens: " + Personagem.cont);

    }
}
