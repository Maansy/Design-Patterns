package Decoratorpattern;

public class Espresso extends Beverage {
    public Espresso() {
        description = "Espressp";
    }

    public double cost() {
        return 1.99;
    }
}
