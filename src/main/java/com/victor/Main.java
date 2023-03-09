package com.victor;

import examples.generics.MaxKt;
import examples.java.PersonJava;

public class Main {
    public static void main(String[] args) {
        PersonJava person = new PersonJava("Victor", "Hugo");
        System.out.println(person.getFirstName());

        Integer max = MaxKt.max(1, 2);
        System.out.println(max);
    }
}
