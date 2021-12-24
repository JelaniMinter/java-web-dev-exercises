package org.launchcode.java.demos.lsn6inheritance;

public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";
    private String family = "House Cat";

    public HouseCat(double aWeight) {
        super(aWeight);
    }

    public HouseCat(String aName, double aWeight) {
        super(aWeight);
        name = aName;
    }

    public HouseCat(String aName, double aWeight, String afamily) {
        super(aWeight);
        name = aName;
        family = afamily;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }

    public String purr() {
        return "I'm a HouseCat";
    }

    @Override
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }
}
