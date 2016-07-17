package FactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class FactoryPatternDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        //get an object of FactoryPattern.Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        //call draw method of FactoryPattern.Circle
        shape1.draw();

        //get an object of FactoryPattern.Rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        //call draw method of FactoryPattern.Rectangle
        shape2.draw();

        //get an object of FactoryPattern.Square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        //call draw method of circle
        shape3.draw();
    }

}
