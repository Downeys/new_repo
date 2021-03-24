package com.wristbandcollection.Version0001.models;

import java.net.InterfaceAddress;
import java.util.Objects;

public class ContactCard {
    private Integer contactCardId;
    private String name;
    private String phone;
    private String email;
    private Integer bandMemberId;

    public ContactCard(){}

    public ContactCard(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public Integer getContactCardId() {
        return contactCardId;
    }

    public void setContactCardId(Integer contactCardId) {
        this.contactCardId = contactCardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
