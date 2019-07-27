package logins;

import interfaces.ILogon;

/**
 *
 * @author Aluno
 */
public class Google implements ILogon{

    @Override
    public String createLogon() {
        return "Google";
    }
    
}
