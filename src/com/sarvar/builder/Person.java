package com.sarvar.builder;

public class Person {
    private String name;
    private String surname;
    private int age;

    private Person(Builder builder) {
        /*
        *By making the constructor private, we ensure that only way to create a `Person`
         object is by using the `Builder` class, which provides a more flexible adn readable way to construct `Person` instance.
        * */
        this.name = builder.name;
        this.age = builder.age;
        this.surname = builder.surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String surname;
        private int age;

        public Builder() {

        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
