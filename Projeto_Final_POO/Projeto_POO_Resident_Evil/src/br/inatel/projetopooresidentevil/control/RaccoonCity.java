package br.inatel.projetopooresidentevil.control;


import br.inatel.projetopooresidentevil.model.Personagem;
import br.inatel.projetopooresidentevil.model.Sobrevivente;
import br.inatel.projetopooresidentevil.model.Vilao;
import br.inatel.projetopooresidentevil.model.Zumbi;

import java.util.ArrayList;

public class RaccoonCity {
    ArrayList <Personagem> lista = new ArrayList();


    public void addPersonagem (Personagem p){
        lista.add(p);
    }

    public void listarPersonagens()
    {
        System.out.println("Listando os personagens");

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) instanceof Sobrevivente){
                Sobrevivente sobreviventeaux = (Sobrevivente) lista.get(i);
                System.out.println("Nome do sobrevivnte: " + sobreviventeaux.getNome());
                System.out.println("Idade do sobrevivente: " + sobreviventeaux.getIdade());
                System.out.println("Vida: " + sobreviventeaux.getVida());
                System.out.println("Tipo de Sobrevivente: " + sobreviventeaux.getTipoSobrevivente());
            }
            else if (lista.get(i) instanceof Vilao)
            {
                Vilao vilaoaux = (Vilao) lista.get(i);
                System.out.println("Nome do vilao: " + vilaoaux.getNome());
                System.out.println("Idade do vilao: " + vilaoaux.getIdade());
                System.out.println("Vida: " + vilaoaux.getIdade());
                System.out.println("Tipo de vilao: " + vilaoaux.getTipoVilao());
            }
            else {
                Zumbi zumbiaux = (Zumbi) lista.get(i);
                System.out.println("Nome do zumbi:" + zumbiaux.getNome());
                System.out.println("Idade: " + zumbiaux.getIdade());
                System.out.println("Vida: " + zumbiaux.getVida());
                System.out.println("Tipo de Mutacao: " + zumbiaux.getTipoMutacao());
            }
        }
    }
}
