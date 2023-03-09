public class Jardim {
    //ATRIBUTOS
    String nomeDono;
    String contato;
    String endereco;

    //ATRIBUTO IMPLICITO
    public Arvore [] arvores;

    //CONSTRUTOR DA CLASSE
    Jardim(String nd, String ct, String ed)
    {
        nd = nomeDono;
        ct = contato;
        ed = endereco;
    }

    //METODOS
    void addArvore (Arvore [] arvores1)
    {
        System.out.println("Foi adicionado uma arvore ao jardim");
        System.out.println("INFORMACOES: ");
        System.out.println("Especie: " + arvores[0].especie);
        System.out.println("Altura: " + arvores[0].altura);
        System.out.println("Diametro: " + arvores[0].diametro);
        System.out.println("Preco: " + arvores[0].preco);
    }
    void replantar()
    {
        for (int i = 0; i < arvores.length; i++) {
            if (arvores[i].altura >= 50 && arvores[i].diametro >= 3)
                System.out.println("A arvore da especie " + arvores[i].especie + " deve ser replantada.");
        }
    }
    void precoMedio()
    {
        float mediafloat;
        for (int i = 1; i < arvores.length; i++) {
            mediafloat = arvores[i-1].preco;
            mediafloat = mediafloat + arvores[i].preco;
        }
        int mediaint = (int) mediafloat/arvores.length;
        System.out.println("A media total e: RS" + mediaint);
    }
    void mostraInfo()
    {
        System.out.println("Nome do dono do Jardim: " + nomeDono);
        System.out.println("Contato: " + contato);
        System.out.println("Endereco: " + endereco);
        //verificando as arvores
        for (int i = 0; i < arvores.length; i++) {
            if (arvores[i] != null)
            {
                System.out.println("Especie: " + arvores[i].especie);
                System.out.println("Altura: " + arvores[i].altura);
                System.out.println("Diametro: " + arvores[i].diametro);
                System.out.println("Preco: " + arvores[i].preco);
            }
        }
    }
}
