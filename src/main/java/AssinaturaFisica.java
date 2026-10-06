public class AssinaturaFisica implements Assinatura {
    @Override
    public String assinar(String documento) {
        return documento + " assinado fisicamente";
    }
}