package pdfextension;

import interfaces.ICore;
import interfaces.IDocumentEditor;
import interfaces.IDocumentFactory;
import interfaces.IDocumentSerializer;
import interfaces.IDocumentValidator;
import interfaces.IPlugin;

/**
 *
 * @author Yasmin
 */
public class PDFExtension implements IPlugin, IDocumentFactory{

    @Override
    public boolean initialize(ICore core) {
        return true;
    }

    @Override
    public IDocumentEditor createDocumentEditor() {
        return new PDFDocumentView();
    }

    @Override
    public IDocumentValidator createDocumentValidator() {
       return new PDFDocumentValidator();
    }

    @Override
    public IDocumentSerializer createDocumentSerializer() {
       return new PDFDocumentSerializer();
    }
    
}
