package org.setter.dependency.injection;

import javax.swing.*;

public class Address {
    private  int Hno;
    private  String city;
    private  int pincode;


    public Address(int hno, String city, int pincode) {
        Hno = hno;
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "Hno=" + Hno +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
