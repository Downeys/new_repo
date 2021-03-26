package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "artist")
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer artistId;
    private String bandName;
    private LocalDate dateBandFormed;
    private LocalDate dateBandBrokeUp;

    @ManyToMany(mappedBy = "lineup") //checked
    private List<Show> shows;

    @ManyToMany //checked
    @JoinTable(
            name = "band_member_lineup",
            joinColumns = @JoinColumn(name = "artistId"),
            inverseJoinColumns = @JoinColumn(name = "bandMemberId")
    )
    private List<BandMember> bandMembers;

    @ManyToMany //checked
    @JoinTable(
            name = "artist_genre",
            joinColumns = @JoinColumn(name = "artistId"),
            inverseJoinColumns = @JoinColumn(name = "genreId")
    )
    private List<Genre> genres;

    @ManyToOne //checked
    @JoinColumn(name = "hometownId", referencedColumnName = "hometownId")
    private Hometown hometown;

    @OneToMany(mappedBy = "artist") //checked
    private List<Album> albums;

    @OneToOne //checked
    @JoinColumn(name = "websiteListingId", referencedColumnName = "websiteListingId")
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

    public List<Show> getShows() {
        return shows;
    }

    public void setShows(List<Show> shows) {
        this.shows = shows;
    }

    public List<BandMember> getBandMembers() {
        return bandMembers;
    }

    public void setBandMembers(List<BandMember> bandMembers) {
        this.bandMembers = bandMembers;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
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
        Artist artist = (Artist) o;
        return Objects.equals(artistId, artist.artistId) && Objects.equals(bandName, artist.bandName) && Objects.equals(dateBandFormed, artist.dateBandFormed) && Objects.equals(dateBandBrokeUp, artist.dateBandBrokeUp) && Objects.equals(shows, artist.shows) && Objects.equals(bandMembers, artist.bandMembers) && Objects.equals(genres, artist.genres) && Objects.equals(hometown, artist.hometown) && Objects.equals(albums, artist.albums) && Objects.equals(webListing, artist.webListing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, bandName, dateBandFormed, dateBandBrokeUp, shows, bandMembers, genres, hometown, albums, webListing);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", bandName='" + bandName + '\'' +
                ", dateBandFormed=" + dateBandFormed +
                ", dateBandBrokeUp=" + dateBandBrokeUp +
                ", shows=" + shows +
                ", bandMembers=" + bandMembers +
                ", genres=" + genres +
                ", hometown=" + hometown +
                ", albums=" + albums +
                ", webListing=" + webListing +
                '}';
    }
}
