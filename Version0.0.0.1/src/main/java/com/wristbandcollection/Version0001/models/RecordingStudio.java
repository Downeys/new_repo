package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "recording_studio")
public class RecordingStudio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer recordingStudioId;
    private String name;
    @OneToOne
    @JoinColumn(name = "ownerId", referencedColumnName = "recordingStudioId", nullable = false, insertable = false)
    private Address address;
    @OneToMany
    @JoinColumn(name = "contactId", referencedColumnName = "recordingStudioId", nullable = false, insertable = false)
    private List<ContactCard> contactCard;

    public RecordingStudio(){}

    public RecordingStudio(String name) {
        this.name = name;
    }

    public Integer getRecordingStudioId() {
        return recordingStudioId;
    }

    public void setRecordingStudioId(Integer recordingStudioId) {
        this.recordingStudioId = recordingStudioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ContactCard> getContactCard() {
        return contactCard;
    }

    public void setContactCard(List<ContactCard> contactCard) {
        this.contactCard = contactCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordingStudio that = (RecordingStudio) o;
        return Objects.equals(recordingStudioId, that.recordingStudioId) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(contactCard, that.contactCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingStudioId, name, address, contactCard);
    }

    @Override
    public String toString() {
        return "RecordingStudio{" +
                "recordingStudioId=" + recordingStudioId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contactCard=" + contactCard +
                '}';
    }
}
