package br.inatel.projetopooresidentevil.control;

import br.inatel.projetopooresidentevil.model.*;
import br.inatel.projetopooresidentevil.exception.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CampanhaErradaException {
        Scanner sc = new Scanner(System.in);
        int campanha =  0;//campanha que sera escolhida pelo usuario


        //criando um objeto da cidade Raccoon City
        RaccoonCity raccoonCity = new RaccoonCity();


        //criando tres personagens de tipos diferentes
        Sobrevivente s1 = new Sobrevivente();
        Sobrevivente s2 = new Sobrevivente();
        Sobrevivente s3 = new Sobrevivente();

        //preenchendo as informacoes dos tres sobreviventes
        s1.setNome("Leon Kennedy");
        s1.setVida(100);
        s1.setIdade(27);
        s1.setTipoSobrevivente("Policial");

        s2.setNome("Jill Valentine");
        s2.setVida(100);
        s2.setIdade(30);
        s2.setTipoSobrevivente("Agente STARS");

        s3.setNome("Chris Redfield");
        s3.setVida(100);
        s3.setIdade(33);
        s3.setTipoSobrevivente("Agente STARS");

        //Criando as armas disponiveis
        Arma a1 = new Arma();
        Arma a2 = new Arma();
        Arma a3 = new Arma();
        Arma a4 = new Arma();

        a1.setNomeArma("Faca de combate");
        a1.setFirepower(5);
        a1.setTipoArma("Faca");

        a2.setNomeArma("Glock");
        a2.setFirepower(30);
        a2.setTipoArma("Pistola");

        a3.setNomeArma("Espingarda");
        a3.setFirepower(50);
        a3.setTipoArma("Escopeta");

        a4.setNomeArma("bazuca");
        a4.setFirepower(200);
        a4.setTipoArma("explosiva");




        //Criando zumbis
        Zumbi z1 = new Zumbi();
        Zumbi z2 = new Zumbi();
        Zumbi z3 = new Zumbi();
        Zumbi z4 = new Zumbi();
        Zumbi z5 = new Zumbi();
        Zumbi z6 = new Zumbi();
        Zumbi z7 = new Zumbi();


        z1.setNome("zumbi 1");
        z1.setVida(10);
        z1.setIdade(20);
        z1.setTipoMutacao("zumbi");

        z2.setNome("zumbi 2");
        z2.setVida(10);
        z2.setIdade(20);
        z2.setTipoMutacao("zumbi");


        z3.setNome("zumbi 3");
        z3.setVida(10);
        z3.setIdade(20);
        z3.setTipoMutacao("zumbi");


        z4.setNome("zumbi 4");
        z4.setVida(10);
        z4.setIdade(20);
        z4.setTipoMutacao("zumbi");


        z5.setNome("zumbi 5");
        z5.setVida(10);
        z5.setIdade(20);
        z5.setTipoMutacao("zumbi");

        z6.setNome("zumbi cerberus");
        z6.setVida(20);
        z6.setIdade(5);
        z6.setTipoMutacao("cerberus");

        z7.setNome("zumbi licker");
        z7.setVida(40);
        z7.setIdade(30);
        z7.setTipoMutacao("licker");


        //Criando o vilao do jogo
        Vilao v1 = new Vilao ();
        v1.setNome("Nemesis");
        v1.setIdade(50);
        v1.setVida(200);
        v1.setTipoVilao("Zumbi evoluido");

        //adicionando o vilao e os zumbis a cidade
        raccoonCity.addPersonagem(v1);
        raccoonCity.addPersonagem(z1);
        raccoonCity.addPersonagem(z2);
        raccoonCity.addPersonagem(z3);
        raccoonCity.addPersonagem(z4);
        raccoonCity.addPersonagem(z5);
        raccoonCity.addPersonagem(z6);
        raccoonCity.addPersonagem(z7);


        //INTERFFACE DO JOGO
        System.out.println("RESIDENT EVIL");
        System.out.println("Bem vindo a Raccoon City, a cidade esta completamente infestada de zumbis.");
        System.out.println("E alem disso, um monstro anormal esta te perseguindo!");


        s1.mostraInfo();
        s2.mostraInfo();
        s3.mostraInfo();

        System.out.println("Apenas um dos tres personagens ira sobreviver, escolha qual campanha voce deseja jogar.");
        System.out.println("Digite 1 para jogar com Leon, 2 para jogar com Jill e 3 para jogar com Chris");

        //try catch para pegar se o usuario digitar um numero errado de campanha
        try {
             campanha = sc.nextInt();
            if (campanha > 3 || campanha < 1)
                throw new CampanhaErradaException();
        } catch (CampanhaErradaException e) {
            System.err.println(e);
        }
        if (campanha == 1)
        {
            raccoonCity.addPersonagem(s1);
            System.out.println("Campanha do Leon!");
            System.out.println("Ao caminho da delegacia, Leon encontrou cinco zumbis");

            s1.atirar(a2,z1);
            VerificaMortes verificaMortes = new VerificaMortes(z1,raccoonCity);//verificacao chamada encima do inimigo atacado a cada rodada

            s1.atirar(a2,z2);
            VerificaMortes verificaMortes2 = new VerificaMortes(z2,raccoonCity);

            s1.atirar(a2,z3);
            VerificaMortes verificaMortes3 = new VerificaMortes(z3,raccoonCity);

            s1.atirar(a2,z4);
            VerificaMortes verificaMortes4 = new VerificaMortes(z4,raccoonCity);

            s1.atirar(a2,z5);
            VerificaMortes verificaMortes5 = new VerificaMortes(z5,raccoonCity);

            System.out.println("Os cinco zumbis morreram, mas apareceu um cerberus e um licker");

            z6.morder(s1);
            VerificaMortes verificaMortes6 = new VerificaMortes(s1,raccoonCity);

            s1.atirar(a2,z6);
            VerificaMortes verificaMortes7 = new VerificaMortes(z6,raccoonCity);

            s1.atirar(a3,z7);
            VerificaMortes verificaMortes8 = new VerificaMortes(z7,raccoonCity);

            System.out.println("Apos conseguir eliminar os sete inimigos, Leon chega a delegacia de Raccon City.");
            System.out.println("Em busca de sair da cidade, Leon acha um helicoptero, mas antes disso, o terrivel Nemesis aparece");

            v1.ataquePesado(s1);
            VerificaMortes verificaMortes9 = new VerificaMortes(s1,raccoonCity);

            System.out.println("Leon fica gravemente ferido, mas consegue achar uma bazuca.");

            s1.atirar(a4,v1);
            VerificaMortes verificaMortes10 = new VerificaMortes(v1,raccoonCity);

            System.out.println("Apos conseguir eliminar Nemesis, Leon consegue escapar de Raccon City.");
        }
        else if (campanha == 2){
            raccoonCity.addPersonagem(s2);
            System.out.println("Campanha da Jill!");

            System.out.println("Ao caminho da Torre do Relogio, Jill encontrou cinco zumbis");

            s2.atirar(a2,z1);
            VerificaMortes verificaMortes = new VerificaMortes(z1,raccoonCity);//verificacao chamada encima do inimigo atacado a cada rodada

            s2.atirar(a2,z2);
            VerificaMortes verificaMortes2 = new VerificaMortes(z2,raccoonCity);

            s2.atirar(a2,z3);
            VerificaMortes verificaMortes3 = new VerificaMortes(z3,raccoonCity);

            s2.atirar(a2,z4);
            VerificaMortes verificaMortes4 = new VerificaMortes(z4,raccoonCity);

            s2.atirar(a2,z5);
            VerificaMortes verificaMortes5 = new VerificaMortes(z5,raccoonCity);

            System.out.println("Os cinco zumbis morreram, mas apareceu um cerberus e um licker");

            z6.morder(s2);
            VerificaMortes verificaMortes6 = new VerificaMortes(s2,raccoonCity);

            s2.atirar(a2,z6);
            VerificaMortes verificaMortes7 = new VerificaMortes(z6,raccoonCity);

            s2.atirar(a3,z7);
            VerificaMortes verificaMortes8 = new VerificaMortes(z7,raccoonCity);

            System.out.println("Jill consegue chegar na Torre do Relogio");
            System.out.println("Em busca de um antidoto, Jill acaba encontrando Nemesis furioso em seu caminho");

            v1.ataquePesado(s2);
            VerificaMortes verificaMortes9 = new VerificaMortes(s2,raccoonCity);

            s2.atirar(a3,v1);
            VerificaMortes verificaMortes10 = new VerificaMortes(v1,raccoonCity);

            v1.ataqueLeve(s2);
            VerificaMortes verificaMortes11 = new VerificaMortes(s2,raccoonCity);
        }
        else if (campanha == 3) {
            raccoonCity.addPersonagem(s3);
            System.out.println("Campanha do Chris!");

            System.out.println("Chris passa pela delegacia apos um pedido de socorro.");
            System.out.println("Apos chegar e nao ver nada alem de destruicao, Chris vai ate o escritorio dos STARS");
            System.out.println("Uma passagem secreta foi encontrada, Chris achou o laboratorio da Umbrella");
            System.out.println("Ao buscar por informacoes, Chris ve as portas se fecharem, cinco zumbis aparecerem");

            s3.atirar(a2,z1);
            VerificaMortes verificaMortes = new VerificaMortes(z1,raccoonCity);//verificacao chamada encima do inimigo atacado a cada rodada

            s3.atirar(a2,z2);
            VerificaMortes verificaMortes2 = new VerificaMortes(z2,raccoonCity);

            s3.atirar(a2,z3);
            VerificaMortes verificaMortes3 = new VerificaMortes(z3,raccoonCity);

            s3.atirar(a2,z4);
            VerificaMortes verificaMortes4 = new VerificaMortes(z4,raccoonCity);

            s3.atirar(a2,z5);
            VerificaMortes verificaMortes5 = new VerificaMortes(z5,raccoonCity);

            System.out.println("Os cinco zumbis morreram, mas apareceu um cerberus, um licker e o Nemesis");

            s3.atirar(a3,z6);
            VerificaMortes verificaMortes6 = new VerificaMortes(z6,raccoonCity);

            z7.morder(s3);
            VerificaMortes verificaMortes7 = new VerificaMortes(s3,raccoonCity);

            v1.ataqueLeve(s3);
            VerificaMortes verificaMortes8 = new VerificaMortes(s3,raccoonCity);

            s3.atirar(a3,z7);
            VerificaMortes verificaMortes9 = new VerificaMortes(z7,raccoonCity);

            s3.atirar(a3,v1);
            VerificaMortes verificaMortes10 = new VerificaMortes(v1,raccoonCity);

            s3.atirar(a3,v1);
            VerificaMortes verificaMortes11 = new VerificaMortes(v1,raccoonCity);

            s3.atirar(a3,v1);
            VerificaMortes verificaMortes12 = new VerificaMortes(v1,raccoonCity);

            v1.ataquePesado(s3);
            VerificaMortes verificaMortes13 = new VerificaMortes(s3,raccoonCity);
        }
        System.out.println("FIM DE JOGO.");
    }
}
