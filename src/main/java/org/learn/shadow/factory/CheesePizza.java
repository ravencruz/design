package org.learn.shadow.factory;

public class CheesePizza extends Pizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tCheese");
    }
}
