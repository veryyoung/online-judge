package me.veryyoung.oj.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 853. Car Fleet
 * https://leetcode.com/problems/car-fleet/
 */
public class CarFleet {

    /**
     * Define an object Car, which filed is position、speed、time (target - position) / speed
     * Sort the Car list by position in ascending order
     * Traversal the cars in reverse order, if a car's reach time is bigger than the front one, the fleets and one
     */
    public int carFleet(int target, int[] position, int[] speed) {
        Car[] cars = new Car[position.length];

        for (int i = 0; i < position.length; i++) {
            cars[i] = new Car(position[i], speed[i], (double) (target - position[i]) / speed[i]);
        }
        Arrays.sort(cars, Comparator.comparingInt(car -> car.position));

        int fleets = 1;
        double lastTime = cars[cars.length - 1].time;
        for (int i = cars.length - 2; i >= 0; i--) {
            if (cars[i].time > lastTime) {
                fleets++;
                lastTime = cars[i].time;
            }
        }

        return fleets;
    }

    private class Car {

        public int position;

        public int speed;

        public double time;

        public Car(int position, int speed, double time) {
            this.position = position;
            this.speed = speed;
            this.time = time;
        }

    }

}
