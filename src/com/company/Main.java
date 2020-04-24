package com.company;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 180.0;
        double height = 90.0;
        double index = service.calculate(weight, height);
        System.out.println(index);
    }
}
