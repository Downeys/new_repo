package com.wristbandcollection.Version0001.models;

import java.util.Objects;

public class RecordingStudio {
    private Integer recordingStudioId;
    private String name;
    private Address address;
    private ContactCard contactCard;

    public RecordingStudio(){}

    public RecordingStudio(String name, Address address, ContactCard contactCard) {
        this.name = name;
        this.address = address;
        this.contactCard = contactCard;
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

    public ContactCard getContactCard() {
        return contactCard;
    }

    public void setContactCard(ContactCard contactCard) {
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
