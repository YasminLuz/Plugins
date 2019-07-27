package textfactoryplugin;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author Yasmin
 */
public class Txtfilter extends FileFilter {
    
  @Override
  public boolean accept(File file)
  {
    return file.getName().toLowerCase().endsWith("txt");
  }
  
    /**
     *
     * @return extension of file
     */
  @Override
  public String getDescription(){
      return "Text Documents (*.txt)";
  } 
    
    
}
