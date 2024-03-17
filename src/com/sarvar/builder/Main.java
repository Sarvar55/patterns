package com.sarvar.builder;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .age(22)
                .name("Sarvar")
                .surname("Musazade")
                .build();
        System.out.println(person.getAge());
    }
}
