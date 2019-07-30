package pdfextension;

/**
 *
 * @author Yasmin
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
import org.apache.pdfbox.cos.COSDocument;  
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class PDFReader {
    
    public static void extraiTextoDoPDF(String path) {
       System.out.println("Inicio");
		PDFTextStripper pdfStripper = null;
		PDDocument pdDoc = null;
		COSDocument cosDoc = null;
		File file = new File(path);
		try {
			PDFParser parser = new PDFParser((RandomAccessRead) new FileInputStream(file));
			parser.parse();
			cosDoc = parser.getDocument();
			pdfStripper = new PDFTextStripper();
			pdDoc = new PDDocument(cosDoc);
                        //Começa a leitura do arquivo a partir da página informada
                        // neste exemplo é a página "1"
			pdfStripper.setStartPage(1);
 
			pdfStripper.setEndPage(pdfStripper.getEndPage());
			String parsedText = pdfStripper.getText(pdDoc);
 
			Scanner s = new Scanner(parsedText);
			s.useDelimiter("\n");
 
			String linha = "";
			while (s.hasNext()) {
				linha = s.next();				
				System.out.println(linha);				
			}
			s.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim");
}
    
    
}
