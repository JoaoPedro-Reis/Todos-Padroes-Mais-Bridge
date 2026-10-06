public class ContratoPJ implements Contrato{
    private final Assinatura assinatura;

    public ContratoPJ() {
        this(new AssinaturaFisica());
    }

    public ContratoPJ(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String emitir() {
        return assinatura.assinar("Contrato PJ");
    }
}
