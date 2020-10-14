package org.learn.shadow.factory;

public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        name = "NY Style saource and cheese pizza";
        dough = "thin crust dough";
        toppings.add("Reggiano cheese");
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tNY Style Cheese");
    }
}
