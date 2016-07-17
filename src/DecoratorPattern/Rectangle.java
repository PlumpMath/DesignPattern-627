package DecoratorPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
