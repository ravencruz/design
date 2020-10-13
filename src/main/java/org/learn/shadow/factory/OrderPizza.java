package org.learn.shadow.factory;

public class OrderPizza {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();

        } else if (type.equals("greek")) {
            pizza = new GreekPizza();

        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();

        } else {
            pizza = new Pizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
