package exercicioMensagemDeMarketing;

public class ServicoEmail implements ServicoMensagem{
    @Override
    public  void  enviar(String mensagem){
        // logica de envio de SMS
        System.out.println("Enviando E-mail... ");
        System.out.println("Conteúdo: \"" + mensagem + "\"");
        System.out.println("Enviado.");
        System.out.println("------------------------------------------");
    }
}
