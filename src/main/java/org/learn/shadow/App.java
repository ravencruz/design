package org.learn.shadow;

import org.learn.shadow.factory.OrderPizza;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        OrderPizza order = new OrderPizza();
        order.orderPizza();
    }
}
