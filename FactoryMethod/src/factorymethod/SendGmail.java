package factorymethod;

/**
 *
 * @author Servidor01
 */
public class SendGmail implements SendMail{

    @Override
    public void enviar(String conteudo ) {
        System.out.println("GMAIL :" + conteudo);
    }
    
}
