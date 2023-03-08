//package com.vialfinaz14.Chapter13_AbstractClassesAndInterfaces.Latihan;
//
//import java.util.Timer;
//
//public class Listing7_TestEdible {
//    public static void main(String[] args) {
//        Object[] object =  {new Tiger(), new Chicken(), new Apple()};
//        for (int i = 0; i < object.length; i++) {
//            if (object[i] instanceof Edible)
//                System.out.println(((Edible) object[i]).howToEat());
//
//            if (object[i] instanceof Animal) {
//                System.out.println(((Animal) object[i]).sound());
//            }
//        }
//    }
//}
//abstract class Animal {
//    public abstract String sound();
//}
//class Chicken extends Animal implements Edible {
//    @Override
//    public String howToEat() {
//        return "Chicken: Fry it";
//    }
//    @Override
//    public String sound() {
//        return "Chicken: cock-a-doodle-doo";
//    }
//}
//class Tiger extends Animal {
//    @Override
//    public String sound() {
//        return "Toger: RROAARR";
//    }
//}
//abstract class Fruit implements Edible {
//}
//class Apple extends Fruit {
//    @Override
//    public String howToEat() {
//        return "Apple: Make apple cider";
//    }
//}
//class Orange extends Fruit {
//    @Override
//    public String howToEat() {
//        return "Orange: Make orange juice";
//    }
//}
