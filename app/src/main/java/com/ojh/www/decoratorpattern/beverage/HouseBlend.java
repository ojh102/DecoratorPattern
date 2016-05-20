package com.ojh.www.decoratorpattern.beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "하우스 블렌드 커피";
    }

    @Override
    public double cost() {
        return .89;
    }
}
