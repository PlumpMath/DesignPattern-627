package AbstractFactoryPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class Blue implements Color {
    @Override
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}
