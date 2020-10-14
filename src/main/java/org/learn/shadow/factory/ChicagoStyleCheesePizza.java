package org.learn.shadow.factory;

public class ChicagoStyleCheesePizza extends Pizza {
    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tChicago Style Cheese");
    }
}
