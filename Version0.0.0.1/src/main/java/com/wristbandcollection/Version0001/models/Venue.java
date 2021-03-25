package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "venue")
public class Venue {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer venueId;
    private String name;
    private LocalDate dateOpened;
    private LocalDate dateClosed;
    @OneToOne
    @JoinColumn(name = "ownerId", referencedColumnName = "venueId", nullable = false, insertable = false)
    private Address address;
    @OneToMany
    @JoinColumn(name = "contactId", referencedColumnName = "venueId", nullable = false, insertable = false)
    private List<ContactCard> contactCards;
    @OneToMany
    @JoinColumn(name = "venueId", referencedColumnName = "venueId", nullable = false, insertable = false)
    private List<Show> shows;
    @OneToOne
    @JoinColumn(name = "ownerId", referencedColumnName = "venueId", nullable = false, insertable = false)
    private WebListing webListing;

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
        Venue venue = (Venue) o;
        return Objects.equals(venueId, venue.venueId) && Objects.equals(name, venue.name) && Objects.equals(dateOpened, venue.dateOpened) && Objects.equals(dateClosed, venue.dateClosed) && Objects.equals(address, venue.address) && Objects.equals(contactCards, venue.contactCards) && Objects.equals(shows, venue.shows) && Objects.equals(webListing, venue.webListing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, name, dateOpened, dateClosed, address, contactCards, shows, webListing);
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", name='" + name + '\'' +
                ", dateOpened=" + dateOpened +
                ", dateClosed=" + dateClosed +
                ", address=" + address +
                ", contactCards=" + contactCards +
                ", shows=" + shows +
                ", webListing=" + webListing +
                '}';
    }
}
