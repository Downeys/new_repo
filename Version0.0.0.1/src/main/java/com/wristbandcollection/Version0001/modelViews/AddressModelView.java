package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class AddressModelView {
    private String street1;
    private String street2;
    private String city;
    private String state;
    private String zipCode;

    public AddressModelView(){}

    public AddressModelView(String street1, String city, String state, String zipCode) {
        this.street1 = street1;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    public AddressModelView(String street1, String street2, String city, String state, String zipCode) {
        this(street1, city, state, zipCode);
        this.street2 = street2;
    }

    public String getStreet1() {
        return street1;
    }

    public void setStreet1(String street1) {
        this.street1 = street1;
    }

    public String getStreet2() {
        return street2;
    }

    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressModelView addressModelView = (AddressModelView) o;
        return Objects.equals(street1, addressModelView.street1) && Objects.equals(street2, addressModelView.street2) && Objects.equals(city, addressModelView.city) && Objects.equals(state, addressModelView.state) && Objects.equals(zipCode, addressModelView.zipCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street1, street2, city, state, zipCode);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street1='" + street1 + '\'' +
                ", street2='" + street2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }
}
