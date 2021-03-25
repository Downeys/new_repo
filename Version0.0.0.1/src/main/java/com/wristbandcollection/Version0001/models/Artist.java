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
    private Integer bandMemberId;
    private String bandName;
    private LocalDate dateBandFormed;
    private LocalDate dateBandBrokeUp;
    @ManyToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<BandMember> bandMembers;
    @ManyToOne
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private Hometown hometown;
    @OneToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<Album> albums;
    @OneToOne
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private WebListing webListing;
    @ManyToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<BandOnShowLineUp> shows;
    @OneToMany
    @JoinColumn(name = "artistId", referencedColumnName = "artistId", nullable = false, updatable = false)
    private List<ArtistGenre> genres;

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

    public Integer getBandMemberId() {
        return bandMemberId;
    }

    public void setBandMemberId(Integer bandMemberId) {
        this.bandMemberId = bandMemberId;
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

    public WebListing getWebListing() {
        return webListing;
    }

    public void setWebListing(WebListing webListing) {
        this.webListing = webListing;
    }

    public List<BandOnShowLineUp> getShows() {
        return shows;
    }

    public void setShows(List<BandOnShowLineUp> shows) {
        this.shows = shows;
    }

    public List<ArtistGenre> getGenres() {
        return genres;
    }

    public void setGenres(List<ArtistGenre> genres) {
        this.genres = genres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artist artist = (Artist) o;
        return Objects.equals(artistId, artist.artistId) && Objects.equals(bandMemberId, artist.bandMemberId) && Objects.equals(bandName, artist.bandName) && Objects.equals(dateBandFormed, artist.dateBandFormed) && Objects.equals(dateBandBrokeUp, artist.dateBandBrokeUp) && Objects.equals(bandMembers, artist.bandMembers) && Objects.equals(hometown, artist.hometown) && Objects.equals(albums, artist.albums) && Objects.equals(webListing, artist.webListing) && Objects.equals(shows, artist.shows) && Objects.equals(genres, artist.genres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(artistId, bandMemberId, bandName, dateBandFormed, dateBandBrokeUp, bandMembers, hometown, albums, webListing, shows, genres);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "artistId=" + artistId +
                ", bandMemberId=" + bandMemberId +
                ", bandName='" + bandName + '\'' +
                ", dateBandFormed=" + dateBandFormed +
                ", dateBandBrokeUp=" + dateBandBrokeUp +
                ", bandMembers=" + bandMembers +
                ", hometown=" + hometown +
                ", albums=" + albums +
                ", webListing=" + webListing +
                ", shows=" + shows +
                ", genres=" + genres +
                '}';
    }
}
