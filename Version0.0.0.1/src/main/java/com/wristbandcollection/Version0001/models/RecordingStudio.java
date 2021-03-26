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

    @OneToMany(mappedBy = "recordingStudio")
    private List<Song> songs;

    @OneToOne //checked
    @JoinColumn(name = "addressId", referencedColumnName = "addressId")
    private Address address;

    @OneToOne //checked
    @JoinColumn(name = "websiteListingId", referencedColumnName = "websiteListingId")
    private WebListing webListing;

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

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordingStudio that = (RecordingStudio) o;
        return Objects.equals(recordingStudioId, that.recordingStudioId) && Objects.equals(name, that.name) && Objects.equals(contactCard, that.contactCard) && Objects.equals(songs, that.songs) && Objects.equals(address, that.address) && Objects.equals(webListing, that.webListing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingStudioId, name, contactCard, songs, address, webListing);
    }

    @Override
    public String toString() {
        return "RecordingStudio{" +
                "recordingStudioId=" + recordingStudioId +
                ", name='" + name + '\'' +
                ", contactCard=" + contactCard +
                ", songs=" + songs +
                ", address=" + address +
                ", webListing=" + webListing +
                '}';
    }
}
