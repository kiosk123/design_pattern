package main;

import main.system.Facade;

/**
 * 서브 시스템의 복잡한 과정 
 * 대신 처리
 *
 */
public class Facade_Pattern_Main {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.process();
    }
}
