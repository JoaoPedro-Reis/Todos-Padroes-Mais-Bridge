public class FactoryMethod implements FabricaAbstrata {

    private static FactoryMethod instancia;

    private FactoryMethod() {
    }

    public static FactoryMethod getInstance() {
        if (instancia == null) {
            instancia = new FactoryMethod();
        }

        return instancia;
    }

    @Override
    public Contrato criarContrato() {
        return new ContratoPF();
    }

    @Override
    public Procuracao criarProcuracao() {
        return new ProcuracaoPF();
    }
}