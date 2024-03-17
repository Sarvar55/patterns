package com.sarvar.prototype;

public class Main {
    public static void main(String[] args) {
        Resume resume = new Resume("John Doe", "john@example.com", "5 years of experience");

        try {
            Resume anotherResume = resume.clone();

            anotherResume.setEmail("sarvarmusazade@gmail.com");

            System.out.println(resume.hashCode());
            System.out.println(anotherResume.hashCode());

            System.out.println(anotherResume.getEmail());
            System.out.println(resume.getEmail());
            resume.setEmail("skdfjnsjkdf");
            System.out.println(anotherResume.getEmail());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
