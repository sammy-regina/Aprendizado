package exercicioMensagemDeMarketing;

import java.sql.SQLOutput;

// Classe para SMS
public class ServicoSMS implements ServicoMensagem{ //implements é usado para implementar uma interface
    @Override
    public  void  enviar(String mensagem){
        // logica de envio de SMS
        System.out.println("Enviando SMS... ");
        System.out.println("Conteúdo: \"" + mensagem + "\"");
        System.out.println("Enviado.");
        System.out.println("------------------------------------------");
    }
}
