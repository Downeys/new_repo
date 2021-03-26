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

    @OneToMany(mappedBy = "recordingStudio")
    private List<ContactCard> contactCard;

    @OneToOne //checked
    @JoinColumn(name = "addressId", referencedColumnName = "addressId", nullable = false, insertable = false)
    private Address address;

    @OneToOne //checked
    @JoinColumn(name = "websiteListingId", referencedColumnName = "websiteListingId", nullable = false, insertable = false)
    private WebListing webListing;


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

    public List<ContactCard> getContactCard() {
        return contactCard;
    }

    public void setContactCard(List<ContactCard> contactCard) {
        this.contactCard = contactCard;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public WebListing getWebListing() {
        return webListing;
    }

    public void setWebListing(WebListing webListing) {
        this.webListing = webListing;
    }

    @Override
    public String toString() {
        return "RecordingStudio{" +
                "recordingStudioId=" + recordingStudioId +
                ", name='" + name + '\'' +
                ", contactCard=" + contactCard +
                ", address=" + address +
                ", webListing=" + webListing +
                '}';
    }
}
