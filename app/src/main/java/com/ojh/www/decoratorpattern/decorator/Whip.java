package com.ojh.www.decoratorpattern.decorator;

import com.ojh.www.decoratorpattern.beverage.Beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑 크림";
    }

    @Override
    public double cost() {
        return beverage.cost() + .15;
    }
}
