package factorymethod;
/**
 *
 * @author Eduardo Junior
 */
public class Factory {
    
    
    public static SendMail factorySendEmail(String provedor){
        
        
        if(provedor.equalsIgnoreCase("gmail")){
            return new SendGmail();
        }
        
        if(provedor.equalsIgnoreCase("yahoo")){
            return new SendYahoo();
        }
        
        return null;
        
        
        
    }
}
