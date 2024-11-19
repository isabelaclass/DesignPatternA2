package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            Singleton singleton = Singleton.getInstance("Isa", true, 1);
            Singleton singletonFake = Singleton.getInstance("Fake", false, 2);
            Singleton singletonFakeDois = Singleton.getInstance("Dois", true, 3);

            System.out.println(singleton.name);
            System.out.println(singleton.active);
            System.out.println(singleton.number);

            System.out.println(singletonFake.name);
            System.out.println(singletonFake.active);
            System.out.println(singletonFake.number);

            System.out.println(singletonFakeDois.name);
            System.out.println(singletonFakeDois.active);
            System.out.println(singletonFakeDois.number);
    }
}