package com.svjat.shop;

public abstract class Product implements Price, CanBeUsed{

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
