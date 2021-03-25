package com.wristbandcollection.Version0001.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Table(name = "album")
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer albumId;
    private Integer studioId; //foreign key
    private Integer artistId; //foreign key
    private LocalDate releaseDate;
    private String albumTitle;
    @OneToMany
    @JoinColumn(name = "albumId", referencedColumnName = "albumId", nullable = false, insertable = false)
    private List<Song> trackList;
    private BigDecimal price;

    public Integer getAlbumId() {
        return albumId;
    }

    public void setAlbumId(Integer albumId) {
        this.albumId = albumId;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public void setAlbumTitle(String albumTitle) {
        this.albumTitle = albumTitle;
    }

    public List<Song> getTrackList() {
        return trackList;
    }

    public void setTrackList(List<Song> trackList) {
        this.trackList = trackList;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStudioId() {
        return studioId;
    }

    public void setStudioId(Integer studioId) {
        this.studioId = studioId;
    }

    public Integer getArtistId() {
        return artistId;
    }

    public void setArtistId(Integer artistId) {
        this.artistId = artistId;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumId, album.albumId) && Objects.equals(studioId, album.studioId) && Objects.equals(artistId, album.artistId) && Objects.equals(releaseDate, album.releaseDate) && Objects.equals(albumTitle, album.albumTitle) && Objects.equals(trackList, album.trackList) && Objects.equals(price, album.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumId, studioId, artistId, releaseDate, albumTitle, trackList, price);
    }

    @Override
    public String toString() {
        return "Album{" +
                "albumId=" + albumId +
                ", studioId=" + studioId +
                ", artistId=" + artistId +
                ", releaseDate=" + releaseDate +
                ", albumTitle='" + albumTitle + '\'' +
                ", trackList=" + trackList +
                ", price=" + price +
                '}';
    }
}
