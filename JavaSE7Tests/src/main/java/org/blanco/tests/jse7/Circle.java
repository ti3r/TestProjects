package org.blanco.tests.jse7;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Circle extends Shape{
    
     private Double radious;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    public Circle(double radious) {
	this.radious = radious;
    }

    Circle() {
    }

    @Override
    public int hashCode() {
	int hash = 7;
	return (int) (hash + getId() + radious.hashCode());
    }

    @Override
    public boolean equals(Object obj) {
	if (obj == null) {
	    return false;
	}
	if (getClass() != obj.getClass()) {
	    return false;
	}
	final Circle other = (Circle) obj;
	if (this.getId() != other.getId()) {
	    return false;
	}
	return Double.doubleToLongBits(this.radious) == Double.doubleToLongBits(other.radious);
    }

    @Override
    public String toString() {
	return "Circle{" + "id=" + getId() + ", radious=" + radious + '}';
    }
    
    public Double getRadious() {
	return radious;
    }

    public void setRadious(Double radious) {
	propertyChangeSupport.firePropertyChange("radious", this.radious, radious);
	this.radious = radious;
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener){
	propertyChangeSupport.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener(PropertyChangeListener listener){
	propertyChangeSupport.removePropertyChangeListener(listener);
    }

    //Covariant Returns
    @Override
    public Circle initShape(Object... properties) {
	if (properties.length != 2 || !(properties[0] instanceof Long)
		|| !(properties[1] instanceof Double)){
	    throw new IllegalArgumentException("Unable to Build Circle Shape. Parameters not valid");
	}
	this.radious = ((double) properties[1]);
	this.setId((long) properties[0]);
	return this;
    }
    
}
