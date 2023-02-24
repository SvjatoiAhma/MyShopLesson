package com.svjat.shop;

import java.util.ArrayList;
import java.util.Collection;

public class StartPoint{
    public static void main(String[] args) {

        MainShop mainShop = new MainShop();

        Milk milk = new Milk();
        milk.canBeUsed();
        CocaCola cola = new CocaCola();
        cola.canBeUsed();
        IceCream iceCream = new IceCream();
        iceCream.canBeUsed();


        System.out.println(mainShop.getInfo());
    }

}