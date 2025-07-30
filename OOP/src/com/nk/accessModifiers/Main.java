package com.nk.accessModifiers;

public class Main {
    public static void main(String[] args) {

        String names = "India";
        int popu = 7881221;
        String langs = "Tamil";
        String songs="Jana ga mana";
        Country country = new Country();
        country.lang(langs);
        country.name(names);
//        country.pop(popu);
        country.song(songs);
    }
}
