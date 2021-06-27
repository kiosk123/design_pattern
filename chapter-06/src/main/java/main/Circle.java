package main;

public class Circle implements Cloneable {
    private Point point;
    private int r;
    

    /**
     * deep copy
     */
    @Override
    protected Circle clone() throws CloneNotSupportedException {
        Circle circle = (Circle)super.clone();
        Point point = (Point)this.point.clone();
        circle.setPoint(point);
        return circle;
    }
    
    public Circle(int x, int y, int r) {
        this.point = new Point(x, y);
        this.r = r;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
}
