package com.svjat.shop;

import java.util.ArrayList;
import java.util.Collection;

public class StartPoint {
    public static void main(String[] args) {

        Collection listShopPart = new ArrayList();
        listShopPart.add(new AquaShopPart());
        listShopPart.add(new SweetProductShopPart());
        listShopPart.add(new MeatShopPart());

    }
}