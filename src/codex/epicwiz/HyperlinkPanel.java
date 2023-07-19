/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codex.epicwiz;

import com.simsilica.lemur.Axis;
import com.simsilica.lemur.Panel;
import com.simsilica.lemur.component.SpringGridLayout;
import com.simsilica.lemur.core.GuiControl;

/**
 *
 * @author gary
 */
public class HyperlinkPanel extends Panel {
    
    private SpringGridLayout layout;
    private Module link;
    
    public HyperlinkPanel() {
        layout = new SpringGridLayout(Axis.X, Axis.Y);
        getControl(GuiControl.class).setLayout(layout);
        
    }
    
}
