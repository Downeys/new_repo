package com.wristbandcollection.Version0001.modelViews;

import java.util.Objects;

public class BandMemberModelView {
    private Integer bandMemberId;
    private String name;
    private String hometown;
    private ContactCardModelView contactCardModelView;

    public BandMemberModelView(){}

    public BandMemberModelView(String name, String hometown, ContactCardModelView contactCardModelView) {
        this.name = name;
        this.hometown = hometown;
        this.contactCardModelView = contactCardModelView;
    }

    public Integer getBandMemberId() {
        return bandMemberId;
    }

    public void setBandMemberId(Integer bandMemberId) {
        this.bandMemberId = bandMemberId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
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
        BandMemberModelView that = (BandMemberModelView) o;
        return Objects.equals(bandMemberId, that.bandMemberId) && Objects.equals(name, that.name) && Objects.equals(hometown, that.hometown) && Objects.equals(contactCardModelView, that.contactCardModelView);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bandMemberId, name, hometown, contactCardModelView);
    }

    @Override
    public String toString() {
        return "BandMember{" +
                "bandMemberId=" + bandMemberId +
                ", name='" + name + '\'' +
                ", hometown='" + hometown + '\'' +
                ", contactCard=" + contactCardModelView +
                '}';
    }
}
