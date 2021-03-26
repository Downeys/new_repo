package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "hometown")
public class Hometown {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer hometownId;
    private String hometownName;
    private String ownerType;

    @OneToMany(mappedBy = "hometown")//checked
    private List<BandMember> bandMembersFromHometown;

    @OneToMany(mappedBy = "hometown") //checked
    private List<Artist> bandsFromHometown;

    public Hometown(){}

    public Hometown(String hometownName) {
        this.hometownName = hometownName;
    }

    public Integer getHometownId() {
        return hometownId;
    }

    public void setHometownId(Integer hometownId) {
        this.hometownId = hometownId;
    }

    public String getHometownName() {
        return hometownName;
    }

    public void setHometownName(String hometownName) {
        this.hometownName = hometownName;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public List<BandMember> getBandMembersFromHometown() {
        return bandMembersFromHometown;
    }

    public void setBandMembersFromHometown(List<BandMember> bandMembersFromHometown) {
        this.bandMembersFromHometown = bandMembersFromHometown;
    }

    public List<Artist> getBandsFromHometown() {
        return bandsFromHometown;
    }

    public void setBandsFromHometown(List<Artist> bandsFromHometown) {
        this.bandsFromHometown = bandsFromHometown;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hometown hometown = (Hometown) o;
        return Objects.equals(hometownId, hometown.hometownId) && Objects.equals(hometownName, hometown.hometownName) && Objects.equals(ownerType, hometown.ownerType) && Objects.equals(bandMembersFromHometown, hometown.bandMembersFromHometown) && Objects.equals(bandsFromHometown, hometown.bandsFromHometown);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hometownId, hometownName, ownerType, bandMembersFromHometown, bandsFromHometown);
    }

    @Override
    public String toString() {
        return "Hometown{" +
                "hometownId=" + hometownId +
                ", hometownName='" + hometownName + '\'' +
                ", ownerType='" + ownerType + '\'' +
                ", bandMembersFromHometown=" + bandMembersFromHometown +
                ", bandsFromHometown=" + bandsFromHometown +
                '}';
    }
}
