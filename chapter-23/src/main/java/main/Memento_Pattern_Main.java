package main;

import java.util.Stack;

import main.memento.Memento;
import main.memento.Originator;

/**
 * 객체의 상태를 저장하고 이전 상태로 복구한다.
 * @author USER
 *
 */
public class Memento_Pattern_Main {
    public static void main(String[] args) {
        Stack<Memento> mementos = new Stack<>();
        
        Originator originator = new Originator();
        originator.setState("state 1");
        mementos.push(originator.createMemento());
        
        originator.setState("state 2");
        mementos.push(originator.createMemento());
        
        originator.setState("state 3");
        mementos.push(originator.createMemento());
        
        originator.setState("state final");
        mementos.push(originator.createMemento());
        
//        Memento memento = new Memento();
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMement(mementos.pop());
        System.out.println(originator.getState());
    }
}
