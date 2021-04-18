package org.example.factory;

public class xiaomiphone implements Productphone{
    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void end() {
        System.out.println("小米手机关机");
    }

    @Override
    public void call() {
        System.out.println("小米手机打电话");
    }
}
