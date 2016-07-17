package FactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside FactoryPattern.Square::draw() method.");
    }
}
