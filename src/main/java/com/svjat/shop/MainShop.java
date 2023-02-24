package com.svjat.shop;

import java.util.ArrayList;
import java.util.Collection;


public class MainShop {

    public Collection<MeatProduct> getListMeatProduct() {
        return listMeatProduct;
    }

    public Collection<MilkProduct> getListMilkProduct() {
        return listMilkProduct;
    }

    public Collection<SweetProduct> getListSweetProduct() {
        return listSweetProduct;
    }

    public Collection<RegularProduct> getListRegularProduct() {
        return listRegularProduct;
    }

    private Collection<MeatProduct> listMeatProduct = new ArrayList();
    private Collection<MilkProduct> listMilkProduct = new ArrayList();
    private Collection<SweetProduct> listSweetProduct = new ArrayList();
    private Collection<RegularProduct> listRegularProduct = new ArrayList();

    public void addProduct(Product product ) {
        if (product instanceof MeatProduct) {
            listMeatProduct.add((MeatProduct) product);
        }
        if (product instanceof MilkProduct) {
            listMilkProduct.add((MilkProduct) product);
        }
        if (product instanceof SweetProduct) {
            listSweetProduct.add((SweetProduct) product);
        }
        if (product instanceof RegularProduct) {
            listRegularProduct.add((RegularProduct) product);
        }
    }

    public String getInfo() {
        return "Product size = " + (listMeatProduct.size() + listMilkProduct.size() + listSweetProduct.size() + listRegularProduct.size());
    }

}
