package exercicioMensagemDeMarketing;
// Executor
public class EnvioMarketing {
    // a referenciz é do tipo da interface, não da classe concreta
    private ServicoMensagem servico;

    // construtor para definir qual serviço usar
    public EnvioMarketing(ServicoMensagem servico){
        this.servico = servico;
    }

    // metodo para mudar o serviço de envio em tempo de execução
    public  void setServico (ServicoMensagem novoServico){
        this.servico = novoServico;
    }

    //metodo para enviar mensagem delegando a reponsabilidade
    public void executarEnvio(String mensagem){
        System.out.println("Preparando para enviar...");
        this.servico.enviar(mensagem); // chama o metodo enviar da interface, que sera executado pela classe concreta
    }
}
