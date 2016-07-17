package StrategyPattern;

/**
 * Created by Giulio on 17/07/2016.
 */
public class OperationSubstract implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
