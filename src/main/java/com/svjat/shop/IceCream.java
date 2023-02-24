package com.svjat.shop;

public class IceCream extends SweetProduct implements SolidProduct{
    public void canBeUsed() {
        System.out.println("You can eat me");
    }
}
