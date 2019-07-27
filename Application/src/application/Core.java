package application;

import interfaces.ICore;
import interfaces.IPluginController;
import interfaces.IUIController;

/**
 *
 * @author aluno
 */
public class Core implements ICore {
    
    private Core() {
        uiController = new UIController();
        pluginController = new PluginController();
        uiController.initialize();
        pluginController.initialize(this);
    }
    
    public static Core getInstance(){
        if(core == null)
           core = new Core();

        return core;
    }
    
    @Override
    public IUIController getUIController() {
        return uiController;
    }

    @Override
    public IPluginController getPluginController() {
        return pluginController;
    }
    
    private static Core core;
    private IUIController uiController;
    private IPluginController pluginController;
}
