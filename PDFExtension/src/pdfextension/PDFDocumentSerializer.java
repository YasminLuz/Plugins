package pdfextension;

import interfaces.IDocumentSerializer;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Yasmin
 */
public class PDFDocumentSerializer implements IDocumentSerializer{
  
    @Override
    public void save(){ 
        File[] file;
        JFileChooser fc = new JFileChooser(); 
        
        fc.setDialogTitle("Escolha o diretório para salvar o arquivo..."); 
        fc.setDialogType(JFileChooser.SAVE_DIALOG); 
        fc.setApproveButtonText("Salvar"); 
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY); 
        fc.setMultiSelectionEnabled(true); 
        
        int result = fc.showOpenDialog(fc); 
        
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        else if (result == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFiles();

            for (File f : file) {
                System.out.println("NOME: " + f.getName());
                f.mkdir();
            }
        } else
            return;
    }

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
