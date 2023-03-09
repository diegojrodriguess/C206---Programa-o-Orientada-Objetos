package br.inatel.simuvoto.control;

import java.io.*;
import java.util.ArrayList;
import br.inatel.simuvoto.model.Eleitor;

public class Arquivo {

    public void escreverPaulinho(Eleitor eleitor)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;



        //usando as estruturas de try catch para possiveis erros

        try{
            os = new FileOutputStream("Eleitores_Paulinho.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** ELEITORES DO PAULINHO *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(eleitor.getCpf()+"\n");

        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }


    public void escreverRogerao(Eleitor eleitor)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;



        //usando as estruturas de try catch para possiveis erros

        try{
            os = new FileOutputStream("Eleitores_Rogerao.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** ELEITORES DO ROGERAO *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(eleitor.getCpf()+"\n");

        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }

    public void escreverDarthVerde(Eleitor eleitor)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;



        //usando as estruturas de try catch para possiveis erros

        try{
            os = new FileOutputStream("Eleitores_Darth_Verde.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** ELEITORES DO DARTH VERDE *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(eleitor.getCpf()+"\n");

        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }
}
