package interfaces;

import java.io.File;

/**
 *
 * @author Yasmin
 */
public interface IDocumentEditor {
    public void open(File file);
    File createDocument();
}
