import java.util.Scanner;
public class Main {
    Scanner leitor = new Scanner(System.in);
    int qa;//quantidade de arvores
    //CRIANDO UM NOVO JARDIM
    String nome;
    String cont;
    String adress;

    System.out.println("Entre com seus dados, por favor.");
    System.out.println("Nome: ");
    nome =leitor.nextLine();
    System.out.println("Contato: ");
    cont =leitor.nextLine();
    System.out.println("Endereco: ");
    adress =leitor.nextLine();


    Jardim j1 = new Jardim(nome, cont, adress);

    //Criando arvores
    System.out.println("Entre com a quantidade de arvores que serão plantadas no jardim")
    qa =leitor.nextInt();

    if(qa >10)
    {
            System.out.println("Nao e possivel cadastrar mais que 10 arvores, repita novamente.");
            qa = leitor.nextInt();
    }
    else
        for(in)
    
}
