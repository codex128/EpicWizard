/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codex.epicwiz;

import com.jme3.math.ColorRGBA;
import com.jme3.math.Vector3f;
import com.jme3.scene.Spatial;
import com.jme3.texture.Texture;
import com.simsilica.lemur.Container;
import com.simsilica.lemur.Label;
import com.simsilica.lemur.component.QuadBackgroundComponent;

/**
 *
 * @author gary
 */
public class Module extends Container implements CatagoryUser {
    
    Catagory catagory;
    private Container catDisplay, infoDisplay;
    private Texture icon;
    
    public Module() {
        this(Catagory.OBJECT_GROUP);
    }
    public Module(Catagory c) {
        catagory = c;
        catagory.addUser(this);
        catDisplay = addChild(new Container());
        catDisplay.addChild(new Label("")).setName("name");
        infoDisplay = addChild(new Container());
        loadInfoPoints();
        reloadCatagoryDisplay(true, true);
        Vector3f size = new Vector3f();
        getLayout().calculatePreferredSize(size);
        setPreferredSize(new Vector3f(200f, size.y, size.z));
    }
    
    @Override
    public boolean removeFromParent() {
        catagory.removeUser(this);
        return super.removeFromParent();
    }
    @Override
    public void catagoryNameChanged(String oldname, String newname) {
        reloadCatagoryDisplay(true, false);
    }
    @Override
    public void catagoryColorChanged(ColorRGBA oldcolor, ColorRGBA newcolor) {
        reloadCatagoryDisplay(false, true);
    }
    
    private void loadInfoPoints() {
        for (String txt : catagory.getInfoPoints()) {
            infoDisplay.addChild(new InfoPoint(txt));
        }
    }
    private void reloadCatagoryDisplay(boolean name, boolean color) {
        if (name) ((Label)catDisplay.getChild("name")).setText(catagory.getName());
        if (color) catDisplay.setBackground(new QuadBackgroundComponent(catagory.getColor()));
    }
    
    public String getInfo(String name) {
        for (Spatial info : infoDisplay.getChildren()) {
            if (info instanceof InfoPoint) {
                
            }
        }
    }
    
}
