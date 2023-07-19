/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codex.epicwiz;

import com.jme3.math.ColorRGBA;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author gary
 */
public class Catagory {
    
    /**
     * Catagory that describes a character.
     */
    public static final Catagory
    CHARACTER = new Catagory("Character", color(0, 116, 216),
            "Name", "Age", "Home", "Occupation", "Personality", "Likes", "Dislikes");
    /**
     * Catagory that describes an event.
     */
    public static final Catagory
    EVENT = new Catagory("Event", color(200, 46, 67),
            "Name", "Time", "Place", "Description");
    /**
     * Catagory that describes an important object.
     */
    public static final Catagory
    OBJECT = new Catagory("Object", color(75, 144, 131),
            "Name", "Description", "Purpose", "History");
    /**
     * Catagory that describes a cutscene.
     */
    public static final Catagory
    CUTSCENE = new Catagory("Cutscene", color(44, 108, 37),
            "Name", "Time", "Place", "Description");
    /**
     * Catagory that describes a race of characters.
     */
    public static final Catagory
    RACE = new Catagory("Race", color(169, 173, 74),
            "Name", "Origin", "Description", "History");
    /**
     * General purpose catagory that describes a subset of game objects.
     * For example, an object group can describe swords, but is also described
     * by a "weapons" object group.
     */
    public static final Catagory
    OBJECT_GROUP = new Catagory("Object Group", color(96, 127, 121),
            "Name", "Description", "Purpose", "History");
    /**
     * Catagory that describes a place.
     */
    public static final Catagory
    PLACE = new Catagory("Place", color(115, 47, 171),
            "Name", "Location", "Description", "Purpose", "History");
    
    private String name;
    private ColorRGBA color;
    private final ArrayList<String> infoPoints = new ArrayList<>();
    private final LinkedList<CatagoryUser> users = new LinkedList<>();
    
    public Catagory(String name, ColorRGBA color) {
        this.name = name;
        this.color = color;
    }
    public Catagory(String name, ColorRGBA color, String... infoPoints) {
        this(name, color);
        addInfoPoints(infoPoints);
    }
    
    public Catagory addInfoPoint(String point) {
        infoPoints.add(point);
        return this;
    }
    public Catagory addInfoPoints(String... points) {
        infoPoints.addAll(Arrays.asList(points));
        return this;
    }
    public boolean removeInfoPoint(String point) {
        return infoPoints.remove(point);
    }
    
    public void setName(String name) {
        users.stream().forEach(u -> u.catagoryNameChanged(this.name, name));
        this.name = name;
    }
    public void setColor(ColorRGBA color) {
        users.stream().forEach(u -> u.catagoryColorChanged(this.color, color));
        this.color.set(color);
    }
    
    public String getName() {
        return name;
    }
    public ColorRGBA getColor() {
        return color;
    }
    public ArrayList<String> getInfoPoints() {
        return infoPoints;
    }
    public Collection<CatagoryUser> getUsers() {
        return users;
    }
    
    public void addUser(CatagoryUser user) {
        users.add(user);
    }
    public boolean removeUser(CatagoryUser user) {
        return users.remove(user);
    }
    
    public static ColorRGBA color(int r, int g, int b) {
        return ColorRGBA.fromRGBA255(r, g, b, 255);
    }
    
}
