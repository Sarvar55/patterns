package com.sarvar.prototype;

public class Example implements Cloneable {
    Integer number;

    public Example(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    @Override
    protected Example clone() throws CloneNotSupportedException {
        return (Example) super.clone();
    }
}
