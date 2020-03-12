package factorymethod;


/**
 *
 * @author Eduardo Junior
 */
public class SendYahoo implements SendMail {

    @Override
    public void enviar(String conteudo ) {
       System.out.println("GMAIL :" + conteudo);
    }
    
}
