package org.setter.dependency.injection;

import javax.swing.*;

public class Address {
    private  int Hno;
    private  String city;
    private  int pincode;

    public void setHno(int hno) {
        Hno = hno;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPincode(int pincode) {
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
