package Rooms;

public class Person {
    private final int ID;
    private final String NAME;
    private final int SIN;
    private final int AGE;

    public Person(int id, String name, int sin, int age) {
        ID = id;
        NAME = name;
        SIN = sin;
        AGE = age;
    }


    public String getName() {
        return NAME;
    }

    public int getID(){
        return this.ID;
    }

    public int getAge(){
        return this.AGE;
    }

    public int getSin(){
        return this.SIN;
    }
}
