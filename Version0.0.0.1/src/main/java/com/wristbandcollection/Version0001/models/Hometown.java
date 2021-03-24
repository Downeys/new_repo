package com.wristbandcollection.Version0001.models;

import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;
import java.util.Objects;

public class Hometown {
    private Integer hometownId;
    private String hometownName;
    private String hometownZip;
    private Integer artistId;
    private Integer bandMemberId;
    @OneToMany
    @JoinColumn(name = "hometownId", referencedColumnName = "hometownId", nullable = false, updatable = false)
    private List<Artist> bandsFromHometown;

    public Hometown(){}

    public Hometown(String hometownName) {
        this.hometownName = hometownName;
    }

    public Hometown(String hometownName, String hometownZip) {
        this.hometownName = hometownName;
        this.hometownZip = hometownZip;
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

    public String getHometownZip() {
        return hometownZip;
    }

    public void setHometownZip(String hometownZip) {
        this.hometownZip = hometownZip;
    }

}
