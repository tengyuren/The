package org.example.factory;

public class xiaomifactory implements Factory{
    @Override
    public Productphone productphone() {
        return new xiaomiphone();
    }

    @Override
    public ProductRoute productroute() {
        return new xiaomiroute();
    }
}
