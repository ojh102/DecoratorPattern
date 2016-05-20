package com.ojh.www.decoratorpattern.beverage;

/**
 * Created by JaeHwan Oh on 2016-05-20.
 */
public abstract class Beverage {
    String description = "제목 없음";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
