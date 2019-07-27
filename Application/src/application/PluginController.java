package application;

import interfaces.ICore;
import interfaces.IPlugin;
import interfaces.IPluginController;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class PluginController implements IPluginController {

    @Override
    public boolean initialize(ICore core) {
        File currentDir = new File("./plugins");
        String []plugins = currentDir.list();
        int i;
        URL[] jars = new URL[plugins.length];
        System.out.println("Encontrei " + plugins.length + " plugins instalados!");
        for (i = 0; i < plugins.length; i++)
            try {
                jars[i] = (new File("./plugins/" + plugins[i])).toURL();
            } catch (MalformedURLException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
        URLClassLoader ulc = new URLClassLoader(jars);
        for (i = 0; i < plugins.length; i++) {
            String pluginName = plugins[i].split("\\.")[0];
            IPlugin plugin = null;
            try {            
                plugin = (IPlugin) Class.forName(pluginName.toLowerCase() + "." + pluginName, true, ulc).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(PluginController.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (plugin != null)
                if (plugin.initialize(core))
                    loadedPlugins.add(plugin);
        }

        return true;
    }

    @Override
    public List<IPlugin> getLoadedPlugins() {
        return loadedPlugins;
    }
    
    @Override
    public <T> List<T> getLoadedPluginsByType(Class<T> type) {
        List<T> loadedPluginsByType = new ArrayList<>();
        
        for (Iterator it = loadedPlugins.iterator(); it.hasNext();) 
            if(it.getClass().equals(type))
                loadedPluginsByType.add((T) it);
        
        return loadedPluginsByType;
    }

    private List<IPlugin> loadedPlugins = new ArrayList<IPlugin>();
//    private final ICore core = Core.getInstance();
}
