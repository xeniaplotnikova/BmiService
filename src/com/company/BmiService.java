package com.company;

public class BmiService {
    public double calculate(double weight, double height) {
        double index = weight/height;
        return index;
    }
}
