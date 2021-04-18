package org.example.factory;

public class huaweiroute implements ProductRoute{
    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void end() {
        System.out.println("华为路由器关机");
    }

    @Override
    public void wifi() {
        System.out.println("华为路由器wifi");
    }
}
