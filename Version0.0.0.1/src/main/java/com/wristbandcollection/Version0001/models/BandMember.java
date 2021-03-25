package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "band_member")
public class BandMember {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bandMemberId;
    private Integer hometownId;
    private Integer artistId;
    private String name;
    @ManyToOne
    @JoinColumn(name = "ownerId", referencedColumnName = "bandMemberId", nullable = false, updatable = false)
    private Hometown hometown;
    @OneToOne
    @JoinColumn(name = "contactId", referencedColumnName = "bandMemberId", nullable = false, updatable = false)
    private ContactCard contactCard;
    @ManyToMany
    @JoinColumn(name = "bandMemberId", referencedColumnName = "bandMemberId", nullable = false, insertable = false)
    private List<Artist> bands;

    public BandMember(){}

    public BandMember(String name){
        this.name = name;
    }

    public Integer getBandMemberId() {
        return bandMemberId;
    }

    public void setBandMemberId(Integer bandMemberId) {
        this.bandMemberId = bandMemberId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public Integer getHometownId() {
        return hometownId;
    }

    public void setHometownId(Integer hometownId) {
        this.hometownId = hometownId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hometown getHometown() {
        return hometown;
    }

    public void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }

    public ContactCard getContactCard() {
        return contactCard;
    }

    public void setContactCard(ContactCard contactCard) {
        this.contactCard = contactCard;
    }

    public List<Artist> getBands() {
        return bands;
    }

    public void setBands(List<Artist> bands) {
        this.bands = bands;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BandMember that = (BandMember) o;
        return Objects.equals(bandMemberId, that.bandMemberId) && Objects.equals(hometownId, that.hometownId) && Objects.equals(artistId, that.artistId) && Objects.equals(name, that.name) && Objects.equals(hometown, that.hometown) && Objects.equals(contactCard, that.contactCard) && Objects.equals(bands, that.bands);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandMemberId, hometownId, artistId, name, hometown, contactCard, bands);
    }

    @Override
    public String toString() {
        return "BandMember{" +
                "bandMemberId=" + bandMemberId +
                ", hometownId=" + hometownId +
                ", artistId=" + artistId +
                ", name='" + name + '\'' +
                ", hometown=" + hometown +
                ", contactCard=" + contactCard +
                ", bands=" + bands +
                '}';
    }
}
