package DesignPatterns.CreationalDesinPatterns.PrototypePattern.WithPrototype;

public interface Shape extends Cloneable{ 
 //Clonable is a marker interface which is used to indicate that the objects of this class can be cloned.
    
    public Shape clone();
    public void draw();

}
