package com.svjat.shop;

import java.util.ArrayList;
import java.util.Collection;

public class MainShop {
    public static void main(String[] args) {

        Collection listShopPart = new ArrayList();
        listShopPart.add(new AquaShopPart());
        listShopPart.add(new SweetShopPart());
        listShopPart.add(new MeatShopPart());



    }
}