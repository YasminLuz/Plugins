package pdfextension;

import java.io.File;

/**
 *
 * @author Yasmin
 */
public class PDFFilter {
    
  public boolean accept(File file)
  {
    return file.getName().toLowerCase().endsWith("pdf");
  }
  
    /**
     *
     * @return extension of file
     */
  
  public String getDescription(){
      return "Text Documents (*.pdf)";
  } 
}
