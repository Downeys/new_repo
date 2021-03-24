package com.wristbandcollection.Version0001.modelViews;

import com.wristbandcollection.Version0001.models.Address;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class VenueModelView {
    private Integer venueId;
    private String name;
    private com.wristbandcollection.Version0001.models.Address address;
    private List<ContactCardModelView> contactCardModelViews;
    private List<ShowModelView> showModelViews;
    private LocalDate dateOpened;
    private LocalDate dateClosed;

    public VenueModelView(){}

    public VenueModelView(String name, com.wristbandcollection.Version0001.models.Address address) {
        this.name = name;
        this.address = address;
    }

    public Integer getVenueId() {
        return venueId;
    }

    public void setVenueId(Integer venueId) {
        this.venueId = venueId;
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

    public List<ContactCardModelView> getContactCards() {
        return contactCardModelViews;
    }

    public void setContactCards(List<ContactCardModelView> contactCardModelViews) {
        this.contactCardModelViews = contactCardModelViews;
    }

    public List<ShowModelView> getShows() {
        return showModelViews;
    }

    public void setShows(List<ShowModelView> showModelViews) {
        this.showModelViews = showModelViews;
    }

    public LocalDate getDateOpened() {
        return dateOpened;
    }

    public void setDateOpened(LocalDate dateOpened) {
        this.dateOpened = dateOpened;
    }

    public LocalDate getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(LocalDate dateClosed) {
        this.dateClosed = dateClosed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VenueModelView venueModelView = (VenueModelView) o;
        return Objects.equals(venueId, venueModelView.venueId) && Objects.equals(name, venueModelView.name) && Objects.equals(address, venueModelView.address) && Objects.equals(contactCardModelViews, venueModelView.contactCardModelViews) && Objects.equals(showModelViews, venueModelView.showModelViews) && Objects.equals(dateOpened, venueModelView.dateOpened) && Objects.equals(dateClosed, venueModelView.dateClosed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, name, address, contactCardModelViews, showModelViews, dateOpened, dateClosed);
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contactCards=" + contactCardModelViews +
                ", shows=" + showModelViews +
                ", dateOpened=" + dateOpened +
                ", dateClosed=" + dateClosed +
                '}';
    }
}
