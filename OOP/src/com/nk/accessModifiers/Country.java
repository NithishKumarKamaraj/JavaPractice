package com.nk.accessModifiers;

public class Country {
    String name;
    int pop;
    String lang;
    String song;
//    public can be accessed any where
    public  void name(String name){
        this.name =name;
        System.out.println(name);
    }
//    private can be accessed only with the same class
    private  void population(int pop){
        this.pop= pop;
        System.out.println(pop);
    }
//  protected can be accessed with same packages and subclasses of differnt packages
    protected  void lang(String lang){
        this.lang=lang;
        System.out.println(lang);

        }
        //        default can be accessed only within the packages
    void song(String song){
        this.song=song;
        System.out.println(song);
    }
}
