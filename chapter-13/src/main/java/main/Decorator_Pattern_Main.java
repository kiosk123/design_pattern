package main;

import java.util.Scanner;

/**
 * 커피 제조시 에스프레소와 우유를 얼마나 넣느냐에 따라 
 * 가격이 달라짐
 *
 */
public class Decorator_Pattern_Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // base
        IBeverage beverage = new Base();
        boolean done = false;
        while (!done) {
            System.out.println("음료 현재 가격 : " + beverage.getTotalPrice());
            System.out.print("선택 : 1:샷 추가 / 2:우유 추가");
            switch (sc.nextInt()) {
            case 0:
                done = true;
                break;
            case 1:
                beverage = new Espresso(beverage);
                break;
            case 2:
                beverage = new Milk(beverage);
                break;
            }
        }

        System.out.println("음료 가격 : " + beverage.getTotalPrice());
        sc.close();
    }

}
