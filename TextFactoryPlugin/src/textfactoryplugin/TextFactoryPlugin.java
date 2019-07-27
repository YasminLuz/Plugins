package textfactoryplugin;

import interfaces.ICore;
import interfaces.IDocumentEditor;
import interfaces.IPlugin;
import interfaces.IDocumentFactory;
import interfaces.IDocumentSerializer;
import interfaces.IDocumentValidator;
import java.io.File;


/**
 *
 * @author Yasmin
 */
public class TextFactoryPlugin implements IPlugin, IDocumentFactory{


    @Override
    public boolean initialize(ICore core) {
     
        return false;
    }

  
    @Override
    public String getSupportedExtensions(File file) {
        String arrayExtensions = "gif|png|jpg|txt";
                
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

    @Override
    public IDocumentEditor createDocumentEditor() {
        return new TextEditor();
    }

    @Override
    public IDocumentValidator createDocumentValidator() {
        return new TextValidator();
    }

    @Override
    public IDocumentSerializer createDocumentSerializer() {
        return new TextSerializer();
    }

   

    
}
