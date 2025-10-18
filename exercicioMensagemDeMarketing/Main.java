package exercicioMensagemDeMarketing;

public class Main {
    public static void main(String[] args) {
        String mensagemMarketing = "Grande promoção de Black Friday! Não perca!";

        // Usar o serviço de whatsapp
        System.out.println("--- Teste 1: Enviando por WhatsApp ---");
        ServicoMensagem servicoWhatsApp = new ServicoWhatsApp();
        EnvioMarketing enviador = new EnvioMarketing(servicoWhatsApp);
        enviador.executarEnvio(mensagemMarketing);

        // Mudar para o serviço de email em tempo de execução sem alterar o EnvioMarketing
        System.out.println("--- Teste 1: Enviando por E-Mail ---");
        ServicoMensagem email = new ServicoEmail();
        enviador.setServico(email);
        enviador.executarEnvio(mensagemMarketing);

        // Mudar para o serviço de SMS em tempo de execução sem alterar o EnvioMarketing
        System.out.println("\n--- Teste 3: Mudando para SMS ---");
        ServicoMensagem sms = new ServicoSMS();
        enviador.setServico(sms);
        enviador.executarEnvio(mensagemMarketing);

        // 4. Mudar a estratégia para Redes Sociais
        System.out.println("\n--- Teste 4: Mudando para Redes Sociais ---");
        ServicoMensagem redesSociais = new ServicoRedesSociais();
        enviador.setServico(redesSociais);
        enviador.executarEnvio(mensagemMarketing);
    }
}
