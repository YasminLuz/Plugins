package filenewopenplugin;


import interfaces.ICore;
import interfaces.IDocumentFactory;
//import interfaces.IDocumentEditor;
//import interfaces.IDocumentFactory;
//import interfaces.IDocumentSerializer;
import interfaces.IPlugin;
import interfaces.IUIController;
import java.io.File;
import textfactoryplugin.TextFactoryPlugin;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;

/**
 *
 * @author aluno
 */
public class FileNewOpenPlugin implements IPlugin {

    @Override
    public boolean initialize(ICore core) {
        IUIController uiController = core.getUIController();
        IDocumentFactory doc = new TextFactoryPlugin();
//        IDocumentSerializer serializer = null;
           
        JMenuItem fileNewItem = uiController.addMenuItem("File", "New");
        fileNewItem.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.out.println("Voce clicou no File->New");

        doc.createDocumentEditor().createDocument();
//            IDocumentEditor createDocumentEditor = doc.createDocumentEditor();
//            open();
//                serializer.load();
//            doc.getSupportedExtensions(file);
//            core.getPluginController().getLoadedPluginsByType(IDocumentFactory.class);
        });        
        
     
        
        JMenuItem fileOpenItem = uiController.addMenuItem("File", "Open");
        fileOpenItem.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.out.println("Voce clicou no File->Open");
            doc.createDocumentEditor().open();
//            open();
            
//            serializer.load();
        });     
        
        JMenuItem fileSaveItem = uiController.addMenuItem("File", "Save");
        fileSaveItem.addActionListener((java.awt.event.ActionEvent evt) -> {
            System.out.println("Voce clicou no File->Save");
            doc.createDocumentSerializer().save();
//            save();
            
//            serializer.save();
        }); 

        return true;
    }
    
    private void save(){ 
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
    
    private void open(){               
        File[] file = null;
        JFileChooser fc = new JFileChooser(); 
        
        fc.setDialogTitle("Selecione o(s) arquivo(s)..."); 
        fc.setDialogType(JFileChooser.OPEN_DIALOG); 
        fc.setApproveButtonText("Abrir"); 
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        
        //filter *.txt
        fc.setAcceptAllFileFilterUsed(false);
        
        fc.setMultiSelectionEnabled(true); 
        
        int result = fc.showOpenDialog(fc); 
        
        if (result == JFileChooser.CANCEL_OPTION)
            System.exit(1);
        
         file = fc.getSelectedFiles(); 
         
         for(File f : file) {
             System.out.println("NOME: " + f.getName());
             this.file = f;
         }
    }
    
    private File file;
    
        //abrir arquivo documentação java :: https://docs.oracle.com/javase/tutorial/uiswing/components/filechooser.html
    }
    
    



  

