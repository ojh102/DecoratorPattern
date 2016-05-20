package com.ojh.www.decoratorpattern.decorator;

import com.ojh.www.decoratorpattern.beverage.Beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 두유";
    }

    @Override
    public double cost() {
        return beverage.cost() + .10;
    }
}
