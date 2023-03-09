import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int codigo;//codigo para significar qual promocao sera comprada pelo cliente
        float finalaux[] = new float[40];//vetor para fazer a soma das compras
        float valorTotalCompra = 0;//valor da compra

        //criando um cliente
        Cliente c1 = new Cliente();

        //CRIANDO OS COMPONENTES DO COMPUTADOR DA PROMOCAO 1
        HardwareBasico HB[] = new HardwareBasico[50];
        HardwareBasico hb1 = new HardwareBasico();
        HardwareBasico hb2 = new HardwareBasico();
        HardwareBasico hb3 = new HardwareBasico();

        hb1.nome = "Processador Pentium Core i3";
        hb1.capacidade = 1200;

        hb2.nome = "Memoria RAM";
        hb2.capacidade = 4;

        hb3.nome = "HD";
        hb3.capacidade = 500;

        HB[0] = hb1;
        HB[1] = hb2;
        HB[2] = hb3;

        //CRIANDO O SISTEMA OPERACIONAL DO COMPUTADOR DA PROMOCAO 1
        SistemaOperacional so1 = new SistemaOperacional();
        so1.nome = "Ubuntu";
        so1.tipo = 32;

        //CRIANDO A MEMORIAUSB DO COMPUTADOR DA PROMOCAO 1
        MemoriaUSB mu = new MemoriaUSB();
        mu.nome = "Pen-drive";
        mu.capacidade = 16;

        //criando o computador da promocao 1
        Computador pc1 = new Computador("Positivo", 1300, so1, HB);

        //CRIANDO OS COMPONENTES DO COMPUTADOR DA PROMOCAO 2
        HardwareBasico HB2[] = new HardwareBasico[50];
        HardwareBasico hb6 = new HardwareBasico();
        HardwareBasico hb4 = new HardwareBasico();
        HardwareBasico hb5 = new HardwareBasico();


        hb4.nome = "Processador Pentium Core i5";
        hb4.capacidade = 2260;

        hb5.nome = "Memoria RAM";
        hb5.capacidade = 8;

        hb6.nome = "HD";
        hb6.capacidade = 1000;

        HB2[0] = hb4;
        HB2[1] = hb5;
        HB2[2] = hb6;

        //CRIANDO O SISTEMA OPERACIONAL DO COMPUTADOR DA PROMOCAO 2
        SistemaOperacional so2 = new SistemaOperacional();
        so2.nome = "Windows 8";
        so2.tipo = 64;

        //CRIANDO A MEMORIAUSB DO COMPUTADOR DA PROMOCAO 2
        MemoriaUSB mu0 = new MemoriaUSB();
        mu0.nome = "Pen-drive";
        mu0.capacidade = 32;

        //criando o computador da promocao 2
        Computador pc2 = new Computador("Acer", 1800, so2, HB2);

        //CRIANDO OS COMPONENTES DO COMPUTADOR DA PROMOCAO 3
        HardwareBasico HB3[] = new HardwareBasico[50];
        HardwareBasico hb7 = new HardwareBasico();
        HardwareBasico hb8 = new HardwareBasico();
        HardwareBasico hb9 = new HardwareBasico();


        hb7.nome = "Processador Pentium Core i7";
        hb7.capacidade = 3500;

        hb8.nome = "Memoria RAM";
        hb8.capacidade = 16;

        hb9.nome = "HD";
        hb9.capacidade = 2000;

        HB3[0] = hb7;
        HB3[1] = hb8;
        HB3[2] = hb9;

        //CRIANDO O SISTEMA OPERACIONAL DO COMPUTADOR DA PROMOCAO 3
        SistemaOperacional so3 = new SistemaOperacional();
        so3.nome = "Windows 10";
        so3.tipo = 64;

        //CRIANDO A MEMORIAUSB DO COMPUTADOR DA PROMOCAO 3
        MemoriaUSB mu1 = new MemoriaUSB();
        mu1.nome = "HD externo";
        mu1.capacidade = 1000;

        //criando o computador da promocao 2
        Computador pc3 = new Computador("Vaio", 2800, so3, HB3);


        System.out.println("Bem vindo a PC Mania, o computador ideal voce encontra aqui!");
        System.out.println("---------------------------------------------------");
        System.out.println("Por favor, entre com seus dados.");
        System.out.println("Nome: ");
        c1.nome = leitor.nextLine();
        System.out.println("CPF: ");
        c1.cpf = leitor.nextLong();

        System.out.println(c1.nome + ",essas sao as nossas promocoes: ");


        pc1.mostraPCConfigs();
        pc1.addMemoriaUSB(mu);

        pc2.mostraPCConfigs();
        pc2.addMemoriaUSB(mu0);

        pc3.mostraPCConfigs();
        pc3.addMemoriaUSB(mu1);


        System.out.println("Para comprar a promocao 1, digite 1.");
        System.out.println("Para comprar a promocao 2, digite 2.");
        System.out.println("Para comprar a promocao 3, digite 3.");
        codigo = leitor.nextInt();
        if (codigo == 1) {
            System.out.println("O valor total da compra esta sendo: RS" + c1.calculaTotalCompra(pc1.preco));
            valorTotalCompra = c1.calculaTotalCompra(pc1.preco);
        } else if (codigo == 2) {
            System.out.println("O valor total da compra esta sendo: RS" + c1.calculaTotalCompra(pc2.preco));
            valorTotalCompra = c1.calculaTotalCompra(pc2.preco);
        } else if (codigo == 3) {
            System.out.println("O valor total da compra esta sendo: RS" + c1.calculaTotalCompra(pc3.preco));
            valorTotalCompra = c1.calculaTotalCompra(pc3.preco);
        } else if (codigo != 0)
            System.out.println("CODIGO INVALIDO");
        else {
            System.out.println(c1.nome + ", o valor total de sua compra e: RS" + valorTotalCompra);
            System.out.println("VOLTE SEMPRE.");
        }



        for(int i=1; codigo!=0;i++) {
            System.out.println("Para comprar a promocao 1, digite 1.");
            System.out.println("Para comprar a promocao 2, digite 2.");
            System.out.println("Para comprar a promocao 3, digite 3.");
            System.out.println("Para parar as compras, digite 0.");
            codigo = leitor.nextInt();
            if (codigo == 1) {
                finalaux [0] = valorTotalCompra;
                finalaux[i] = finalaux[i-1] + c1.calculaTotalCompra(pc1.preco);
                valorTotalCompra = finalaux [i];
                System.out.println("O valor total da compra esta sendo: RS" + valorTotalCompra);
            } else if (codigo == 2) {
                finalaux [0] = valorTotalCompra;
                finalaux[i] = finalaux[i-1] + c1.calculaTotalCompra(pc2.preco);
                valorTotalCompra = finalaux [i];
                System.out.println("O valor total da compra esta sendo: RS" + valorTotalCompra);
            } else if (codigo == 3) {
                finalaux [0] = valorTotalCompra;
                finalaux[i] = finalaux[i-1] + c1.calculaTotalCompra(pc3.preco);
                valorTotalCompra = finalaux [i];
                System.out.println("O valor total da compra esta sendo: RS" + valorTotalCompra);
            } else if (codigo != 0)
                System.out.println("CODIGO INVALIDO");
            else {
                System.out.println(c1.nome + ", o valor total de sua compra e: RS" + valorTotalCompra);
                System.out.println("VOLTE SEMPRE.");
            }
        }

    }
}
