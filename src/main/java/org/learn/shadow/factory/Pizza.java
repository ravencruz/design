package org.learn.shadow.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {

    protected String name;
    protected String dough;
    protected String source;
    List<String> toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name);
    }

    public void bake() {
        System.out.println("bake for 20 mins");
    }

    public void cut() {
        System.out.println("Cut");
    }

    public void box() {
        System.out.println("Box in official PizzaStore box");
    }
}
