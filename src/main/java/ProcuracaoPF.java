public class ProcuracaoPF implements Procuracao{
    private final Assinatura assinatura;

    public ProcuracaoPF() {
        this(new AssinaturaFisica());
    }

    public ProcuracaoPF(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String emitir() {
        return assinatura.assinar("Procuraçao PF");
    }
}
