package org.learn.shadow.factory;

public class PepperoniPizza extends Pizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tPepperoni");
    }
}
