public class Cliente {

    private Contrato contrato;
    private Procuracao procuracao;
    private FabricaAbstrata fabrica;

    public Cliente(FabricaAbstrata fabrica) {
        this.fabrica = fabrica;
        this.contrato = fabrica.criarContrato();
        this.procuracao = fabrica.criarProcuracao();
    }

    public Contrato getContrato() {
        return contrato;
    }

    public Procuracao getProcuracao() {
        return procuracao;
    }
}