package OtherExamples.Factory;

/**
 * Created by Giulio on 19/07/2016.
 */
public abstract class AnimalFactory {

    public static Animal creating(String choice) {
        if (choice.equals("Leone")) {
            return new Leone();
        }
        if (choice.equals("Pappagallo")) ;{
        return new Pappagallo();
        }
    }

}
