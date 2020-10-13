package org.learn.shadow.factory;

public class VeggiePizza extends Pizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tVeggie");
    }

}
