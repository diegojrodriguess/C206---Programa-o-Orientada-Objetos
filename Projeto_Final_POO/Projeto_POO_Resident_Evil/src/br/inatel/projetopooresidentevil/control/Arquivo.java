package br.inatel.projetopooresidentevil.control;
import br.inatel.projetopooresidentevil.model.*;
import br.inatel.projetopooresidentevil.exception.*;

import java.io.*;
import java.util.ArrayList;

public class Arquivo {
    public void escreverSobrevivente(Sobrevivente s)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        /*
        Precisaremos de uma estrutura try-catch and finally
        para realizar as operacoes
         */

        //usando as estruturas de try catch para possiveis erros
        try{
            os = new FileOutputStream("Sobreviventes.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** SOBREVIVENTES *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(s.getNome()+"\n");
            bw.write(s.getIdade()+"\n");// \n faz quebra de linha
            bw.write(s.getVida()+"\n");
            bw.write(s.getTipoSobrevivente()+"\n");
        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }

    public ArrayList<Sobrevivente> lerSobrevivente(){
        //classes basicas para realziara aleitura de dadoos

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        ArrayList<Sobrevivente> encontreiNoArquivo = new ArrayList<>();

        String linhaLer;//variavel auxiliar para lermos as informacoes do arquivo


        //trcatch pra erros
        try{
            is = new FileInputStream("Personagem.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();//colocando o cursosr de inicio das informacoes no arquivo

            while (linhaLer != null)//loop que ira veriicar se ainda tem informacoes no arquiv
            {
                //verificando se a string encontrou a flag
                if (linhaLer.contains("***** FUNCIONARIOS *****")){
                    //variavel auxiliar de funcionario
                    Sobrevivente aux = new Sobrevivente();

                    aux.setNome(br.readLine());
                    aux.setIdade(Integer.parseInt(br.readLine()));
                    aux.setVida(Integer.parseInt(br.readLine()));
                    aux.setTipoSobrevivente(br.readLine());

                    encontreiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();//voltando a variavel ao inicio do arquivo
            }



        }catch (Exception e) {
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return encontreiNoArquivo;
    }

    public void escreverVilao(Vilao v)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        /*
        Precisaremos de uma estrutura try-catch and finally
        para realizar as operacoes
         */

        //usando as estruturas de try catch para possiveis erros
        try{
            os = new FileOutputStream("Viloes.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** VILOES *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(v.getNome()+"\n");
            bw.write(v.getIdade()+"\n");// \n faz quebra de linha
            bw.write(v.getVida()+"\n");
            bw.write(v.getTipoVilao()+"\n");
        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }

    public ArrayList<Vilao> lerVilao(){
        //classes basicas para realziara aleitura de dadoos

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        ArrayList<Vilao> encontreiNoArquivo = new ArrayList<>();

        String linhaLer;//variavel auxiliar para lermos as informacoes do arquivo


        //trcatch pra erros
        try{
            is = new FileInputStream("Viloes.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();//colocando o cursosr de inicio das informacoes no arquivo

            while (linhaLer != null)//loop que ira veriicar se ainda tem informacoes no arquiv
            {
                //verificando se a string encontrou a flag
                if (linhaLer.contains("***** VILOES *****")){
                    //variavel auxiliar de funcionario
                    Vilao aux = new Vilao();

                    aux.setNome(br.readLine());
                    aux.setIdade(Integer.parseInt(br.readLine()));
                    aux.setVida(Integer.parseInt(br.readLine()));
                    aux.setTipoVilao(br.readLine());

                    encontreiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();//voltando a variavel ao inicio do arquivo
            }



        }catch (Exception e) {
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return encontreiNoArquivo;
    }

    public void escreverZumbi(Zumbi z)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;


        /*
        Precisaremos de uma estrutura try-catch and finally
        para realizar as operacoes
         */

        //usando as estruturas de try catch para possiveis erros
        try{
            os = new FileOutputStream("Zumbis.txt",true);//informando o nome do arquivo
            osw = new OutputStreamWriter(os);//ponte que transforma de stream de caracteres para bytes
            bw = new BufferedWriter(osw);//em bw escreveremos a informacao que queremos salvar no arquivo


            bw.write("***** ZUMBIS *****");//escrevendo uma frase no arquivo
            bw.newLine();

            bw.write(z.getNome()+"\n");
            bw.write(z.getIdade()+"\n");// \n faz quebra de linha
            bw.write(z.getVida()+"\n");
            bw.write(z.getTipoMutacao()+"\n");
        } catch (Exception e){
        } finally {
            try {
                bw.close();//sempre necessario fechar o bw
            }catch (Exception e){

            }
        }
    }
    public ArrayList<Zumbi> lerZumbi(){
        //classes basicas para realziara aleitura de dadoos

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

        ArrayList<Zumbi> encontreiNoArquivo = new ArrayList<>();

        String linhaLer;//variavel auxiliar para lermos as informacoes do arquivo


        //trcatch pra erros
        try{
            is = new FileInputStream("Zumbis.txt");
            isr = new InputStreamReader(is);
            br = new BufferedReader(isr);

            linhaLer = br.readLine();//colocando o cursosr de inicio das informacoes no arquivo

            while (linhaLer != null)//loop que ira veriicar se ainda tem informacoes no arquiv
            {
                //verificando se a string encontrou a flag
                if (linhaLer.contains("***** ZUMBIS *****")){
                    //variavel auxiliar de funcionario
                    Zumbi aux = new Zumbi();

                    aux.setNome(br.readLine());
                    aux.setIdade(Integer.parseInt(br.readLine()));
                    aux.setVida(Integer.parseInt(br.readLine()));
                    aux.setTipoMutacao(br.readLine());

                    encontreiNoArquivo.add(aux);
                }
                linhaLer = br.readLine();//voltando a variavel ao inicio do arquivo
            }



        }catch (Exception e) {
            System.out.println(e);
        }finally {
            try{
                br.close();
            }catch (Exception e){
                System.out.println(e);
            }
        }

        return encontreiNoArquivo;
    }

    public void atualizarSobrevivente (Sobrevivente s)
    {
        //criando as estruturas que permitirao escrever no arquivo
        OutputStream os = null;
        OutputStreamWriter osw = null;
        BufferedWriter bw = null;

        //classes basicas para realziara aleitura de dadoos

        InputStream is = null;
        InputStreamReader isr = null;
        BufferedReader br = null;

    }
    public void deletarSobrevivente (Sobrevivente s)
    {

    }
}
