package org.learn.shadow.factory;

public class ClamPizza extends Pizza {

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\tClam");
    }

}
