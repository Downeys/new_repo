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
    private String contactType;
    private String name;
    private String phone;
    private String email;

    @ManyToOne //checked
    @JoinColumn(name = "recordingStudioId", referencedColumnName = "recordingStudioId")
    private RecordingStudio recordingStudio;

    @ManyToOne //checked
    @JoinColumn(name = "venueId", referencedColumnName = "venueId")
    private Venue venue;

    public ContactCard(){}

    public Integer getContactCardId() {
        return contactCardId;
    }

    public void setContactCardId(Integer contactCardId) {
        this.contactCardId = contactCardId;
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

    public RecordingStudio getRecordingStudio() {
        return recordingStudio;
    }

    public void setRecordingStudio(RecordingStudio recordingStudio) {
        this.recordingStudio = recordingStudio;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ContactCard that = (ContactCard) o;
        return Objects.equals(contactCardId, that.contactCardId) && Objects.equals(contactType, that.contactType) && Objects.equals(name, that.name) && Objects.equals(phone, that.phone) && Objects.equals(email, that.email) && Objects.equals(recordingStudio, that.recordingStudio) && Objects.equals(venue, that.venue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contactCardId, contactType, name, phone, email, recordingStudio, venue);
    }

    @Override
    public String toString() {
        return "ContactCard{" +
                "contactCardId=" + contactCardId +
                ", contactType='" + contactType + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", recordingStudio=" + recordingStudio +
                ", venue=" + venue +
                '}';
    }
}
