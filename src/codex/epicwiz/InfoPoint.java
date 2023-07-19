/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codex.epicwiz;

import com.jme3.input.event.MouseButtonEvent;
import com.jme3.input.event.MouseMotionEvent;
import com.jme3.scene.Spatial;
import com.simsilica.lemur.Button;
import com.simsilica.lemur.Command;
import com.simsilica.lemur.Container;
import com.simsilica.lemur.TextField;
import com.simsilica.lemur.component.BorderLayout;
import com.simsilica.lemur.component.BorderLayout.Position;
import com.simsilica.lemur.event.MouseListener;

/**
 *
 * @author gary
 */
public class InfoPoint extends Container {    
        
    private TextField title, text;
    
    public InfoPoint(String title) {
        this(title, "");
    }
    public InfoPoint(String title, String text) {
        this.title = new TextField(title);
        this.title.setSingleLine(true);
        this.text = new TextField(text);
        this.text.setSingleLine(false);
        BorderLayout layout = new BorderLayout();
        setLayout(layout);
        layout.addChild(Position.North, this.title);
        //layout.addChild(Position.North, new Button("X")).addClickCommands(new CloseCommand());
        layout.addChild(Position.South, this.text);
    }
    
    public String getTitleString() {
        return title.getText();
    }
    public String getBodyText() {
        return text.getText();
    }
    
    private class CloseCommand implements Command<Button> {
        @Override
        public void execute(Button source) {
            removeFromParent();
        }        
    }
    private class HyperlinkPopup implements MouseListener {
        @Override
        public void mouseButtonEvent(MouseButtonEvent mbe, Spatial sptl, Spatial sptl1) {}
        @Override
        public void mouseEntered(MouseMotionEvent mme, Spatial sptl, Spatial sptl1) {
            if (sptl == text) {
                
            }
        }
        @Override
        public void mouseExited(MouseMotionEvent mme, Spatial sptl, Spatial sptl1) {}
        @Override
        public void mouseMoved(MouseMotionEvent mme, Spatial sptl, Spatial sptl1) {}        
    }    
    
}
