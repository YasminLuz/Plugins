package adapterplugins;

import interfaces.ICore;
import interfaces.IDocumentEditor;
import interfaces.IPlugin;
import pdfextension.PDFExtension;
import textfactoryplugin.TextFactoryPlugin;

/**
 *
 * @author Yasmin
 */
public class AdapterPlugins implements IPlugin {
 
    IDocumentEditor generic;
    
    public AdapterPlugins(){
    
    }
    
    public AdapterPlugins(String typeExtension){
        if(typeExtension.toLowerCase().equals("pdf"))
            generic = getPDF();
        else 
            generic = this.getTxt();
    }
    
    @Override
    public boolean initialize(ICore core) {
       return true;
    }
    
    public IDocumentEditor getPDF(){
        return new PDFExtension().createDocumentEditor();
    }
    
    public IDocumentEditor getTxt(){
        return new TextFactoryPlugin().createDocumentEditor();
    }

}
