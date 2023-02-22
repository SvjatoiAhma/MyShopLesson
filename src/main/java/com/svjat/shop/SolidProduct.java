package com.svjat.shop;

public class SolidProduct extends Product implements Weight{
    @Override
    public void canBeUsed() {
        System.out.println("Eat");

    }
}
