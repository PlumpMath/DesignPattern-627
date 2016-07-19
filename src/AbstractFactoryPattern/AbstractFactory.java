package AbstractFactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public abstract class AbstractFactory {

    abstract Color getColor(String color);
    abstract Shape getShape(String shape);

}
