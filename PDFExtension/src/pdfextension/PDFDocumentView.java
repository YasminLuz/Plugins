package pdfextension;

import interfaces.IDocumentEditor;
import java.awt.Desktop;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
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
        
        File fileLocal = null;
        JFileChooser fc = new JFileChooser(); //System.getProperty("user.home").dir
        
        fc.setDialogTitle("Selecione o(s) arquivo(s)..."); 
        fc.setDialogType(JFileChooser.OPEN_DIALOG); 
        fc.setApproveButtonText("Abrir"); 
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        
        //filter *.pdf 
        FileFilter filter = new FileNameExtensionFilter ("Arquivos PDF", "pdf");  
        fc.addChoosableFileFilter(filter);
        
        fc.setAcceptAllFileFilterUsed(false);
        fc.setMultiSelectionEnabled(false); 
        int result = fc.showOpenDialog(fc); 
        
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
         fileLocal = fc.getSelectedFile(); 
         
//         for(File f : fileLocal) {
//             System.out.println("NOME: " + f.getName());
//             this.file = f;
//         }
//         JOptionPane.showMessageDialog(null, file);
         this.show(fileLocal);
         
    }  

//    @Override
    @Override
    public File createDocument() {
        return null;
        //NOT implements here
    }
    
    @Override
    public void show(File file){
        try {
            if (Desktop.isDesktopSupported())
                Desktop.getDesktop().open(file);
            else
                PDFReader.extraiTextoDoPDF(file.getName());
        } catch(Exception ex) {
          ex.printStackTrace();
          JOptionPane.showMessageDialog(null, "Erro no Desktop: " + ex);
        }    
    }
    
    private File file;
    
}
