package com.nk.Enums;

public class EnumDemo {
    //these are Enum constants
//  They are public static and final
//    internally public static final Week Monday= new Week();
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        Week(){
            System.out.println("Constructor "+ this);
        }
//        this is default or private we don't want to create objects
//        everytime a single constant is called constructor runs for all the constants
    }

    public static void main(String[] args) {
       Week weekday;
       weekday= Week.Monday;
//       for( Week day :Week.values()){
//           System.out.println(day);
//       }
//        System.out.println(weekday);
//        System.out.println(weekday.ordinal());

    }
}
