package textfactoryplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;
import interfaces.IDocumentEditor;
import javax.swing.JFileChooser;

/**
 *
 * @author Yasmin
 */
public class TextEditor implements IDocumentEditor {
    
    private TextEditor(){
        
    }  
    
    public static TextEditor getInstance(){
        if(editor == null)
           editor = new TextEditor();

        return editor;
    }
    
    @Override
    public void open() {
        String line;
        
        File[] fileLocal = null;
        JFileChooser fc = new JFileChooser(); 
        
        fc.setDialogTitle("Selecione o(s) arquivo(s)..."); 
        fc.setDialogType(JFileChooser.OPEN_DIALOG); 
        fc.setApproveButtonText("Abrir"); 
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY); 
        //filter *.txt
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
         
 
        try{
            BufferedReader input = new BufferedReader(new FileReader(this.file.getName()));
            String linha;
            
            while ((linha = input.readLine()) != null) 
                 System.out.println(linha);
                
            input.close();
              
        } catch(IOException ex){
            System.err.println("Arquivo inexistente");
        }
    }
    
    @Override
    public File createDocument() {
            //criando arquivo
            String nameFile = JOptionPane.showInputDialog("Informe o nome do arquivo");
            nameFile += ".txt";
            File file = new File(nameFile);
            PrintWriter pw;
            
            //abrindo esse novo arquivo criado
            try {         
                pw = new PrintWriter(file); 
                Scanner sc = new Scanner(System.in); 
                
                pw.println(sc.nextLine());
                pw.close();
            } catch (IOException ex) {
                System.err.println("Não foi possível criar o arquivo");
            }
            
            return file;
    }
    
    private static TextEditor editor;
    private File file;
    
}
