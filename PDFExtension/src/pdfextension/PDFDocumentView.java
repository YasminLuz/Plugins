package pdfextension;

import interfaces.IDocumentEditor;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Yasmin
 */
public class PDFDocumentView implements IDocumentEditor {

//    @Override
    @Override
    public void open() {
        String line;
        
        File[] fileLocal = null;
        JFileChooser fc = new JFileChooser(System.getProperty("user.dir")); 
        
        fc.setDialogTitle("Selecione o(s) arquivo(s)..."); 
        fc.setDialogType(JFileChooser.OPEN_DIALOG); 
        fc.setApproveButtonText("Abrir"); 
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        //filter *.pdf
        fc.setFileFilter(new FileNameExtensionFilter("Arquivos PDF", "pdf")); 
        fc.setAcceptAllFileFilterUsed(false);
        fc.setMultiSelectionEnabled(false); 
        int result = fc.showOpenDialog(fc); 
        
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
         fileLocal = fc.getSelectedFiles(); 
         
         for(File f : fileLocal) {
             System.out.println("NOME: " + f.getName());
             this.file = f;
         }
    }  

//    @Override
    public File createDocument() {
        return null;
        //NOT implements here
    }
    
    private File file;
    
}
