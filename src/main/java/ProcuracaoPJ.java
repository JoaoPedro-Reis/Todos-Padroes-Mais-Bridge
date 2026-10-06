public class ProcuracaoPJ implements Procuracao{
    private final Assinatura assinatura;

    public ProcuracaoPJ() {
        this(new AssinaturaFisica());
    }

    public ProcuracaoPJ(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String emitir() {
        return assinatura.assinar("Procuraçao PJ");
    }
}
