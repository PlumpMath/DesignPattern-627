package OtherExamples.Factory;

/**
 * Created by Giulio on 19/07/2016.
 */
public class Test {

    public static void main(String[] args){
        Animal pappagallo = AnimalFactory.creating("Pappagallo");
        pappagallo.show();

        Animal leone = AnimalFactory.creating("Leone");
        leone.show();

    }

}
