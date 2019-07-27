package interfaces;

import java.io.File;

/**
 *
 * @author aluno
 */
public interface IDocumentFactory {
    // Metodos para criacao dos tres produtos
    
    public IDocumentEditor createDocumentEditor();
    public IDocumentValidator createDocumentValidator();
    public IDocumentSerializer createDocumentSerializer();
    public String getSupportedExtensions(File file); // return "gif|png|jpg|txt";
}