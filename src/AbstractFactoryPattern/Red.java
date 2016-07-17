package AbstractFactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}
