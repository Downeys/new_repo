package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer artistId;
    private String bandName;
    @OneToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<Genre> genres;
    @OneToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<BandMember> bandMembers;
    private Integer hometownId;
    @ManyToOne
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private Hometown hometown;
    @OneToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<Album> albums;
    private LocalDate dateBandFormed;
    private LocalDate dateBandBrokeUp;
    @OneToOne
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private WebListing webListing;

    public Artist(){}

    public Artist(String bandName) {
        this.bandName = bandName;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<BandMember> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<BandMember> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public Hometown getHometown() {
        return hometown;
    }

    public void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }

    public List<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(List<Album> albums) {
        this.albums = albums;
    }

    public LocalDate getDateBandFormed() {
        return dateBandFormed;
    }

    public void setDateBandFormed(LocalDate dateBandFormed) {
        this.dateBandFormed = dateBandFormed;
    }

    public LocalDate getDateBandBrokeUp() {
        return dateBandBrokeUp;
    }

    public void setDateBandBrokeUp(LocalDate dateBandBrokeUp) {
        this.dateBandBrokeUp = dateBandBrokeUp;
    }

    public WebListing getWebListing() {
        return webListing;
    }

    public void setWebListing(WebListing webListing) {
        this.webListing = webListing;
    }

}
