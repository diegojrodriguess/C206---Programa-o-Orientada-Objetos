public class Main {
    public static void main(String[] args) {
        //criando objeto de unidade
        Unidade [] unidades = new Unidade[100];
        Pizza [] p = new Pizza[100];

        BH bh = new BH();
        RJ rj = new RJ();
        SP sp = new SP();

        Brasileira brasileira = new Brasileira();
        Pepperoni pepperoni = new Pepperoni();
        Supreme supreme = new Supreme();

        //colocando as unidades dentro do array de referencias
        unidades [0] = bh;
        unidades [1] = rj;
        unidades [2] = sp;

        //colocando as pizzas dentro do array de referencias
        p [0] = brasileira;
        p [1] = pepperoni;
        p [2] = supreme;

        //colocando as pizzas em bh
        unidades [0].pizzas[0] = p[1];
        unidades [0].pizzas[1] = p[2];


        //colocando as pizzas em rj
        unidades [1].pizzas[0] = p[0];
        unidades [1].pizzas[1] = p[1];

        //colocando as pizzas em sp
        unidades [2].pizzas[0] = p[0];
        unidades [2].pizzas[1] = p[1];
        unidades [2].pizzas[2] = p[2];

        bh.mostraPizzas();
        rj.mostraPizzas();
        sp.mostraPizzas();

    }
}
