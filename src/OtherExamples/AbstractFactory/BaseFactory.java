package OtherExamples.AbstractFactory;

/**
 * Created by Giulio on 19/07/2016.
 */
public abstract class BaseFactory {

    abstract public AnimaleBuono sceltaBuona(String param);
    abstract public AnimaleCattivo sceltaCattiva(String param);
}
