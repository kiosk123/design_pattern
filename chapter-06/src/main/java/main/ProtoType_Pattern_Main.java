package main;

public class ProtoType_Pattern_Main {

    public static void main(String[] args) throws Exception {
        Circle circle1 = new Circle(1, 1, 3);
        Circle circle2 = circle1.clone();
        
        System.out.println(circle1.getPoint().getX() +
                ":" +circle1.getPoint().getY() + 
                ":" +circle1.getR());
        
        System.out.println(circle2.getPoint().getX() +
                ":" +circle2.getPoint().getY() + 
                ":" +circle2.getR());
        
        /**
         * deep copy test
         */
        circle1.getPoint().setX(3);
        circle1.getPoint().setY(2);

        System.out.println(circle1.getPoint().getX() +
                ":" +circle1.getPoint().getY() + 
                ":" +circle1.getR());
        
        System.out.println(circle2.getPoint().getX() +
                ":" +circle2.getPoint().getY() + 
                ":" +circle2.getR());
        
        /**
         * result
         * 1:1:3
           1:1:3
           3:2:3
           1:1:3
         */
    }
}
