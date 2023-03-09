import java.util.Date;

public class Ingresso {
    private static long numberGenerator;
    private long numero;
    protected float valorIngresso;
    protected static float taxaCartao;
    protected Date dataHoraCompra;


    //construtor da classe
    public Ingresso()
    {
        //gerando valores de ingresso
        numberGenerator++;
        this.numero = numberGenerator;

        //terminando de declarar o date
        dataHoraCompra = new Date();
    }

    //metodos
    public float calculaTotalIngresso()
    {
        return valorIngresso + taxaCartao;
    }
    public void mostraInfos()
    {
        System.out.println("Numero do ingresso: " + numero);
        System.out.println("Valor total do ingresso " + calculaTotalIngresso());
        System.out.println("Data e hora da compra: " + dataHoraCompra);
    }
}
