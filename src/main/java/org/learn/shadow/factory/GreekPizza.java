package org.learn.shadow.factory;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tGreek");
    }


}
