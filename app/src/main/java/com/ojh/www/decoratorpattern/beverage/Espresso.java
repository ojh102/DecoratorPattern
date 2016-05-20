package com.ojh.www.decoratorpattern.beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public class Espresso extends Beverage {
    public Espresso() {
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
