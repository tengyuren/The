package org.example.factory;

public class xiaomiroute implements ProductRoute{
    @Override
    public void start() {
        System.out.println("小米路由器开机");
    }

    @Override
    public void end() {
        System.out.println("小米路由器关机");
    }

    @Override
    public void wifi() {
        System.out.println("小米路由器wifi");
    }
}
