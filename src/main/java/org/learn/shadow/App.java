package org.learn.shadow;

import org.learn.shadow.factory.OrderPizza;
import org.learn.shadow.factory.SimplePizzaFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OrderPizza order = new OrderPizza( new SimplePizzaFactory());
        order.orderPizza("cheese");
    }
}
