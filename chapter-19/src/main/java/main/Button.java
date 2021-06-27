package main;

import java.util.Observable;

/**
 * 
 * Observable 상속이기 때문에 확장이 힘듬
 *
 */
public class Button extends Observable {   
    public void click() {
        setChanged();
        notifyObservers();
    }
}
