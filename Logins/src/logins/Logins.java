package logins;

import interfaces.ICore;
import interfaces.ILogon;
import interfaces.IPlugin;
import interfaces.IUIController;

/**
 *
 * @author Aluno
 */
public class Logins implements IPlugin{ 
    
    @Override
    public boolean initialize(ICore core) {
//        IUIController uiController = core.getUIController();
//        
//        uiController.initialize();
        
        
        return true;
    }
    
    public static ILogon create(String typeLogon){
        
        if(typeLogon.equals("Facebook"))
            return new Facebook();
        else if(typeLogon.equals("LinkedIn"))
            return new LinkedIn();
        else if(typeLogon.equals("Google"))
            return new Google();
        else if(typeLogon.equals("Twitter"))
            return new Twitter();
        
        return null;
    }   
}
