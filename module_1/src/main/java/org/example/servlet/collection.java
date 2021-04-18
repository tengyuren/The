package org.example.servlet;

public class collection {
    //单例模式，懒汉加载
    private static collection colins;
    private collection(){
        System.out.println("私有化构造函数");
    }
    public static synchronized collection getInstance(){
        if (colins==null){
            colins=new collection();
        }else{
            System.out.println("已经被创建了");
        }
        return colins;
    }
}
