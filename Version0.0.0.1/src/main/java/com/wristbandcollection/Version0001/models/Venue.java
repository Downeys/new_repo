package com.wristbandcollection.Version0001.models;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Venue {
    private Integer venueId;
    private String name;
    private Address address;
    private List<ContactCard> contactCards;
    private List<Show> shows;
    private LocalDate dateOpened;
    private LocalDate dateClosed;

    public Venue(){}

    public Venue(String name, Address address) {
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

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<ContactCard> getContactCards() {
        return contactCards;
    }

    public void setContactCards(List<ContactCard> contactCards) {
        this.contactCards = contactCards;
    }

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
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
        Venue venue = (Venue) o;
        return Objects.equals(venueId, venue.venueId) && Objects.equals(name, venue.name) && Objects.equals(address, venue.address) && Objects.equals(contactCards, venue.contactCards) && Objects.equals(shows, venue.shows) && Objects.equals(dateOpened, venue.dateOpened) && Objects.equals(dateClosed, venue.dateClosed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, name, address, contactCards, shows, dateOpened, dateClosed);
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", name='" + name + '\'' +
                ", address=" + address +
                ", contactCards=" + contactCards +
                ", shows=" + shows +
                ", dateOpened=" + dateOpened +
                ", dateClosed=" + dateClosed +
                '}';
    }
}
