package org.launchcode.java.demos.lsn6inheritance;

public class Main {
    public static void main(String[] args) {
//        Cat someCat = new Cat(10);
//        System.out.println(someCat.getWeight());
//        System.out.println(someCat.getFamily());

        HouseCat garfield = new HouseCat("Garfield", 12);
        garfield.eat();
        System.out.println(garfield.isTired());   // prints true
        System.out.println(garfield.getWeight());
        System.out.println(garfield.getFamily());
        garfield.setFamily("Barn Cat");
        System.out.println(garfield.getFamily());

        HouseCat felix = new HouseCat("Felix", 6, "Cartoon Cat");
        System.out.println(felix.getWeight());
        System.out.println(felix.getFamily());

        HouseCat nyanCat = new HouseCat(0);
        System.out.println(nyanCat.getWeight());

        Cat gatoDeLoco = new Cat();
        System.out.println(gatoDeLoco.getWeight());
    }
}
