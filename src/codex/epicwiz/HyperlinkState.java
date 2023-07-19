/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codex.epicwiz;

import com.jme3.app.Application;
import com.jme3.app.state.BaseAppState;
import java.util.HashMap;

/**
 *
 * @author gary
 */
public class HyperlinkState extends BaseAppState {
    
    private static HyperlinkState instance;
    HashMap<Object, HyperlinkGroupPanel> panels = new HashMap<>();
    
    @Override
    protected void initialize(Application app) {}
    @Override
    protected void cleanup(Application app) {}
    @Override
    protected void onEnable() {}
    @Override
    protected void onDisable() {}
    
    public void scanAndDisplay(Object owner, String text) {
        
    }
    private void scan(String text) {
        
    }
    
    public static void initializeInstance(Application app) {
        instance = new HyperlinkState();
        app.getStateManager().attach(instance);
    }
    public static HyperlinkState get() {
        return instance;
    }
    
}
