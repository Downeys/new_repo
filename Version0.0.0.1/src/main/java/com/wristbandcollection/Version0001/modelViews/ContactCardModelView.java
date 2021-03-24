package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class ContactCardModelView {
    private Integer contactCardId;
    private String name;
    private String phone;
    private String email;

    public ContactCardModelView(){}

    public ContactCardModelView(String name, String phone, String email) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactCardModelView that = (ContactCardModelView) o;
        return Objects.equals(contactCardId, that.contactCardId) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactCardId, name, phone, email);
    }

    @Override
    public String toString() {
        return "ContactCard{" +
                "contactCardId=" + contactCardId +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
