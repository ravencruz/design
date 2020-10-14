package org.learn.shadow;

import org.learn.shadow.factory.ChicagoPizzaStore;
import org.learn.shadow.factory.NYPizzaStore;
import org.learn.shadow.factory.PizzaStore;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PizzaStore order = new NYPizzaStore();//new PizzaStore( new SimplePizzaFactory());
        order.orderPizza("cheese");

        PizzaStore order2 = new ChicagoPizzaStore();
        order2.orderPizza("cheese");
    }
}
