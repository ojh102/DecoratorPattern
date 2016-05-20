package com.ojh.www.decoratorpattern.decorator;

import com.ojh.www.decoratorpattern.beverage.Beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }

    @Override
    public double cost() {
        return beverage.cost() + .20;
    }
}
