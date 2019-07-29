package textfactoryplugin;

import java.io.File;
import interfaces.IDocumentValidator;

/**
 *
 * @author Yasmin
 */
public class TextValidator implements IDocumentValidator {

    private TextValidator(){
        
    }  
    
    public static TextValidator getInstance(){
        if(validator == null)
           validator = new TextValidator();

        return validator;
    }
    
    @Override
    public String Validate(File file) {
        String arrayExtensions = "pdf|gif|png|jpg|txt";
                
        String[] extensions = arrayExtensions.split("|");
        
        String extensionFile = null; 
        String s = file.getName(); 
        int index = s.lastIndexOf ('.'); 

        if ((index> 0) && (index <s.length() - 1))  
            extensionFile = s.substring(index + 1).toLowerCase();
            
        for (String e : extensions)
            if(e.equals(extensionFile))
               return extensionFile;
      
        return null;
    }   
    
    private static TextValidator validator;
}
