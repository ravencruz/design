package org.learn.shadow.factory;

public class OrderPizza {

    private SimplePizzaFactory factory;

    /** Object composition allow us to change behavior dynamically at runtime **/
    public OrderPizza(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    /**
     * Only cares about it is get a pizza
     * By encapsulating the pizza creating in one class
     * we now have only one place to make modificatios when the implemenation changes
     *
     * Podrias hacerlo statico ? si, pero no olvides que la desventaja es que no podrias crear una sublclase y
     * cambiar el comportamiento
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
