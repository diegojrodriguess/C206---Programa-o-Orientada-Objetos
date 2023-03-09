package br.inatel.lab;

public class Competicao {
    Musico [] competidores = new Musico[100];

    public void addMusico (Musico musico)
    {
        for (int i = 0; i < competidores.length; i++) {
            musico = competidores[i];
            break;
        }
    }
    public void listarCompetidores ()
    {
        for (int i = 0; i < competidores.length; i++) {
            if (competidores[i] != null)
                System.out.println("Nome do competidor: " + competidores[i].getNome());
        }
    }
}
