package OtherExamples.AbstractFactory;

/**
 * Created by Giulio on 19/07/2016.
 */
public class FactoryMaker {


    public BaseFactory scelta(String param){
        if (param.equals("AnimaleBuono"))
            return new AnimaleBuonoFactory();
        if (param.equals("AnimaleCattivo"))
            return new AnimaleCattivoFactory();
        return null;
    }
}
