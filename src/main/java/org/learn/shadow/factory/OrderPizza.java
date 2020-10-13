package org.learn.shadow.factory;

public class OrderPizza {

    private SimplePizzaFactory factory = new SimplePizzaFactory();

    /**
     * Only cares about it is get a pizza
     * @param type
     * @return
     */
    public Pizza orderPizza(String type) {
        Pizza pizza = factory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
