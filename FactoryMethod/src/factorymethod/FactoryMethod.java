package factorymethod;
/**
 *
 * @author Eduardo Junior
 */
public class FactoryMethod {

    public static void main(String[] args) {
       
       SendMail se;
       
       se = Factory.factorySendEmail("gmail");
        se.enviar("Agora Vai");
        
        se = Factory.factorySendEmail("gmail");
        se.enviar("Agora Vai");
        
        se = Factory.factorySendEmail("gmail");
        se.enviar("Agora Vai");
        
        se = Factory.factorySendEmail("yahoo");
        se.enviar("Agora Vai");
        
        se = Factory.factorySendEmail("yahoo");
        se.enviar("Agora Vai");
        
        se = Factory.factorySendEmail("yahoo");
        se.enviar("Agora Vai");
        
        try{
            se = Factory.factorySendEmail("ddd");
            se.enviar("Agora Vai");
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
    }
}


