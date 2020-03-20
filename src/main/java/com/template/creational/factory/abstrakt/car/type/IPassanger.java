package com.template.creational.factory.abstrakt.car.type;

import com.template.creational.factory.abstrakt.car.Car;

/**
 * @author Oleksiy Zhurko
 */
public interface IPassanger extends Car {
    /**
     * type - type of this car
     */
    TypeCar type = TypeCar.PASSANGER;
}
