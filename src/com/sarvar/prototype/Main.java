package com.sarvar.prototype;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume("John Doe", "john@example.com", "5 years of experience");

        try {
            Resume anotherResume = (Resume) resume.clone();

            anotherResume.setEmail("sarvarmusazade@gmail.com");
            System.out.println(resume.getEmail());
            System.out.println(anotherResume.getEmail());

            Example example = new Example(10);

            Example example1 = example.clone();

            example1.setNumber(22);

            System.out.println(example.getNumber());
            System.out.println(example1.getNumber());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
