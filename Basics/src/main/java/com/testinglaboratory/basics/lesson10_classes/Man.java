package com.testinglaboratory.basics.lesson10_classes;

import com.github.javafaker.Faker;

public class Man extends Human {

    private  final int caughtFish = new Faker().random().nextInt(100);
    int testicles = new Faker().random().nextInt(2);
    int genitalsSize = new Faker().random().nextInt(20);

    public int getCachedFiches() {
        return caughtFish;
    }

    public int getTesticles() {
        return testicles;
    }

    public int getGenitalsSize() {
        return genitalsSize;
    }
}
