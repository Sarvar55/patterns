package com.sarvar.prototype;

public class Resume implements Cloneable {
    private String name;
    private String email;
    private String experience;


    public Resume(String name, String email, String experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    protected Resume clone() throws CloneNotSupportedException {
        return (Resume) super.clone();
    }

}
