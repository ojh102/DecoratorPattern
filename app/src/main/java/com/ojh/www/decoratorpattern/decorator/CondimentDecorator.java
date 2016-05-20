package com.ojh.www.decoratorpattern.decorator;

import com.ojh.www.decoratorpattern.beverage.Beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
