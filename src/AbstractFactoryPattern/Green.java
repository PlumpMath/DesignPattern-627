package AbstractFactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Green implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}
