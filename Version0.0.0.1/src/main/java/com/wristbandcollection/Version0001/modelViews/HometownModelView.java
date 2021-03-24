package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class HometownModelView {
    private Integer hometownId;
    private String hometownName;
    private String hometownZip;

    public HometownModelView(){}

    public HometownModelView(String hometownName) {
        this.hometownName = hometownName;
    }

    public HometownModelView(String hometownName, String hometownZip) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HometownModelView hometownModelView = (HometownModelView) o;
        return Objects.equals(hometownId, hometownModelView.hometownId) && Objects.equals(hometownName, hometownModelView.hometownName) && Objects.equals(hometownZip, hometownModelView.hometownZip);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hometownId, hometownName, hometownZip);
    }

    @Override
    public String toString() {
        return "Hometown{" +
                "hometownId=" + hometownId +
                ", hometownName='" + hometownName + '\'' +
                ", hometownZip='" + hometownZip + '\'' +
                '}';
    }
}
