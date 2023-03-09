public class Kids extends VIP{
    private String docResponsavel;

    @Override
    public void mostraInfos() {
        super.mostraInfos();
        System.out.println("Documento do responsavel: " + docResponsavel);
    }
}
