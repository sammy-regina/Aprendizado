package exercicioMensagemDeMarketing;

public class ServicoRedesSociais implements ServicoMensagem{
    @Override
    public  void  enviar(String mensagem){
        // logica de envio de Redes Sociais
        System.out.println("Enviando RedesSociais... ");
        System.out.println("Conteúdo: \"" + mensagem + "\"");
        System.out.println("Enviado.");
        System.out.println("------------------------------------------");
    }
}
