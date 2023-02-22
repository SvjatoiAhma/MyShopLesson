package com.svjat.shop;

public class AquaProduct extends Product implements Volume{
    @Override
    public void canBeUsed() {
        System.out.println("Drink");

    }
}
