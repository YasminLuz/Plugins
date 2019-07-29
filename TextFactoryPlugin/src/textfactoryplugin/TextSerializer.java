package textfactoryplugin;


import java.io.File;
import javax.swing.JFileChooser;
import interfaces.IDocumentSerializer ;

/**
 *
 * @author Yasmin
 */
public class TextSerializer implements IDocumentSerializer {

    private TextSerializer(){
        
    }  
    
    public static TextSerializer getInstance(){
        if(serializer == null)
           serializer = new TextSerializer();

        return serializer;
    } 
    
    @Override
    public void load() {
        File[] file = null;
        JFileChooser fc = new JFileChooser(); 
        
        fc.setDialogTitle("Selecione o(s) arquivo(s)..."); 
        fc.setDialogType(JFileChooser.OPEN_DIALOG); 
        fc.setApproveButtonText("Abrir"); 
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        
        //filter *.txt
        fc.setAcceptAllFileFilterUsed(false);
        fc.setFileFilter(new Txtfilter());
        
        fc.setMultiSelectionEnabled(true); 
        
        int result = fc.showOpenDialog(fc); 
        
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
         file = fc.getSelectedFiles(); 
         
         for(File f : file) 
             System.out.println("NOME: " + f.getName());
    }

    @Override
    public void save() {
//        FileDialog save = null;
//        
//        try{
//            save = new FileDialog(new Dialog(save), "Salvando arquivo", FileDialog.SAVE);
//            save.setVisible(true);
//            
//            PrintWriter pw = new PrintWriter(save.getDirectory()+ save.getFile());
//            
//            
//        } catch(Exception ex){
//            System.out.println("O arquivo não foi salvo. Erro" + ex.getMessage());
//        }
        
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
    
    
    private static TextSerializer serializer;
}
