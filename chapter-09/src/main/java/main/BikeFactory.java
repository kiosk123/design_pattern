package main;

/**
 * 부품 생성
 *
 */
public interface BikeFactory {
    public Body createBody();
    public Wheel createWheel();
}
