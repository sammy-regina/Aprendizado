package exercicioMensagemDeMarketing;

public class ServicoWhatsApp implements ServicoMensagem{
    @Override
    public  void  enviar(String mensagem){
        // logica de envio de Redes Sociais
        System.out.println("Enviando WhatsApp... ");
        System.out.println("Conteúdo: \"" + mensagem + "\"");
        System.out.println("Enviado.");
        System.out.println("------------------------------------------");
    }
}
