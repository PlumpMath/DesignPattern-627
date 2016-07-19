package OtherExamples.AbstractFactory;

/**
 * Created by Giulio on 19/07/2016.
 */
public class Test {

    public static void main(String[] args){
        BaseFactory baseFactory = new AnimaleBuonoFactory();

        AnimaleBuono gabbiano = baseFactory.sceltaBuona("Gabbiano");
        gabbiano.canta();
    }

}
