package textfactoryplugin;

import interfaces.ICore;
import interfaces.IDocumentEditor;
import interfaces.IPlugin;
import interfaces.IDocumentFactory;
import interfaces.IDocumentSerializer;
import interfaces.IDocumentValidator;

/**
 *
 * @author Yasmin
 */
public class TextFactoryPlugin implements IPlugin, IDocumentFactory{

    public TextFactoryPlugin(){
        
    }  
    
//    public static TextFactoryPlugin getInstance(){
//        if(textFactory == null)
//           textFactory = new TextFactoryPlugin();
//
//        return textFactory;
//    } 
    
    @Override
    public boolean initialize(ICore core) {
        return true;
    }

//  
//    @Override
//    public String getSupportedExtensions(File file) {
//        String arrayExtensions = "gif|png|jpg|txt";
//                
//        String[] extensions = arrayExtensions.split("|");
//        
//        String extensionFile = null; 
//        String s = file.getName(); 
//        int index = s.lastIndexOf ('.'); 
//
//        if ((index> 0) && (index <s.length() - 1))  
//            extensionFile = s.substring(index + 1).toLowerCase();
//            
//        for (String e : extensions)
//            if(e.equals(extensionFile))
//               return extensionFile;
//      
//        return null;
//    }

    @Override
    public IDocumentEditor createDocumentEditor() {
        return TextEditor.getInstance();
    }

    @Override
    public IDocumentValidator createDocumentValidator() {
        return TextValidator.getInstance();
    }

    @Override
    public IDocumentSerializer createDocumentSerializer() {
        return TextSerializer.getInstance();
    }

   private static TextFactoryPlugin textFactory;

    
}
