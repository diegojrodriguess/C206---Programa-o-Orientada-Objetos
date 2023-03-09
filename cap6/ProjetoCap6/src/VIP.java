public class VIP extends Ingresso{
    private String tamanhoAbada;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Tamanho do abada: " + tamanhoAbada);
    }
}
