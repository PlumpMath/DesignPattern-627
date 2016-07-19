package OtherExamples.AbstractFactory;

/**
 * Created by Giulio on 19/07/2016.
 */
public class AnimaleCattivoFactory extends BaseFactory{

    @Override
    public AnimaleBuono sceltaBuona(String param) {
        return null;
    }

    @Override
    public AnimaleCattivo sceltaCattiva(String param) {
        if (param.equals("Ponga")){
            return new Ponga();
        }
        if (param.equals("Pollo")){
            return new Pollo();
        }
        return null;
    }
}
