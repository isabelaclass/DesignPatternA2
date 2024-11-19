package org.example;

public class Singleton {

    private static Singleton instance;
    String  name;
    boolean active;
    int     number;

    private Singleton(String name, boolean active, int number) {

        try {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex){
                ex.printStackTrace();
        }

        this.name = name;
        this.active = active;
        this.number = number;

    }

    public static Singleton getInstance(String name, boolean active, int number) {

        if (instance == null) {
            instance = new Singleton(name, active, number);
        }

        return instance;
    }
}
