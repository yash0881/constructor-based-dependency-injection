package org.setter.dependency.injection;

public class Student {
    private String name;
    private int roll;
    private  Address address;

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", address=" + address +
                '}';
    }
}
