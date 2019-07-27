package textfactoryplugin;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Yasmin
 */
public class TextEditor implements interfaces.IDocumentEditor {

    @Override
    public void open(File file) {
        String line;
        
        try{
            BufferedReader input = new BufferedReader(new FileReader(file));
            String linha;
            
            while ((linha = input.readLine()) != null) 
                 System.out.println(linha);
                
            input.close();
              
        } catch(IOException ex){
            System.out.println("Arquivo inexistente");
        }
    }
    
    @Override
    public File createDocument() {
       
            String nameFile = JOptionPane.showInputDialog("Informe o nome do arquivo");
            nameFile += ".txt";
            File file = new File(nameFile);
            PrintWriter pw;
            
            try {
                pw = new PrintWriter(new FileWriter(file)); 
                Scanner sc = new Scanner(System.in);   
                pw.write(sc.next());
                pw.close();
            } catch (IOException ex) {
                System.out.println("Não foi possível criar o arquivo");
            }
            
            return file;
        
    }
    
}
