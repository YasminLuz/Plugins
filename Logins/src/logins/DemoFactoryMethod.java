package logins;

import interfaces.ICore;
import interfaces.ILogon;
import interfaces.IPlugin;

/**
 *
 * @author Aluno
 */
public class DemoFactoryMethod implements IPlugin{ 
    
    @Override
    public boolean initialize(ICore core) {
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
