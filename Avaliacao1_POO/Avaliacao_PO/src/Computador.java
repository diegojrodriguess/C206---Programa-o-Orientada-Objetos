public class Computador {
    //ATRIBUTOS
    public String marca;
    public float preco;

    //ATRIBUTOS IMPLICITOS

    public SistemaOperacional sistemaop;
    public HardwareBasico [] hardwareBasicos;

    //CONSTRUTOR DA CLASSE
    Computador (String marcaa, float precoo, SistemaOperacional so, HardwareBasico [] hb)
    {
        marca = marcaa;
        preco = precoo;
        sistemaop = so;
        hardwareBasicos = hb;
    }


    //METODOS
    public void mostraPCConfigs()
    {
        System.out.println("Marca da maquina: " + marca);
        System.out.println("Preco: RS"+preco);
        System.out.println("Sistema operacional: "+sistemaop.nome);
        System.out.println("Tipo do sistema operacional: " + sistemaop.tipo);
        System.out.println("Informacoes do Hardware: ");
        for (int i = 0; i < hardwareBasicos.length; i++) {
            //verificando a posicao de um array
            if (hardwareBasicos[i] != null)
            {
                System.out.println("Nome: " + hardwareBasicos[i].nome);
                System.out.println("Capacidade: " + hardwareBasicos[i].capacidade);
            }
        }
            }



    public void addMemoriaUSB(MemoriaUSB musb)
    {
        System.out.println("Acompanha uma memoria usb.");
        System.out.println("nome: "+musb.nome);
        System.out.println("Capacidade: "+musb.capacidade);
    }
}
