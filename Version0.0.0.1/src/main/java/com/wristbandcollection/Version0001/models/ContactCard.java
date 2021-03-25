package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.net.InterfaceAddress;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "contact_card")
public class ContactCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer contactCardId;
    private Integer contactId;
    private String contactType;
    private String name;
    private String phone;
    private String email;

    public ContactCard(){}

    public ContactCard(Integer contactId, String contactType, String name){
        this.contactId = contactId;
        this.contactType = contactType;
        this.name = name;
    }

    public Integer getContactCardId() {
        return contactCardId;
    }

    public void setContactCardId(Integer contactCardId) {
        this.contactCardId = contactCardId;
    }

    public Integer getContactId() {
        return contactId;
    }

    public void setContactId(Integer contactId) {
        this.contactId = contactId;
    }

    public String getContactType() {
        return contactType;
    }

    public void setContactType(String contactType) {
        this.contactType = contactType;
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
        ContactCard that = (ContactCard) o;
        return Objects.equals(contactCardId, that.contactCardId) && Objects.equals(contactId, that.contactId) && Objects.equals(contactType, that.contactType) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactCardId, contactId, contactType, name, phone, email);
    }

    @Override
    public String toString() {
        return "ContactCard{" +
                "contactCardId=" + contactCardId +
                ", contactId=" + contactId +
                ", contactType='" + contactType + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
