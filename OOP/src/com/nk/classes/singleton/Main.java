package com.nk.classes.singleton;

public class Main {
    //Singleton allows one instance can be created using private constructor
    // the constructor is called inside same class so we can use it.
    public static void main(String[] args) {
        Singleton s=  Singleton.getInstance();
        Singleton s1= Singleton.getInstance();
        Singleton s3= Singleton.getInstance();

    }
}
