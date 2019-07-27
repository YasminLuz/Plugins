package logins;

import interfaces.ILogon;

/**
 *
 * @author Aluno
 */
public class Facebook implements ILogon{

    @Override
    public String createLogon() {
       return "Facebook";
    }
    
}
