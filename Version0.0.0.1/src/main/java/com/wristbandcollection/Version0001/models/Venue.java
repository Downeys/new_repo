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

    @OneToMany(mappedBy = "venue") //checked
    private List<ContactCard> contactCards;

    @OneToMany(mappedBy = "venue") //checked
    private List<Show> shows;

    @OneToOne//checked
    @JoinColumn(name = "addressId", referencedColumnName = "addressId", nullable = false, insertable = false)
    private Address address;

    @OneToOne //checked
    @JoinColumn(name = "websiteListingId", referencedColumnName = "websiteListingId", nullable = false, insertable = false)
    private WebListing webListing;

    public Venue(){}

    public Venue(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Venue venue = (Venue) o;
        return Objects.equals(venueId, venue.venueId) && Objects.equals(name, venue.name) && Objects.equals(dateOpened, venue.dateOpened) && Objects.equals(dateClosed, venue.dateClosed) && Objects.equals(contactCards, venue.contactCards) && Objects.equals(shows, venue.shows) && Objects.equals(address, venue.address) && Objects.equals(webListing, venue.webListing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(venueId, name, dateOpened, dateClosed, contactCards, shows, address, webListing);
    }

    @Override
    public String toString() {
        return "Venue{" +
                "venueId=" + venueId +
                ", name='" + name + '\'' +
                ", dateOpened=" + dateOpened +
                ", dateClosed=" + dateClosed +
                ", contactCards=" + contactCards +
                ", shows=" + shows +
                ", address=" + address +
                ", webListing=" + webListing +
                '}';
    }
}
