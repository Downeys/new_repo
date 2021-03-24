package com.wristbandcollection.Version0001.modelViews;

import com.wristbandcollection.Version0001.models.Address;

import java.util.Objects;

public class RecordingStudioModelView {
    private Integer recordingStudioId;
    private String name;
    private com.wristbandcollection.Version0001.models.Address address;
    private ContactCardModelView contactCardModelView;

    public RecordingStudioModelView(){}

    public RecordingStudioModelView(String name, com.wristbandcollection.Version0001.models.Address address, ContactCardModelView contactCardModelView) {
        this.name = name;
        this.address = address;
        this.contactCardModelView = contactCardModelView;
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

    public com.wristbandcollection.Version0001.models.Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactCardModelView getContactCard() {
        return contactCardModelView;
    }

    public void setContactCard(ContactCardModelView contactCardModelView) {
        this.contactCardModelView = contactCardModelView;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordingStudioModelView that = (RecordingStudioModelView) o;
        return Objects.equals(recordingStudioId, that.recordingStudioId) && Objects.equals(name, that.name) && Objects.equals(address, that.address) && Objects.equals(contactCardModelView, that.contactCardModelView);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingStudioId, name, address, contactCardModelView);
    }

    @Override
    public String toString() {
        return "RecordingStudio{" +
                "recordingStudioId=" + recordingStudioId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contactCard=" + contactCardModelView +
                '}';
    }
}
