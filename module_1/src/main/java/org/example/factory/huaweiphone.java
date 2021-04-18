package org.example.factory;

public class huaweiphone implements Productphone{
    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void end() {
        System.out.println("华为手机关机");
    }

    @Override
    public void call() {
        System.out.println("华为手机打电话");
    }
}
