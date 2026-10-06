public class AssinaturaDigital implements Assinatura {
    @Override
    public String assinar(String documento) {
        return documento + " assinado digitalmente";
    }
}