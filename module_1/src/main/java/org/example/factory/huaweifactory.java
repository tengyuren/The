package org.example.factory;

public class huaweifactory implements Factory{
    @Override
    public Productphone productphone() {
        return new huaweiphone();
    }

    @Override
    public ProductRoute productroute() {
        return new huaweiroute();
    }
}
