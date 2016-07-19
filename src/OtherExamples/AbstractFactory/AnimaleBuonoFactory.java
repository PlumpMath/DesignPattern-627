package OtherExamples.AbstractFactory;

/**
 * Created by Giulio on 19/07/2016.
 */
public class AnimaleBuonoFactory extends BaseFactory{

    @Override
    public AnimaleBuono sceltaBuona(String param) {
        if (param.equals("Cane")){
            return new Cane();
        }
        if (param.equals("Gabbiano")){
            return new Gabbiano();
        }
        return null;
    }

    @Override
    public AnimaleCattivo sceltaCattiva(String param) {
        return null;
    }
}
