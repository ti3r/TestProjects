package org.blanco.tests.jse7;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

/**
 *
 * @author Alexandro Blanco <ti3r.bubblenet@gmail.com>
 */
public class Circle {
    
    private long id;
    private Double radious;
    private final PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    
    
    public static void main(String[] args) throws InterruptedException{
	long millis = System.currentTimeMillis();
	Thread.sleep(3000);
	System.out.println(String.format("BackgroundTasksProcessor end in : %.4f m",
		((System.currentTimeMillis()-millis)/60000.0)));
    }
    
    
    public Circle(double radious) {
	this.radious = radious;
    }

    @Override
    public int hashCode() {
	int hash = 7;
	return (int) (hash + id + radious.hashCode());
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
	if (this.id != other.id) {
	    return false;
	}
	return Double.doubleToLongBits(this.radious) == Double.doubleToLongBits(other.radious);
    }

    public long getId() {
	return id;
    }

    public void setId(long id) {
	this.id = id;
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
    
}
