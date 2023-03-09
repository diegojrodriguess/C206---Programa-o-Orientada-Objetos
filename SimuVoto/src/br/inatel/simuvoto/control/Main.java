package br.inatel.simuvoto.control;

import br.inatel.simuvoto.exception.CpfErradoException;
import br.inatel.simuvoto.model.Candidato;
import br.inatel.simuvoto.model.Eleitor;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //criando um objeto do tipo Arquivo para a manipulacao de arquivos
        Arquivo arq = new Arquivo();

        //criando os tres candidatos
        Candidato c1 = new Candidato("Paulinho Anao",77,"Dos males o menor!");
        Candidato c2 = new Candidato("Rogerao",51,"O amigo do povao!");
        Candidato c3 = new Candidato("Darth Verde", 43,"O mais honesto das galaxias");

        //ArrayList de Eleitores
        ArrayList <Eleitor> lista = new ArrayList<>();
        ArrayList <Candidato> listaCandidatos = new ArrayList<>();//lista para armazenar os candidatos

        //variaveis auxiliares
        int aux;//variavel auxiliar para o loop de leitura
        Scanner sc = new Scanner(System.in);//scanner
        aux = 1;//iniciando a variavel aux em 1 para entrar no loop
        int nvp = 0;//numero de votos do paulinho
        int nvr = 0;//numero de votos do rogerao
        int nvd = 0;//numero de votos do darth verde

        //colocando os candidatos na lista
        listaCandidatos.add(c1);
        listaCandidatos.add(c2);
        listaCandidatos.add(c3);

        System.out.println("Bem vindo ao SimuVoto!");
        System.out.println("Os candidatos sao: ");
        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("Nome do candidato: " + listaCandidatos.get(i).getNome());
            System.out.println("Numero: " + listaCandidatos.get(i).getNumero());
            System.out.println("Bordao: " + listaCandidatos.get(i).getBordao());
        }

        System.out.println("Fase de cadastro:");

        //cadastrando os eleitores
        while (aux != 0)
        {
            Eleitor eleitor = new Eleitor();//eleitor auxiliar
            System.out.println("CPF do eleitor: ");
            try {
                eleitor.setCpf(sc.nextLine());
                if (eleitor.getCpf().length() != 11)
                    throw new CpfErradoException();
            }catch (CpfErradoException e) {
                System.err.println(e);
                break;
            }
            System.out.println("Numero de voto: ");
            eleitor.setNumVoto(sc.nextInt());
            lista.add(eleitor);
            System.out.println("Para finalizar os registros, digite 0, para continuar, digite qualquer outro numero.");
            aux = sc.nextInt();
            sc.nextLine();
        }

        /*
        for(Eleitor c: lista)
        {
            System.out.println(c.getCpf());
        }

         */

        //varrendo a lista, criando os arquivos com os cpf's dos eleitores e contabilizando os votos
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNumVoto() == 77)
            {
                arq.escreverPaulinho(lista.get(i));
                nvp++;
            }
            else if (lista.get(i).getNumVoto() == 51)
            {
                arq.escreverRogerao(lista.get(i));
                nvr++;
            }
            else if (lista.get(i).getNumVoto() == 43)
            {
                arq.escreverDarthVerde(lista.get(i));
                nvd++;
            }
        }


        System.out.println("CONTAGEM FINAL DE VOTOS!");
        System.out.println("Paulinho Anao: " + nvp);
        System.out.println("Rogerao: " + nvr);
        System.out.println("Darth Verde: " + nvd);

    }
}
