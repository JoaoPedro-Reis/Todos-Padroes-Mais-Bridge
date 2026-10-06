public class ContratoPF implements Contrato {

    private final Assinatura assinatura;

    public ContratoPF() {
        this(new AssinaturaFisica());
    }

    public ContratoPF(Assinatura assinatura) {
        this.assinatura = assinatura;
    }

    @Override
    public String emitir() {
        return assinatura.assinar("Contrato PF");
    }
}