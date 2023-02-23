package com.svjat.shop;

public class Milk extends MilkProduct implements Aqua, CanBeUsed {
       @Override
    public void canBeUsed() {
            System.out.println("You can drink me");
    }
}
